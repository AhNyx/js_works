select * from book;
select * from customer;
select * from orders;

-- 출판사가 '굿스포츠' 또는 '대한미디어'인 도서를 검색하시오
select * from book where publisher = '굿스포츠' OR publisher = '대한미디어';
select * from book where publisher IN ('굿스포츠','대한미디어');

-- 도서 이름에 '축구'가 포함된 출판사를 검색하시오
select * from book where bookname LIKE '%축구%';

-- '축구'에 관한 도서 중 가격이 20000원 이상인 도서를 검색하시오
select * from book where bookname LIKE '%축구%' AND price >= 20000;

-- 도서를 이름순으로 검색하시오(오름차순 정렬)
select * from book ORDER BY bookname;

-- 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 정렬하시오
select * from book ORDER BY price, bookname;

-- 자료 추가 (11, '혼자공부하는 자바', '한빛미디어', '24000')
INSERT INTO book VALUES (11, '혼자공부하는 자바', '한빛미디어', '24000');

-- bookname을 '혼자 공부하는 파이썬'으로 변경하시오.
UPDATE book SET bookname = '혼자 공부하는 파이썬' where bookname = '혼자공부하는 자바';

-- bookid가 11인 도서 삭제
DELETE FROM book where bookid = 11;

-- 집계 함수
-- 책의 총 수량을 구하시오
select COUNT(*) 총수량 from book;

-- 가장 높은가격을 찾으시오
select max(price) from book;

-- 가장 비싼 도서의 이름을 검색하시오
select bookname, price from book where price = (select max(price) from book);

-- 고객과 고객의 주문에 관한 데이터를 모두 검색하시오
select * from customer;
select * from orders;
select * from customer cus, orders ord where cus.custid = ord.custid; 

-- 김연아 고객의 총 주문가격을 검색하시오
select cus.name, SUM(saleprice) from customer cus, orders ord where cus.custid = ord.custid group by cus.name having cus.name = '김연아';

select * from book;