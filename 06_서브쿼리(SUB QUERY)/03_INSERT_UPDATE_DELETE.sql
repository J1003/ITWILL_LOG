-- INSERT, UPDATE, DELETE 내에서의 서브쿼리 사용
/*
■ INSERT 문
INSERT INTO 테이블명
       (컬럼명1, 컬럼명2, ..., 컬럼명n)
VALUES (값1, 값2, ... , 값n);  

■ UPDATE문
UPDATE 테이블명
   SET 컬럼명1 = 값1, 컬럼명2 = 값2, ..., 컬럼명n = 값n
[WHERE 대상조건 ]

■ DELETE 문
DELETE FROM 테이블명
[WHERE 대상조건 ];
*************************************/


/*
■ INSERT 문
INSERT INTO 테이블명
       (컬럼명1, 컬럼명2, ..., 컬럼명n)
VALUES (값1, 값2, ... , 값n); 
--=========================== */
SELECT * FROM BOOK;
INSERT INTO BOOK
       (BOOKID, BOOKNAME, PUBLISHER, PRICE)
VALUES (30, '자바란 무엇인가?', 'ITBOOK', 30000);
COMMIT;
INSERT INTO BOOK
       (BOOKID, PUBLISHER, BOOKNAME, PRICE)
VALUES (31, 'ITBOOK', '자바란 무엇인가(개정)', 35000);
COMMIT;
----
SELECT * FROM BOOK ORDER BY BOOKID DESC;
INSERT INTO BOOK
VALUES (32, '자바란 무엇인가(개정3)', 'ITBOOK', 35000)
;
INSERT INTO BOOK
VALUES (33,'자바란 무엇인가(개정4)', '', 35000); -- '' 대신에 명시적으로 NULL 써도 됨
COMMIT;

INSERT INTO BOOK
            (BOOKID, BOOKNAME, PRICE)
VALUES (34,'자바란 무엇인가(개정5)', 35000)
;
----
SELECT NVL(MAX(BOOKID), 0) + 1 FROM BOOK;
INSERT INTO BOOK
       (BOOKID, BOOKNAME, PRICE)
VALUES ((SELECT NVL(MAX(BOOKID), 0),+ 1 FROM BOOK), 자바란 무엇인가(개정6)', 35000)
;
------------------------------





