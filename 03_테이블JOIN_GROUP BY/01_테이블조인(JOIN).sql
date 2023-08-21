-- 테이블 조인(JOIN) : 2개 이상의 테이블 데이터를 연결해서 1개의 테이블인 것처럼 사용
SELECT * FROM CUSTOMER WHERE CUSTID = 1; -- 박지성
SELECT * FROM ORDERS WHERE CUSTID = 1;

-- CUSTOMER, ORDERS 테이블 데이터 동시 조회(검색)
-- (주의) SELECT절에 동일 컬럼명 2개가 올 수 없다. 별칭사용해서 다른이름으로 변경 처리
SELECT * 
FROM CUSTOMER, ORDERS -- 조인 대상 테이블(별칭 사용 안 한 경우)
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID -- 조인조건 
    AND CUSTOMER.NAME = '박지성' -- 선택조건(검색/찾을조건) / 이름이 박지성인 데이터만 추출
;
------------------------
-- 테이블별칭(alias) 사용 : 테이블명을 간단하게 사용하기
-- (주의) 테이블 별칭 사용시 테이블명 대신 반드시 별칭을 사용해야 한다!
-- 원래는 WHERE CUSTOMER.CUSTID = ORDERS.ORDERID 이건데 별칭으로 바꿔서 사용 
SELECT *
FROM CUSTOMER C, ORDERS O -- 조인테이블에 대한 별칭(alias) 사용
WHERE C.CUSTID = O.CUSTID -- 조인 조건 (별칭을 사용하면 별칭만 사용 가능)
AND C.NAME = '김연아'      -- 선택조건(검색조건) 
;                          
-- 표준 조인 쿼리문
-- < INNER JOIN 문 >
SELECT *         -- INNER JOIN에서 INNER 생략가능! JOIN 해도 디폴트는 INNER JOIN
    FROM CUSTOMER C INNER JOIN ORDERS O -- 조인테이블
        ON C.CUSTID = O.CUSTID          -- 조인조건
    WHERE C.NAME = '박지성'              -- 선택조건(검색조건)
;
------------------------
-- 판매된 책 목록 확인 (BOOK, ORDERS)
-- < BOOK 테이블 & ORDERS 테이블 JOIN 문 >
SELECT * FROM BOOK;
SELECT * FROM ORDERS;
-- 출판한 책 중 판매된 책 목록 (미디어로 끝나는 출판사)
SELECT O.ORDERID, O.BOOKID,  -- (주의) 동일한 컬럼명이 2번 선택(사용)될 수 없다.
       B.BOOKID AS B_BOOKID, -- BOOKID_1 이렇게 출력되니까 AS B_BOOKID로 명시해주자!
       B.BOOKNAME, B.PUBLISHER, B.PRICE, O.SALEPRICE, ORDERDATE
-- SELECT * 
FROM BOOK B, ORDERS O       -- 조인테이블
WHERE B.BOOKID = O.BOOKID   -- 조인조건
AND B.PUBLISHER LIKE '%미디어'
-- AND B.PUBLISHER = '굿스포츠'
ORDER BY B.PUBLISHER, B.BOOKNAME 
;
-- =====================

--(문제해결) 테이블 조인을 통해서 요청한 데이터 찾기
--실습 : '야구를 부탁해'라는 책이 팔린 내역을 확인(책제목, 판매금액, 판매일자)
--실습 : '야구를 부탁해'라는 책이 몇 권이 팔렸는지 확인
------
--실습 : '추신수'가 구입한 책값과 구입일자를 확인(책값, 구입일자)
--실습 : '추신수'가 구입한 합계금액을 확인
--실습 : 박지성, 추신수가 구입한 내역을 확인(이름, 구입(판매)금액, 구입(판매)일자)
-----------------------------

--실습1 : '야구를 부탁해'라는 책이 팔린 내역을 확인(책제목, 판매금액, 판매일자)
SELECT * FROM BOOK;
SELECT * FROM ORDERS;

SELECT B.BOOKNAME, O.SALEPRICE, ORDERDATE
FROM BOOK B, ORDERS O
WHERE BOOKNAME = '야구를 부탁해'
    ORDER BY B.PUBLISHER, B.BOOKNAME;

