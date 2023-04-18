select * from tbl_class;
select * from tbl_student;

-- 조인
select stu.sname, stu.age, stu.gender, cls.cname from tbl_class cls, tbl_student stu where cls.cid = stu.cid;