-- 모든 고객의 이름과 주소를 검색하시오
SELECT name 이름, address 주소 FROM customer;

-- 모든 고객의 이름, 주소, 전화번호를 검색하시오
SELECT name 이름, address 주소, phone 전화번호 FROM customer;

-- 주소가 '영국'인 고객을 검색하시오
SELECT * from customer where address LIKE '%영국%';

-- 고객의 이름이 '김연아' 혹은 '안산'인 고객을 검색하시오
SELECT * FROM customer WHERE name IN ('김연아','안산');

-- 주소가 '대한민국'이 아닌 고객을 검색하시오
SELECT * FROM customer WHERE address NOT LIKE '%대한민국%';

-- 전화번호가 없는 고객을 검색하시오
SELECT * FROM customer WHERE phone IS NULL;

-- 고객을 이름순으로 정렬하시오
SELECT * FROM customer ORDER BY name ASC;

--고객의 총 인원수를 구하시오
SELECT COUNT(*) 총인원수 FROM customer;