-- 쌤 답변
SELECT B.BOOKNAME, O.SALEPRICE, O.ORDERDATE
FROM BOOK B, ORDERS O
WHERE B.BOOKID = O.BOOKID --조인조건
     AND B.BOOKNAME = '야구를 부탁해' --선택(검색) 조건
;
-- 표준 SQL 방식
SELECT *
    FROM BOOK B INNER JOIN ORDERS O         -- 조인테이블 + 조인방식
              ON B.BOOKID = O.BOOKID                -- 조인조건
    WHERE B.BOOKNAME = '야구를 부탁해'       -- 찾을(검색)조건
;
---------------
--실습2 : '야구를 부탁해'라는 책이 몇 권이 팔렸는지 확인
SELECT * FROM BOOK;
SELECT * FROM ORDERS;

SELECT COUNT(*) 
FROM ORDERS O, BOOK B
WHERE BOOKNAME = '야구를 부탁해'
;
---------------
--실습3 : '추신수'가 구입한 책값과 구입일자를 확인(책값, 구입일자)
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;

SELECT C.NAME,  O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID -- 조인조건
    AND C.NAME = '추신수'
;
---------------
--실습4 : '추신수'가 구입한 합계금액을 확인
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;
            -- C.NAME 못 써 / '추신수' AS NAME은 여러명일 때는 GROUP BY로 쓴다.
SELECT '추신수' AS NAME, SUM(O.SALEPRICE) AS SUM_PRICE     
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID -- 조인조건
    AND C.NAME = '추신수'
;
---------------
--실습5 : 박지성, 추신수가 구입한 내역을 확인(이름, 구입(판매)금액, 구입(판매)일자)
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;
-- // 풀이1
SELECT C.NAME, O.SALEPRICE, ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID
    AND (NAME = '박지성' OR NAME = '추신수')
;
-- // 풀이2 ( INNER JOIN )
SELECT C.NAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C INNER JOIN ORDERS O
ON C.CUSTID = O.CUSTID
WHERE NAME = '박지성' OR NAME = '추신수'
      -- = WHERE C.NAME IN('박지성', '추신수')
;
-- 여기서는 괄호 빼도 됨
-- INNER JOIN 쓰면 별칭 써줘야 함

-- // 풀이3 ( IN )
SELECT C.NAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID --조인조건
  AND C.NAME IN ('박지성', '추신수')
;
-- ===================================

SELECT * FROM BOOK;
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;
-- 3개 테이블 조인하기 : CUSTOMER, BOOK, ORDERS
-- 고객명, 책제목, 판매가격, 판매일자, 출판사명 (3개 테이블 조인)
-- 조인조건 : O = B, O = C
SELECT C.NAME, B.BOOKNAME, O.SALEPRICE, O.ORDERDATE, B.PUBLISHER
FROM ORDERS O, BOOK B, CUSTOMER C  -- 조인 대상 테이블
WHERE O.BOOKID = B.BOOKID  -- 조인조건
    AND O.CUSTID = C.CUSTID   -- 조인조건
;
------------------
SELECT * 
    FROM ORDERS O INNER JOIN BOOK B -- 조인테이블
              ON O.BOOKID = B. BOOKID -- 조인조건
              INNER JOIN CUSTOMER C -- 조인테이블
              ON O.CUSTID = C.CUSTID -- 조인조건
    WHERE C.NAME = '추신수'  -- 찾을(검색)조건
;
------------------
-- 조인조건 : B = O, O = C
SELECT C.NAME, B.BOOKNAME, O.SALEPRICE, O.ORDERDATE, B.PUBLISHER
FROM ORDERS O, BOOK B, CUSTOMER C  -- 조인 대상 테이블
WHERE B.BOOKID = O.BOOKID  -- 조인조건
    AND O.CUSTID = C.CUSTID   -- 조인조건
;


-- ===================================
--(실습) BOOK, CUSTOMER, ORDERS 테이블 데이터를 조회
-- 1.장미란이 구입한 책제목, 출판사, 구입가격, 구입일자
-- 2.장미란이 구입한 책 중에 2014-01-01 ~ 2014-07-08까지 구입한 내역 (날짜타입으로 바꿔서 비교)
-- 3.'야구를 부탁해'라는 책을 구입한 사람과 구입일자를 확인
-- 4.추신수, 장미란이 구입한 책제목, 구입금액, 구입일자 확인
---- (정렬 : 고객명, 구입일자 순으로)
-- 5.추신수가 구입한 책갯수, 합계금액, 평균값, 가장 큰금액, 가장 작은금액
--------------------------------

