-- (번외) 고객 중 한 권도 구입 안 한 사람은 누구??
------ 고객테이블에는 있는데, 주문(판매) 테이블에 없는 사람

-- (방법1) MINUS : 차집합 처리
----고객테이블에는 있는데, 주문(판매) 테이블에 없는 사람
SELECT CUSTID FROM CUSTOMER -- 1,2,3,4,5
MINUS
SELECT CUSTID FROM ORDERS; --1,1,2,3,4,1, ....
------
-- (방법2) 서브쿼리(SUB QUERY)
SELECT *
FROM CUSTOMER
WHERE CUSTID NOT IN (SELECT CUSTID FROM ORDERS)
;
------
-- (방법3) 외부조인(OUTER JOIN)
-- 고객 중 한번도 구입내역이 없는 고객 명단 구하기
SELECT C.CUSTID, C.NAME, C.PHONE, C.ADDRESS
--       O.ORDERID, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID(+) -- 조인조건(LEFT OUTER JOIN)
AND O.ORDERID IS NULL -- 찾을(검색/선택)조건
;
-- (방법4) 표준 SQL(LEFT OUTER JOIN)
SELECT C.CUSTID, C.NAME, C.PHONE, C.ADDRESS
--       O.ORDERID, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C LEFT OUTER JOIN ORDERS O -- 좌측기준
     ON C.CUSTID = O.CUSTID
WHERE O.ORDERID IS NULL
;
-- (방법5) RIGHT OUTER JOIN
SELECT C.CUSTID, C.NAME, C.PHONE, C.ADDRESS
--       O.ORDERID, O.SALEPRICE, O.ORDERDATE
FROM ORDERS O RIGHT OUTER JOIN CUSTOMER C -- 우측기준
     ON O.CUSTID = C.CUSTID
WHERE O.ORDERID IS NULL
;
-- 외부조인(우측기준)
SELECT C.CUSTID, C.NAME, C.PHONE, C.ADDRESS,
       O.ORDERID, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE O.CUSTID(+) = C.CUSTID -- 부족한 부분에 +가 붙으면 없는 곳 기준이다. / 우측기준
AND O.ORDERID IS NULL                           --> + 부호가 부족한 부분에 붙는다.
;
--------------------------
-- 조인(JOIN, INNER JOIN, 내부조인) : 조인테이블 모두에 존재하는 데이터 검색
-- 외부조인(OUTER JOIN) : 어느 한 쪽에만 존재하는 데이터를 검색할 때 사용

-- INNER JOIN > LEFT OUTER JOIN & RIGHT OUTER JOIN > FULL OUTER JOIN 순으로 쓰임

-----------------
CREATE TABLE DEPT (
    ID VARCHAR2(10) PRIMARY KEY,
    NAME VARCHAR2(30)
);
INSERT INTO DEPT VALUES ('10', '총무부');
INSERT INTO DEPT VALUES ('20', '급여부');
INSERT INTO DEPT VALUES ('30', 'IT부');
COMMIT;

CREATE TABLE DEPT1 (
    ID VARCHAR2(10) PRIMARY KEY,
    NAME VARCHAR2(30)
);
INSERT INTO DEPT1 VALUES ('10', '총무부');
INSERT INTO DEPT1 VALUES ('20', '급여부');
COMMIT;

CREATE TABLE DEPT2 (
    ID VARCHAR2(10) PRIMARY KEY,
    NAME VARCHAR2(30)
);
INSERT INTO DEPT2 VALUES ('20', '급여부');
INSERT INTO DEPT2 VALUES ('30', 'IT부');
COMMIT;
--=====================
SELECT * FROM DEPT;
SELECT * FROM DEPT1;
SELECT * FROM DEPT2;
-- LEFT OUTER JOIN : 좌측 테이블 기준(모두표시)
-- OUTER를 쓰는 이유 : 어느 한쪽에만 있는 데이터를 찾기 위해
SELECT * 
   FROM DEPT D, DEPT1 D1
 WHERE D.ID = D1.ID(+)
;
-- RIGHT OUTER JOIN : 우측 테이블 기준(우측테이블 데이터 모두 표시)
-- OUTER를 쓰는 이유 : 어느 한쪽에만 있는 데이터를 찾기 위해
SELECT *
  FROM DEPT2 D2, DEPT D
 WHERE D2.ID(+) = D.ID
; 
-- FULL OUTER JOIN(표준SQL)
SELECT * 
  FROM DEPT1 D1 FULL OUTER JOIN DEPT2 D2
       ON D1.ID = D2.ID
ORDER BY D1.ID
;
---------------------------
-- (실습) DEPT1, DEPT2 테이블 사용해서
-- 1. DEPT1 에는 있고, DEPT2에는 없는 데이터 찾기(LEFT OUTER JOIN)
-- 2. DEPT2 에는 있고, DPET1에는 없는 데이터 찾기(RIGHT OUTER JOIN)
--------------

-- 1. DEPT1 에는 있고, DEPT2에는 없는 데이터 찾기(LEFT OUTER JOIN)
SELECT * FROM DEPT1
MINUS
SELECT * FROM DEPT2;

SELECT *
  FROM DEPT1 D1, DEPT2 D2
 WHERE D1.ID = D2.ID(+)
;
-- 표준 SQL 풀이
SELECT D1.*
FROM DEPT1 D1 LEFT OUTER JOIN DEPT2 D2 -- 조인테이블 + 조인방식(우측기준)
     ON D1.ID = D2.ID -- 조인조건(좌측기준)
WHERE D2.ID IS NULL -- 찾을조건(검색조건)
;
--------------
-- 2. DEPT2 에는 있고, DPET1에는 없는 데이터 찾기(RIGHT OUTER JOIN)
SELECT * FROM DEPT2
MINUS
SELECT * FROM DEPT1;

SELECT *
  FROM DEPT2 D2, DEPT1 D1
 WHERE D2.ID = D1.ID(+)
;
-- 표준 SQL 풀이
SELECT D2.*
FROM DEPT1 D1 RIGHT OUTER JOIN DEPT2 D2 -- 조인테이블 + 조인방식(우측기준)
     ON D1.ID = D2.ID -- 조인조건(좌측기준)
WHERE D1.ID IS NULL -- 찾을조건(검색조건)
;
----------------------
