-- board 테이블
CREATE TABLE board(
    bno NUMBER(5) PRIMARY KEY, -- 글번호
    title VARCHAR2(200) NOT NULL, -- 글제목
    writer VARCHAR2(20) NOT NULL, -- 작성자
    content VARCHAR2(2000) NOT NULL, -- 글내용
    regdate DATE DEFAULT SYSDATE --작성일
);
-- 시퀀스(일련번호, 자동순번)
CREATE SEQUENCE seq;

-- 추천수 칼럼을 추가하세요 (칼럼명: cnt, 자료형: NUMBER DEFAULT 0)
-- ALTER TABLE 테이블 이름 ADD 칼럼명 자료형;
ALTER TABLE board ADD cnt NUMBER DEFAULT 0;

desc board;

-- 게시글 추가
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.nextval, '가입인사','강남역','안녕하세요, 가입인사 드려요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.nextval, '공지사항입니다.','관리자','가입인사를 남겨주세요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.nextval, '가입인사입니다.','이강','안녕하세요~');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.nextval, '좋은 하루.','긴하루','좋은 하루 되세요');

-- 게시글 검색
select * from board;

-- 작성자가 관리자인 게시글을 검색하시오
SELECT * FROM board WHERE bno = 2;

-- 게시글의 작성자를 '관리자'에서 'admin'으로 변경하세요
-- UPDATE 테이블이름 SET 칼럼 = 변경값 WHERE 절;
UPDATE board SET writer = 'admin' WHERE writer = '관리자';

-- 3번 게시글을 삭제하시오
-- DELETE FROM 테이블이름 WHERE 절;
DELETE FROM board WHERE bno = 3;

-- 재귀 복사(자료 삽입)
-- INSERT INTO(칼럼) (SELECT 칼럼 FROM 테이블이름)
INSERT INTO board(bno,title,writer,content)(select seq.nextval,title,writer,content from board);

-- 페이지 처리
select * from
(select rownum rn, bno, title, content from board)
where rn >= 11 and rn <= 20; -- ROWNUM의 별칭을 사용하면 가능
--where rownum > 10 and rownum <= 20; -- ROWNUM은 1을 포함해야 나옴

-- ROWID
-- 데이터를 구분하는 유일한 값
-- ROWID를 통해서 데이터 파일, 어느 블럭에 저장되어 있는 지 알 수있음
select rowid, bno, title, content from board where rowid = 'AAAS1BAAHAAAAFeAAD';


COMMIT;