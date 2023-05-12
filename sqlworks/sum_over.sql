-- 급여 누적값 계산
-- SUM(칼럼명) OVER(ORDER BY 칼럼명)
SELECT empno, ename, sal ,SUM(sal) over(ORDER BY empno) "sal_sum",
SUM(sal) OVER(ORDER BY empno ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) "sal_sum2"

FROM employee;
