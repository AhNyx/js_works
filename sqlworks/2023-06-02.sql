-- 은행 계정 테이블 생성
CREATE TABLE account(
    ano VARCHAR2(10) PRIMARY KEY,
    owner VARCHAR2(20) NOT NULL,
    balance NUMBER(10) NOT NULL
);

INSERT INTO account VALUES ('1111', '홍길동', 10000);

DELETE FROM account WHERE ano = 1112;
select * from account;
commit;