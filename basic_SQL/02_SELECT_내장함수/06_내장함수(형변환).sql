/************************************************
형변환 내장함수
TO_CHAR : 문자타입으로 전환(날짜 -> 문자, 숫자 -> 문자)
TO_NUMBER : 숫자타입으로 전환(문자 -> 숫자)
TO_DATE : 날짜타입으로 전환(문자 -> 날짜)

      <- TO_NUMBER(문자)  -> TO_DATE(문자)
숫자형   ----    문자형   ----     날짜형
      -> TO_CHAR(숫자)   <- TO_CHAR(날짜)
************************************************
--날짜 -> 문자
TO_CHAR(날짜데이터, '출력형식')
<출력형식>
년도(YYYY, YY), 월(MM), 일(DD)
시간 : HH, HH12(12 시간제), HH24(24 시간제)
분(MI), 초(SS)
오전, 오후: AM, PM
년월일시분초 작성예) YYYY-MM-DD HH24:MI:SS
************************************************/

-- TO_CHAR : 문자타입으로 전환 (날짜 -> 문자, 숫자 -> 문자)
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DY') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD(DY)') FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD AM HH24:MI:SS') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD PM HH24:MI:SS') FROM DUAL;

--==============================
/* TO_CHAR(숫자, '출력형식') : 숫자 -> 문자타입
<형식지정>
0(영) : 자리수를 나타내며, 자리수가 맞지 않는 경우 0을 표시
9(구) : 자리수를 나타내며, 자리수가 맞지 않는 경우 표시하지 않음
L : 지역 통화 문자 표시
.(점) : 소수점
,(콤마) : 1000단위 구분 표시 문자
**************************************/

SELECT 123000, TO_CHAR(123000), 123000 FROM DUAL;
SELECT 123000 + 9, TO_CHAR(123000) + 9 FROM DUAL; -- '123000' + 9 : 123009
                         -- > 원래 문자랑 숫자 계산 안 되는데 오라클에서 자동형변환
SELECT '123000' + 9 FROM DUAL; --자동형변환(문자 ---> 숫자) 후 덧셈연산
SELECT '123ABC' + 9 FROM DUAL; -- ORA-01722: invalid number

-- 묵시적(자동)형변환, 명시적 형변환
SELECT '123000' + 9, TO_NUMBER('123000') + 9 FROM DUAL; -- 문자열을 숫자 타입으로
--------------
SELECT TO_CHAR(123456, 'L999,999,999') FROM DUAL; -- ￦123,456
SELECT TO_CHAR(123456, 'L000,000,000') FROM DUAL; -- ￦000,123,456

--                          ￦0            ￦000,000,000
SELECT TO_CHAR(0, 'L999,999,999'), TO_CHAR(0, 'L000,000,000') FROM DUAL; 
SELECT TO_CHAR(1230.5, 'L999,999,999'), TO_CHAR(1230.5, 'L000,000,000') FROM DUAL;
SELECT TO_CHAR(1230.5555, 'L999,999,999.99'), TO_CHAR(1230.5555, 'L000,000,000.00') FROM DUAL;
SELECT TO_CHAR(1230, 'L999,999,999.99'), TO_CHAR(1230, 'L000,000,000.00') FROM DUAL;
------------------
-- TO_DATE(문자열, 형식문자) ---> 날짜타입
SELECT '2023-08-09', SYSDATE FROM DUAL;
SELECT '2023-08-09' + 1 FROM DUAL; -- : ORA-01722: invalid number, 오류발생
SELECT SYSDATE + 1 FROM DUAL;
SELECT TO_DATE('2023-08-09') + 1 FROM DUAL; -- 날짜타입 형변환하면 날짜연산 가능
-- (주의) 날짜타입으로 형변환시에는 형식지정문자를 반드시 사용하기를 권장
SELECT TO_DATE('2023-08-09', 'YYYY-MM-DD') + 1 FROM DUAL;
SELECT TO_DATE('20230809', 'YYYY-MM-DD') + 1 FROM DUAL;

SELECT ORDERID, ORDERDATE, 
       TO_CHAR(ORDERDATE, 'YYYY-MM-DD HH24:MI:SS')
FROM ORDERS;
------------
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
       TO_CHAR(TRUNC(SYSDATE), 'YYYY-MM-DD HH24:MI:SS'),
       TO_CHAR(SYSDATE, 'YYYY-MM-DD')
FROM DUAL;

--=======================================================
-- (실습) 첨부된 그림 참고!

SELECT ABS(-15) FROM DUAL; 
// 15
SELECT CEIL(15.7) FROM DUAL; 
// 16
SELECT COS(3.14159) FROM DUAL; 
// -0.99999999999647923060461239250850048324
SELECT FLOOR(15.7) FROM DUAL; 
// 15
SELECT LOG(10,100) FROM DUAL;
// 2
SELECT MOD(11,4) FROM DUAL; 
// 3
SELECT POWER(3,2) FROM DUAL; 
// 9
SELECT ROUND(15.7) FROM DUAL; 
// 16
SELECT SIGN(-15) FROM DUAL; 
// -1
SELECT TRUNC(15.7) FROM DUAL; 
// 15
SELECT CHR(67) FROM DUAL; 
// C
SELECT CONCAT('HAPPY ', 'Birthday') FROM DUAL; 
// HAPPY Birthday
SELECT LOWER('Birthday') FROM DUAL; 
// birthday
SELECT LPAD('Page 1', 15, '*.') FROM DUAL; 
// *.*.*.*.*Page 1
SELECT LTRIM('Page 1', 'ae') FROM DUAL; 
// Page 1
SELECT REPLACE('JACK', 'J', 'BL') FROM DUAL; 
// BLACK
SELECT RPAD('Page 1', 15, '*.') FROM DUAL; 
// Page 1*.*.*.*.*



SELECT SUBSTR('ABCDEFG', 3, 4) FROM DUAL; 
// CDEF
SELECT TRIM(LEADING 0 FROM '00AA00') FROM DUAL; 
// AA00
SELECT UPPER('Birthday') FROM DUAL; 
// BIRTHDAY
SELECT TO_CHAR(ASCII('A')) FROM DUAL; 
// 65
SELECT INSTR('CORPORATE FLOOR', 'OR', 3, 2) FROM DUAL; 
// 14
SELECT LENGTH('Birthday') FROM DUAL; 
// 8
SELECT ADD_MONTHS('14/05/21', 1) FROM DUAL; 
// 0014/06/21
SELECT LAST_DAY(SYSDATE) FROM DUAL; 
// 2023/08/31
SELECT NEXT_DAY(SYSDATE,'화') FROM DUAL; 
// 2023/08/15
SELECT ROUND(SYSDATE) FROM DUAL; 
// 2023/08/10
SELECT SYSDATE FROM DUAL; 
// 2023/08/09
SELECT TO_CHAR(SYSDATE) FROM DUAL; 
// 2023/08/09
SELECT TO_CHAR(123) FROM DUAL; 
// 123
SELECT TO_DATE('12 05 2014', 'DD MM YYYY') FROM DUAL; 
// 2014/05/12
SELECT TO_NUMBER('12.3') FROM DUAL; 
// 12.3
SELECT DECODE(1,1,'aa','bb') FROM DUAL; 
// aa
SELECT NULLIF(123, 345) FROM DUAL; 
// 123

