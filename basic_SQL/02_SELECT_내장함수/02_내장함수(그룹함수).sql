/* 내장함수 : 오라클 DBMS에서 제공하는 함수(FUNCTION)
그룹함수 : 하나 이상의 행을 그룹으로 묶어서 연산
COUNT(*) : 데이터 갯수 조회(전체 컬럼에 대하여)
COUNT(컬럼명) : 데이터 갯수 조회(지정된 컬럼만 대상으로)
SUM(컬럼명) : 합계값 구하기
AVG(컬럼명) : 평균값 구하기
MAX(컬럼명) : 최대값 구하기
MIN(컬럼명) : 최소값 구하기
******************************/

SELECT * FROM BOOK;
SELECT COUNT(*) FROM BOOK; -- 테이블 데이터 건수 확인

SELECT * FROM CUSTOMER;
SELECT COUNT(*) FROM CUSTOMER; -- COUNT 5건
SELECT COUNT(CUSTID) FROM CUSTOMER; -- 5건 조회(PK)
SELECT COUNT(PHONE) FROM CUSTOMER; -- 4건 조회 / 이 때 NULL 값은 제외됨
--------------
-- PHONE 컬럼 값이 NULL인 데이터 건수 확인
SELECT COUNT(*) FROM CUSTOMER WHERE PHONE IS NULL; -- 1건 출력, NULL값 찾을 때 => IS NULL 씀
-- PHONE 컬럼 값이 NULL인 데이터 건수
SELECT COUNT(*) FROM CUSTOMER WHERE PHONE IS NOT NULL; -- 4건 출력
--------------
-- SUM(컬럼명) : 합계값 구하기
SELECT * FROM BOOK;
SELECT SUM(PRICE) FROM BOOK;

--// (실습) 대한미디어, 이상미디어 출판사에서 출판한 모든 책 금액 합계값
--WHERE PUBLISHER = '대한미디어' AND PUBLISHER = '이상미디어'
SELECT SUM(PRICE) FROM BOOK WHERE PUBLISHER IN ('대한미디어', '이상미디어');

-- AVG(컬럼명) : 평균값 구하기
--// (실습) 대한미디어, 이상미디어 출판사에서 출판한 모든 책 금액의 평균값
SELECT AVG(PRICE) FROM BOOK WHERE PUBLISHER IN ('대한미디어', '이상미디어');

--// (실습) 굿스포츠 출판한 책 중에서 최고가, 최저가 구하기
-- MAX(컬럼명) : 최대값 구하기
-- MIN(컬럼명) : 최소값 구하기
SELECT MAX(PRICE) FROM BOOK WHERE PUBLISHER = '굿스포츠';
SELECT MIN(PRICE) FROM BOOK WHERE PUBLISHER = '굿스포츠';
-- MIN, MAX 값 한번에 출력
SELECT MIN(PRICE), MAX(PRICE) FROM BOOK WHERE PUBLISHER = '굿스포츠';

--// (실습) 책 제목에 대하여 MIN, MAX 값은 무엇인지 확인
SELECT MIN(BOOKNAME), MAX(BOOKNAME) FROM BOOK ORDER BY BOOKNAME;
-- SELECT * FROM BOOK ORDER BY BOOKNAME; 오름차순 정렬로 출력됨

--// (실습) 출판된 책 갯수(권수), 합계금액, 평균금액, 가장비싼책, 가장싼책
SELECT COUNT(*), SUM(PRICE), AVG(PRICE), MIN(PRICE), MAX(PRICE) FROM BOOK;

--====================
--// (실습문제)
--1. 출판된 책 전체 조회(정렬: 출판사, 금액순)
--2. 굿스포츠에서 출판한 책을 책 제목 순으로 조회
--3. 출판된 책 중 10000원 이상인 책(가격순-큰금액부터)
--4. 박지성의 총 구매액(CUSTID = 1)
--5. 박지성이 구매한 도서의 수
--6. 성이 '김'씨인 고객의 이름과 주소
--7. 성이 '박'이고 이름이 '성'으로 끝나는 고객의 이름과 주소
--8. 책 제목 '야구' 부터 '축구' 까지를 검색하기(책제목으로 정렬)
---- (단, '역도' 관련도서는 제외) 
-----------------

-- 1. 출판된 책 전체 조회(정렬: 출판사, 금액순)
SELECT * 
FROM BOOK 
ORDER BY PUBLISHER, PRICE;

-- 2. 굿스포츠에서 출판한 책을 책 제목 순으로 조회
SELECT * FROM BOOK 
WHERE PUBLISHER = '굿스포츠' 
ORDER BY BOOKNAME;

-- 3. 출판된 책 중 10000원 이상인 책(가격순-큰금액부터)
SELECT * FROM BOOK 
WHERE PRICE >= 10000 
ORDER BY PRICE DESC;

-- 4. 박지성의 총 구매액(CUSTID = 1)
SELECT SUM(SALEPRICE) FROM ORDERS WHERE CUSTID = 1;

    // 부분쿼리(서브쿼리)
    // 오라클은 대소문자를 구분못하기때문에 _언더바로 구분!
    SELECT SUM(SALEPRICE) 
    FROM ORDERS           
    WHERE CUSTID = (SELECT CUSTID FROM CUSTOMER WHERE NAME = '박지성');
    // "SELECT AS SUM_PRICE" 써도 돼 여기서 'AS'는 생략 가능!
    // SELECT '박지성' AS NAME, SUM(SALEPRICE) AS SUM_PRICE 이렇게도 가능
    SELECT '박지성' AS NAME, SUM(SALEPRICE) AS SUM_PRICE
    FROM ORDERS
    WHERE CUSTID = (SELECT CUSTID FROM CUSTOMER WHERE NAME = '박지성')
    ;

-- 5. 박지성이 구매한 도서의 수
SELECT COUNT(*) FROM CUSTOMER WHERE NAME = '박지성';

SELECT COUNT(*) FROM CUSTOMER WHERE CUSTID = 1;


-- 6. 성이 '김'씨인 고객의 이름과 주소
SELECT NAME, ADDRESS FROM CUSTOMER WHERE NAME LIKE '김%';


-- 7. 성이 '박'이고 이름이 '성'으로 끝나는 고객의 이름과 주소
SELECT NAME, ADDRESS FROM CUSTOMER WHERE NAME LIKE '박%성';

SELECT NAME, ADDRESS FROM CUSTOMER WHERE NAME LIKE '박%' AND NAME LIKE '%_성';


-- 8. 책 제목 '야구' 부터 '축구' 까지를 검색하기(책제목으로 정렬)
---- (단, '역도' 관련도서는 제외) 

// WHERE (BOOKNAME >= '야구' AND BOOKNAME <= '축구') // OR 조건 쓰면 전체 데이터 조회됨
SELECT * FROM BOOK 
WHERE (BOOKNAME >= '야구' AND BOOKNAME <= '축구')
    AND BOOKNAME NOT LIKE '%역도%'
ORDER BY BOOKNAME;

// BETWEEN
SELECT * FROM BOOK 
WHERE BOOKNAME BETWEEN '야구' AND '축구' 
   AND BOOKNAME NOT LIKE '%역도%' 
ORDER BY BOOKNAME;

// '야구' '축구' 둘 다 포함해서 출력
SELECT * FROM BOOK 
WHERE BOOKNAME LIKE '%야구%' OR BOOKNAME LIKE '%축구%' 
    AND BOOKNAME NOT LIKE '%역도%'
ORDER BY BOOKNAME;
