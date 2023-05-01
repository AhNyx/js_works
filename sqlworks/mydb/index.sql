-- pyhon 연결 테이블 작성
CREATE TABLE pytest(
    message VARCHAR2(50)
    );

INSERT INTO pytest VALUES ('PYTHON과 ORCLE DB 연동');

SELECT * FROM PYTEST;

INSERT INTO pytest VALUES ('행운을 빌어요');

commit;

SELECT * FROM board ORDER BY bno DESC;

-- 작성자가 'admin'인 게시글
SELECT * FROM board WHERE writer = 'admin';

-- 인덱스 생성
CREATE INDEX idx_admin ON board(writer);

DROP INDEX idx_admin

-- 실행계획 보는 코드

SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(null,null,'AllSTATS LAST));