/* ** 실습문제 : HR유저(DB)에서 요구사항 해결 **********
< EMPLOYEES 테이블만 사용해서 실습>
--1) 사번(employee_id)이 100인 직원 정보 전체 보기
--2) 월급(salary)이 15000 이상인 직원의 모든 정보 보기
--3) 월급이 15000 이상인 사원의 사번, 이름(LAST_NAME), 입사일(hire_date), 월급여 정보 보기
--4) 월급이 10000 이하인 사원의 사번, 이름(LAST_NAME), 입사일, 월급여 정보 보기
---- (급여가 많은 사람부터)
--5) 이름(first_name)이 john인 사원의 모든 정보 조회
--6) 이름(first_name)이 john인 사원은 몇 명인가?
--7) 2008년에 입사한 사원의 사번, 성명('first_name last_name'), 월급여 정보 조회
---- 성명 출력예) 'Steven King'
--8) 월급여가 20000~30000 구간인 직원 사번, 성명(last_name first_name), 월급여 정보 조회
--9) 관리자ID(MANAGER_ID)가 없는 사람 정보 조회
--10) 직종(job_id)코드 'IT_PROG'에서 가장 많은 월급여는 얼마
---------------------------------
--11) 직종별 최대 월급여 검색
--12) 직종별 최대 월급여 검색하고, 최대 월급여가 10000이상인 직종 조회
--13) 직종별 평균급여 이상인 직원 조회
*****************************/

--1) 사번(employee_id)이 100인 직원 정보 전체 보기
SELECT *
FROM EMPLOYEES 
WHERE EMPLOYEE_ID = 100
;

--2) 월급(salary)이 15000 이상인 직원의 모든 정보 보기
SELECT *
FROM EMPLOYEES 
WHERE SALARY >= 15000
;

--3) 월급이 15000 이상인 사원의 사번, 이름(LAST_NAME), 입사일(hire_date), 월급여 정보 보기
SELECT EMPLOYEE_ID, LAST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES 
WHERE SALARY >= 15000
;

--4) 월급이 10000 이하인 사원의 사번, 이름(LAST_NAME), 입사일, 월급여 정보 보기
---- (급여가 많은 사람부터)
SELECT EMPLOYEE_ID,LAST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES 
WHERE SALARY <= 10000
ORDER BY SALARY DESC
;

--5) 이름(first_name)이 john인 사원의 모든 정보 조회 
SELECT *
FROM EMPLOYEES 
WHERE LOWER(FIRST_NAME) LIKE 'john' --> ((주의)데이터는 대소문자를 구분한다!)
;
---- (참고)
SELECT FIRST_NAME, LOWER(FIRST_NAME), UPPER(FIRST_NAME), INITCAP(FIRST_NAME)
FROM EMPLOYEES
;

--6) 이름(first_name)이 john인 사원은 몇 명인가?
---- john, JOHN, John, .....
SELECT COUNT(*) AS CNT
FROM EMPLOYEES 
WHERE LOWER(FIRST_NAME) LIKE 'john' --> 이렇게 하면 답은 나오지만 
;
------> ** 선생님 답변 **
SELECT COUNT(*) AS CNT
FROM EMPLOYEES 
WHERE FIRST_NAME = INITCAP('john') -- 데이터가 표준화 된 경우 입력값을 동일한 형태로!
;


--7) 2008년에 입사한 사원의 사번, 성명('first_name last_name'), 월급여 정보 조회
---- 성명 출력예) 'Steven King'
SELECT EMPLOYEE_ID, CONCAT(FIRST_NAME, ' ' || LAST_NAME), SALARY
    FROM EMPLOYEES 
WHERE TO_CHAR(HIRE_DATE) LIKE '2008%'
;
------> ** 선생님 답변 **
-- 풀이1
SELECT EMPLOYEE_ID, CONCAT(FIRST_NAME, ' ' || LAST_NAME) AS NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN TO_DATE('2008/01/01', 'YYYY/MM/DD') 
                    AND TO_DATE('2008-12-31', 'YYYY-MM-DD') 
ORDER BY HIRE_DATE
;
-- 풀이2(년도만 이용해서 추출)
SELECT EMPLOYEE_ID, CONCAT(FIRST_NAME, ' ' || LAST_NAME) AS NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE TO_CHAR(HIRE_DATE, 'YYYY') = '2008'
ORDER BY HIRE_DATE
;


--8) 월급여가 20000~30000 구간인 직원 사번, 성명(last_name first_name), 월급여 정보 조회
SELECT EMPLOYEE_ID, CONCAT(FIRST_NAME, ' ' || LAST_NAME), SALARY       
FROM EMPLOYEES 
WHERE SALARY >= 20000 AND SALARY <= 30000
-- WHERE SALARY BETWEEN 20000 AND 30000
;
------> ** 선생님 답변 **
-- BETWEEN A AND B 사용
SELECT EMPLOYEE_ID, FIRST_NAME ||' '|| LAST_NAME AS NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE SALARY BETWEEN 20000 AND 30000
ORDER BY SALARY
;

