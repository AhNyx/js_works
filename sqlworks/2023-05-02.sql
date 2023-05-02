SELECT * FROM dept;
SELECT * FROM employee;

--INSERT INTO employee VALUE(100,'*/


--사원 이름, 급여, 상별, 부서이름을 검색하시오(JOIN)
SELECT em.ename, em.sal, em.gender, de.deptname
FROM dept de, employee em
WHERE de.deptno = em.deptno;

CREATE VIEW vw_dept_emp AS SELECT em.ename, em.sal, em.gender, de.deptname
FROM dept de, employee em WHERE de.deptno = em.deptno;

SELECT * FROM vw_dept_emp;

-- 부서별 사원의 총 인원수를 구하시오
SELECT deptname, COUNT(*) total
FROM vw_dept_emp
GROUP BY deptname;

-- 부서의 인원이 2명을 초과하는 자료를 검색하시오
SELECT deptname, COUNT(*) total
FROM vw_dept_emp
GROUP BY deptname
--HAVING COUNT(*) >2;
HAVING total > 2;

/*실행순서
1. FROM절
2. WHERE절
3. GROUP BY, HAVING
4. 