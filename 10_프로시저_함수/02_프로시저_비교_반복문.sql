/* 비교구문(분기처리) IF 문
IF (조건식) THEN ~ END IF;
IF (조건식) THEN ~ ELSE ~ END IF;
IF (조건식) THEN ~ ELSIF ~ ELSIF ~ ELSE END IF;
*********************/

-- 홀수, 짝수 판별 
CREATE OR REPLACE PROCEDURE PRC_IF (
    IN_NUM IN NUMBER
) AS 
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
END;


-- (참고) 
create or replace PROCEDURE PRC_IF (
    IN_NUM IN NUMBER
) AS 
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    DBMS_OUTPUT.PUT_LINE('2로 나눈 나머지 값 : ' || MOD(IN_NUM, 2));
    
    -- 홀, 짝 판별
    -- 나머지를 구할 때는 MOD 내장함수를 쓴다!
    IF (MOD(IN_NUM, 2) = 0) THEN -- 2로 나눈 나머지 값이 짝수냐? 그러면~
        DBMS_OUTPUT.PUT_LINE(IN_NUM || ' : 짝수');
    ELSE
        DBMS_OUTPUT.PUT_LINE(IN_NUM || ' : 홀수');
    END IF; -- END IF; 없으면 오류!
END;
------------------
-- 4로 나눈 나머지 값 확인
CREATE OR REPLACE PROCEDURE PRC_IF2 (
    IN_NUM IN NUMBER
) AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 값 : ' || MOD(IN_NUM, 2));
END;


-- (참고)
-- IF ~ ELSIF ~ ELSIF ~ ELSE ~ END IF
create or replace PROCEDURE PRC_IF2 (
    IN_NUM IN NUMBER
) AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    -- (확인용) DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 값 : ' || MOD(IN_NUM, 2)); 
    -- 4로 나눈 나머지 값 확인
    IF (MOD(IN_NUM, 4) = 0) THEN
        DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 0');
        ELSIF (MOD(IN_NUM, 4) = 1) THEN
            DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 1');
        ELSIF (MOD(IN_NUM, 4) = 2) THEN
            DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 2');    
        ELSE 
            DBMS_OUTPUT.PUT_LINE('4로 나눈 나머지 3');
        END IF;
END;

--==========================
-- 반복문 : FOR, WHILE
-- FOR 변수 IN 시작값 ..최종값 LOOP ~ END LOOP
----------------
-- 숫자(N) 하나를 입력받아서 합계 출력(1~N 까지의 합)
CREATE OR REPLACE PROCEDURE PRC_FOR_SUM (
    IN_NUM IN NUMBER
) AS
    V_SUM NUMBER := 0; -- 합계 저장할 변수 선언(변수 선언과 동시에 초기값 설정)
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    
    -- FOR 변수 IN 시작값 ..최종값 LOOP ~ END LOOP
    -- 입력받은 숫자까지의 합계 구하기
    FOR I IN 1 .. IN_NUM LOOP  -- I 변수값이 1 .. 3 을 주면 1부터 3까지 증감
        V_SUM := V_SUM + I; -- 변수 선언해야 한다! (BEGIN END 영역에서는 선언 X)
        DBMS_OUTPUT.PUT_LINE('>> I : ' || I);
    END LOOP;
        
    DBMS_OUTPUT.PUT_LINE('::: 1부터 '|| IN_NUM || '까지의 합계 : '|| V_SUM);
END;
-------------------
-- FOR문 REVERSE 옵션 사용(최종값에서 시작(초기)값으로 반복인자 변경)
create or replace PROCEDURE PRC_FOR_REVERSE AS
BEGIN
    FOR I IN REVERSE 1 .. 10 LOOP  
        DBMS_OUTPUT.PUT_LINE('>> I : ' || I);
    END LOOP;
END;

