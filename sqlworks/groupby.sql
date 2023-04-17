-- GROUP BY의 ROLLUP(), CUBE()
-- 부서테이블(부서번호, 직업이름, 급여)
CREATE TABLE department (
    dept_no VARCHAR2(3),
    job_nm VARCHAR2(30),
    salary NUMBER(10)
);

-- 자료 삽입
INSERT INTO department VALUES('100','증권사',3300000);
INSERT INTO department VALUES('100','관리자',4300000);
INSERT INTO department VALUES('200','증권사',5000000);
INSERT INTO department VALUES('200','데이터분석가',4000000);
INSERT INTO department VALUES('200','관리자',6000000);

SELECT * FROM department;
-- 부서별 소계, 총계
SELECT DEPT_NO,job_nm, sum(salary) FROM department GROUP BY ROLLUP(dept_no, job_nm) ORDER BY dept_no;

-- 부서별, 직업별 소계, 총계 : CUBE()
SELECT DEPT_NO,job_nm, sum(salary) FROM department GROUP BY CUBE(dept_no, job_nm) ORDER BY dept_no;

-- 부서별, 직업별 소계 : GROUPING SET()
SELECT DEPT_NO,job_nm, sum(salary) FROM department GROUP BY GROUPING SETS(dept_no, job_nm) ORDER BY dept_no;
