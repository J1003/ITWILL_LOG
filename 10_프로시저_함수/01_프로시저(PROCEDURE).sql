--PL/SQL 프로시저(PROCEDURE) - 오라클
-- PL/SQL에서는 변수값을 따로 저장해줘야 함

-- SYSTEM 유저에서 설정
SET SERVEROUTPUT ON; -- 서버쪽 출력화면을 볼 수 있게 설정

DECLARE -- 변수선언
    V_EMPID NUMBER(10); -- 변수명 변수데이터타입 (크기)
    V_NAME VARCHAR(30);
BEGIN -- 실행문 작성영역(시작)
    V_EMPID := 100;
    V_NAME := '홍길동';
    
    -- 화면출력
    DBMS_OUTPUT.PUT_LINE('HELLO PROCEDURE');
    DBMS_OUTPUT.PUT_LINE(V_EMPID || ':' || V_NAME);
    
END; -- 실행문 작성영역(끝)

------------------------
-- BOOK 테이블 데이터를 화면 출력
DECLARE
    V_BOOKID NUMBER(2); 
    V_BOOKNAME VARCHAR2(40);
    V_PUBLISHER VARCHAR2(40);
    V_PRICE NUMBER(8);
BEGIN
    -- PL/SQL에서는 변수값을 따로 저장해줘야 함
    -- < SELECT ~ INTO ~ FROM > 형태로 DB데이터 선택하고 INTO절 변수에 저장
    -- 1개의 데이터만 처리 가능
    SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
    INTO V_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE
    FROM BOOK 
    WHERE BOOKID = 1;
    
    DBMS_OUTPUT.put_line(V_BOOKID ||','|| V_BOOKNAME ||','|| 
            V_PUBLISHER ||','|| V_PRICE);
END;
--========================
/* 저장 프로시저(stored procedure)
매개변수(파라미터, parameter) 유형
- IN : 입력을 받기만 하는 변수형태(기본값)
- OUT : 출력만 하는 변수형탱
        (값을 전달 받을 수 없고, 프로시저 실행 후 저장된 값을 호출한 곳으로 전달)
- IN OUT : 입력도 받고, 값을 변수를 통해 호출한 곳으로 전달(출력)

< 프로시저(PROCEDURE) 생성 방법 >
방법1 : 프로시저에서 마우스 우측 클릭해서 생성
방법2 : CREATE OR REPLACE로 직접 작성해서 프로시저 생성
*******************/
CREATE OR REPLACE PROCEDURE BOOK_DISP -- 프로시저 선언부
-- 매개변수 선언부 : ( ) 소괄호 안에 작성, 타입만 지정(크기지정X), 여러개면 구분문자 콤바(,) 사용
(
    IN_BOOKID IN NUMBER
)
AS -- 변수선언부(AS 또는 IS ~ BEGIN 문 사이) 
    V_BOOKID NUMBER(2); 
    V_BOOKNAME VARCHAR2(40);
    V_PUBLISHER VARCHAR2(40);
    V_PRICE NUMBER(8);
BEGIN
    SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
    INTO V_BOOKID, V_BOOKNAME, V_PUBLISHER, V_PRICE
    FROM BOOK 
    WHERE BOOKID = IN_BOOKID; -- 매개변수값 입력
    
    DBMS_OUTPUT.put_line(V_BOOKID ||','|| V_BOOKNAME ||','|| 
            V_PUBLISHER ||','|| V_PRICE);
END;
------------------------
-- 프로시저(PROCEDURE) 실행 : EXECUTE 프로시저명
EXECUTE BOOK_DISP(5);
EXEC BOOK_DISP(10);

-- 프로시저(PROCEDURE) 삭제 : DROP
DROP PROCEDURE BOOK_DISP;

--==================================
/* (실습) 프로시저 작성하고 실행하기

고객테이블(CUSTOMER)에 있는 데이터 조회 프로시저 작성
- 프로시저명 : CUSTOMER_DISP
- 입력받는 값 : 고객ID
- 처리 : 입력받은 고객ID에 해당하는 데이터를 찾아서 화면 출력
- 출력항목 : 고객ID, 고객명, 주소, 전화번호

*************/

-- AS랑 BEGIN문 안에 원래 이런식으로 작성하지만 데이터값이 변할 때 %TYPE 으로 작성해주면
-- 직접 바꿀 필요 없이 사용할 수 있다.
/* AS
      C_CUSTID NUMBER(2);
      C_NAME VARCHAR2(40);
      C_ADDRESS VARCHAR2(50);
      C_PHONE VARCHAR2(20);
   
   BEGIN  */

CREATE OR REPLACE PROCEDURE CUSTOMER_DISP (
    IN_CUSTID IN NUMBER 
) AS 
    -- %TYPE
    V_CUSTID CUSTOMER.CUSTID%TYPE;
    V_NAME CUSTOMER.NAME%TYPE;
    V_ADDRESS CUSTOMER.ADDRESS%TYPE;
    V_PHONE CUSTOMER.PHONE%TYPE;
BEGIN
    SELECT CUSTID, NAME, ADDRESS, PHONE
    INTO V_CUSTID, V_NAME, V_ADDRESS, V_PHONE
    FROM CUSTOMER
    WHERE CUSTID = IN_CUSTID;
    
    DBMS_OUTPUT.PUT_LINE(V_CUSTID ||','|| V_NAME ||','|| 
            V_ADDRESS ||','|| V_PHONE);
END CUSTOMER_DISP;

EXECUTE CUSTOMER_DISP(3);
EXEC CUSTOMER_DISP(5);