--=============================
-- WHILE 문
-- WHILE (조건식) LOOP ~ END LOOP;
----------------
CREATE OR REPLACE PROCEDURE PRC_FOR_SUM (
    IN_NUM IN NUMBER
) AS
    V_SUM NUMBER := 0; --합계 저장할 변수 선언(초기값 0 설정)
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    
    --입력받은 숫자까지의 합계 구하기
    -- FOR 변수 IN 시작값 .. 최종값 LOOP ~ END LOOP
    FOR I IN 1 .. IN_NUM LOOP
        V_SUM := V_SUM + I;
        DBMS_OUTPUT.PUT_LINE('>> I : ' || I);
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('::: 1부터 '|| IN_NUM || '까지의 합계 : '|| V_SUM);
END;

--========================
/* LOOP ~ END LOOP; -- 무한반복
LOOP
    EXIT WHEN (조건식);
END LOOP;
*****************/
-- WHILE 문 & LOOP 문의 차이점? -> LOOP문은 빠져나갈 구문이 있음!
CREATE OR REPLACE PROCEDURE LOOP1 
AS
    I NUMBER(3) := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('I : ' || I);
        
        EXIT WHEN (I >= 10);
        I := I + 1;
    END LOOP;
END LOOP1;

--======================
/* 
(실습) 숫자를 하나 입력 받아서 1 ~ 숫자까지의 합계 구하기
      프로시저명 : PRC_SUM_EVENODD
      -- 입력값이 홀수면 홀수값만 더하고
      -- 입력값이 짝수면 짝수값만 더해서
        최종 합계값을 화면에 출력
      <출력형태>
      -- 입력숫자: 입력값, 홀수/짝수, 합계 : 합계결과
      출력예) 입력숫자 : 4, 짝수, 합계 : 6
      출력예) 입력숫자 : 5, 홀수, 합계 : 9
*/

-- 풀이1
CREATE OR REPLACE PROCEDURE PRC_SUM_EVENODD(
    IN_NUM IN NUMBER
) AS
    V_SUM NUMBER := 0;
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    IF (MOD(IN_NUM, 2) = 0) THEN -- 2로 나눈 나머지 값이 짝수냐? 그러면~
            
    FOR I IN 1 .. IN_NUM LOOP
            IF (MOD(I, 2) = 0) THEN -- IN_NUM 아님 짝수인지 홀수인지 모르니까
            V_SUM := V_SUM + I;
            END IF;
            END LOOP;
            DBMS_OUTPUT.PUT_LINE('짝수, '|| IN_NUM || '합계 : '|| V_SUM);
        ELSE -- 입력값이 홀수인 경우
            FOR I IN 1 .. IN_NUM LOOP
            IF (MOD(I, 2) = 1) THEN
            V_SUM := V_SUM + I;
            END IF;
            END LOOP;
            DBMS_OUTPUT.PUT_LINE('홀수, '|| IN_NUM || '합계 : '|| V_SUM);
        END IF;
END PRC_SUM_EVENODD;
------------------------------
-- 풀이2
CREATE OR REPLACE PROCEDURE PRC_SUM_EVENODD_2 (
    IN_NUM IN NUMBER
) AS
    V_SUM NUMBER := 0;
BEGIN
    DBMS_OUTPUT.PUT_LINE('>>입력값 : ' || IN_NUM);
    FOR I IN 1 .. IN_NUM LOOP
    IF (MOD(IN_NUM, 2) = 0) THEN -- 2로 나눈 나머지 값이 짝수냐? 그러면~        
            IF (MOD(I, 2) = 0) THEN -- IN_NUM 아님 짝수인지 홀수인지 모르니까
                V_SUM := V_SUM + I;   
                END IF;
            ELSE -- 입력값이 홀수인 경우
                IF (MOD(I, 2) = 1) THEN
                    V_SUM := V_SUM + I;  
                END IF;
            END IF;
        END LOOP;  
    
    IF (MOD(IN_NUM, 2) = 0) THEN      
        DBMS_OUTPUT.PUT_LINE('짝수, '|| IN_NUM || '합계 : '|| V_SUM);
    ELSE
        DBMS_OUTPUT.PUT_LINE('홀수, '|| IN_NUM || '합계 : '|| V_SUM);
    END IF;
    
END PRC_SUM_EVENODD_2;



