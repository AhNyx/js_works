-- 부서 테이블과 사원테이블 조인(JOIN)
-- JOIN - 1개 이상의 테이블을 연결하여 사용하는 기법

SELECT * FROM dept;
SELECT * FROM employee;

-- 사원번호, 사원명, 부서번호, 부서명을 출력하시오
SELECT emp.empno, emp.ename, emp.deptno, emp.sal, dep.deptname 
FROM employee emp, dept dep
WHERE emp.deptno = dep.deptno;