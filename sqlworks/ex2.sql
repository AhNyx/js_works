-- 날짜 자료형
CREATE TABLE ex2(
    col_date DATE,
    col_timestamp TIMESTAMP
);

-- 자료 삽입
INSERT INTO ex2 VALUES (SYSDATE, SYSTIMESTAMP);

--자료 검색
SELECT * FROM ex2;