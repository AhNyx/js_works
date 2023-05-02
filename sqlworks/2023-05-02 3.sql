-- 옵티마이저 - SQL 최적화

DROP INDEX idx_admin;

SELECT * FROM board;

-- 작성자가 'admin'인 게시글 조회
SELECT * FROM board
WHERE writer = 'admin';

-- 작성자가 'admin'인 게시글 조회 - 인덱스로 만들기
-- CREATE INDEX 인덱스 이름 ON 테이블 이름 (칼럼이름)
CREATE INDEX idx_wit ON board(writer);

-- 오라클 힌트
-- /*+ INDEX (테이블 이름 인덱스 이름) */
SELECT /*+ INDEX(board idx_admin) */ *FROM BOARD
WHERE writer = '긴하루';

SELECT * FROM TABLE (DBMS_XPLAN.DISPLAY_CURSOR(null,null,'ALLSTATAR LABT'))