-- 1.장미란이 구입한 책제목, 출판사, 구입가격, 구입일자
SELECT * FROM BOOK;
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;

SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID
    AND C.NAME = '장미란'
;

-- 2.장미란이 구입한 책 중에 2014-01-01 ~ 2014-07-08까지 구입한 내역
-- 풀이1
SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID
    AND C.NAME = '장미란'
    AND ORDERDATE BETWEEN TO_DATE('2014-01-01') AND TO_DATE('2014-07-08')
;
-- 풀이2 (INNER JOIN)
SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE        
FROM ORDERS O INNER JOIN BOOK B -- 조인테이블
              ON O.BOOKID = B. BOOKID -- 조인조건
              INNER JOIN CUSTOMER C -- 조인테이블
              ON O.CUSTID = C.CUSTID
WHERE ORDERDATE >= TO_DATE('2014-01-01')  AND ORDERDATE <= TO_DATE('2014-07-08')
    AND C.NAME = '장미란'    
;
-- 쌤 풀이
SELECT *
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID --조인조건
AND C.NAME = '장미란'
--AND O.ORDERDATE >= '2014-01-01' AND O.ORDERDATE <= '2014-07-08' --날짜 VS 문자열
AND O.ORDERDATE >= TO_DATE('2014-01-01', 'YYYY-MM-DD') --날짜 VS 날짜타입 비교
AND O.ORDERDATE < TO_DATE('2014-07-09', 'YYYY-MM-DD')
;
SELECT ORDERDATE, TO_CHAR(ORDERDATE, 'YYYY-MM-DD HH24:MI:SS')
FROM ORDERS
WHERE ORDERDATE BETWEEN TO_DATE('2014-01-01', 'YYYY-MM-DD')
                    AND TO_DATE('2014-07-08', 'YYYY-MM-DD')
;

-- 3. '야구를 부탁해'라는 책을 구입한 사람과 구입일자를 확인
SELECT B.BOOKNAME, C.NAME, O.ORDERDATE
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID
    AND B.BOOKNAME = '야구를 부탁해'
;

-- 4. 추신수, 장미란이 구입한 책제목, 구입금액, 구입일자 확인
---- (정렬 : 고객명, 구입일자 순으로)
SELECT C.NAME, B.BOOKNAME, O.SALEPRICE, O.ORDERDATE
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID -- 조인조건
    AND C.NAME IN ('추신수', '장미란')
    ORDER BY C.NAME, O.ORDERDATE
;

-- 5. 추신수가 구입한 책갯수, 합계금액, 평균값, 가장 큰금액, 가장 작은금액
--    (참고) 그룹함수랑 같이 못쓰지만 앞에  '추신수' AS NAME 이렇게 해주면 된다.
--              AS 생략 가능!
-- 풀이1
SELECT '추신수' AS NAME, COUNT(*) , SUM(PRICE), AVG(PRICE), MAX(PRICE), MIN(PRICE)
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID
    AND C.NAME = '추신수'
;
-- 풀이2
SELECT '추신수' AS NAME, COUNT(*) , SUM(SALEPRICE), AVG(SALEPRICE), MAX(SALEPRICE), MIN(SALEPRICE)
FROM ORDERS O, CUSTOMER C  -- BOOK B  북테이블 필요 (X)
WHERE O.CUSTID = C.CUSTID   -- O.BOOKID = B.BOOKID  북테이블 필요 (X)
    AND C.NAME = '추신수'
;
-- 쌤 답변
SELECT '추신수' AS NAME, 
       COUNT(*) AS CNT, 
       SUM(O.SALEPRICE) SUM_PRICE, 
       AVG(O.SALEPRICE) AVG_PRICE, 
       MAX(O.SALEPRICE) MAX_PRICE, 
       MIN(O.SALEPRICE) MIN_PRICE
--SELECT *
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID = C.CUSTID --조인조건
AND C.NAME = '추신수'

-- ===================================