--9) 관리자ID(MANAGER_ID)가 없는 사람 정보 조회
SELECT * FROM EMPLOYEES WHERE MANAGER_ID IS NULL; -- NULL인 사람

SELECT *FROM EMPLOYEES WHERE MANAGER_ID IS NOT NULL; -- MANAGER가 있는 사람

--10) 직종(job_id)코드 'IT_PROG'에서 가장 많은 월급여는 얼마
SELECT JOB_ID, MAX(SALARY)
FROM EMPLOYEES 
WHERE JOB_ID = 'IT_PROG'
GROUP BY JOB_ID
;
------> ** 선생님 답변 **
-- IT_PROG 직종 직원들 월급
SELECT EMPLOYEE_ID, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG'
ORDER BY SALARY DESC
;
-- IT_PROG 가장 많은 월급
SELECT 'IT_PROG', MAX(SALARY) AS MAX_SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG'
;

---------------------------------
--11) 직종별 최대 월급여 검색
SELECT JOB_ID, MAX(SALARY)
FROM EMPLOYEES 
GROUP BY JOB_ID
;
------> ** 선생님 답변 **
SELECT JOB_ID, COUNT(*), SUM(SALARY), AVG(SALARY), MIN(SALARY), MAX(SALARY) AS MAX_SALARY
FROM EMPLOYEES
GROUP BY JOB_ID
;


--12) 직종별 최대 월급여 검색하고, 최대 월급여가 10000이상인 직종 조회
SELECT JOB_ID, MAX(SALARY)
FROM EMPLOYEES 
WHERE SALARY >= 10000
GROUP BY JOB_ID
ORDER BY MAX(SALARY) DESC
;
-- 위치값, 별칭 등 이용해서 정렬할 수 있음!
-- 1)위치값 사용 정렬
SELECT JOB_ID, MAX(SALARY)
FROM EMPLOYEES 
WHERE SALARY >= 10000
GROUP BY JOB_ID
ORDER BY 2 DESC
;
-- 2)별칭 사용 정렬
SELECT JOB_ID, MAX(SALARY) AS MAX_SALARY
FROM EMPLOYEES 
WHERE SALARY >= 10000
GROUP BY JOB_ID
ORDER BY MAX_SALARY DESC
;
------> ** 선생님 답변 **
SELECT JOB_ID, MAX(SALARY) AS MAX_SALARY
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING MAX(SALARY) >= 10000
ORDER BY MAX(SALARY)
;

--13) 직종별 평균급여 이상인 직원 조회
SELECT E.JOB_ID, MAX(E.SALARY), AVG(E.SALARY)
FROM EMPLOYEES E
WHERE E.SALARY >= 6461
GROUP BY E.JOB_ID
;
SELECT AVG(SALARY) FROM EMPLOYEES; -- 회사평균급여

------> ** 선생님 답변 **
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
ORDER BY JOB_ID
;
-- 직종별 평균 급여
SELECT JOB_ID, AVG(SALARY) AVG_SALARY
FROM EMPLOYEES
GROUP BY JOB_ID
;
---- 조인(직원테이블 + 직종별 평균급여)
-- SQL문장 안에 SQL문장이 또 있음
SELECT E.EMPLOYEE_ID, E.FIRST_NAME, E.JOB_ID, E.SALARY
--       A.JOB_ID AS A_JOB_ID,  --> 중복값 때문에 별칭 사용해줘야 함!
     , A.AVG_SALARY    
FROM EMPLOYEES E,
     (SELECT JOB_ID, AVG(SALARY) AVG_SALARY
      FROM EMPLOYEES
      GROUP BY JOB_ID) A  -- 서브쿼리 : 가상테이블(인라인 뷰)
WHERE E.JOB_ID = A.JOB_ID -- 조인조건
      AND E.SALARY >= A.AVG_SALARY -- 검색(선택/찾을)조건
;


-- FROM 절의 서브쿼리
SELECT E.EMPLOYEE_ID, E.SALARY, J.*
FROM EMPLOYEES E,
     (SELECT JOB_ID, AVG(SALARY) AS AVG
      FROM EMPLOYEES
      GROUP BY JOB_ID
      )J -- 직종(직무)별 평균급여 테이블
WHERE E.JOB_ID = J.JOB_ID 
      AND E.SALARY >= J.AVG
;

-- <상관서브쿼리 방식으로 찾기>
-- 급여가 6461 이상인 직원 선택
SELECT *
FROM EMPLOYEES E
WHERE SALARY >= (6461) --()안에 (SELECT AVG(SALARY) FROM EMPLOYEES WHERE JOB_ID = E.JOB_ID) 들어가도 됨
ORDER BY SALARY
;
-- FROM WHERE SELECT 절에서 다 쓸 수 있음
-- 직무별 평균 급여보다 크거나 같은 급여를 받는 직원 선택
SELECT *
FROM EMPLOYEES E
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEES 
                 WHERE JOB_ID = E.JOB_ID)
;
