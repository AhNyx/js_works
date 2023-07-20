use mydb;

-- 제목이 '여름 장마'인 게시글 검색
select * from t_board where title like '여름 장마';

-- 제목에 '장마'가 포함된 게시글 검색
select * from t_board where title like '%장마%';

-- 작성자가 'today'인 게시글 검색
select * from t_board where memberid like 'today';


select * from t_member;

create table user(
	id int primary key,
    pwd varchar(20) not null,
    name varchar(30) not null,
    phone varchar(20)
);