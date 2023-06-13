CREATE TABLE t_member(
    memberid VARCHAR2(20) PRIMARY KEY,
    passwd VARCHAR2(20) NOT NULL,
    name VARCHAR2(30) NOT NULL,
    gender VARCHAR2(10),
    joindate DATE DEFAULT SYSDATE
);


INSERT INTO t_member (memberid, passwd, name, gender) VALUES ('cloud', 'm12345', '김구름', '남');

COMMIT;

SELECT * FROM t_member;

CREATE TABLE t_board(
    bnum NUMBER(4) PRIMARY KEY,
    title VARCHAR2(100) NOT NULL,
    content VARCHAR2(2000) NOT NULL,
    regdate TIMESTAMP DEFAULT SYSTIMESTAMP,
    modifydate TIMESTAMP,
    hit NUMBER DEFAULT 0,
    memberid VARCHAR2(20),
    CONSTRAINT FK_MemberBoard FOREIGN KEY (memberid)
    REFERENCES t_member(memberid) ON DELETE CASCADE
);

CREATE SEQUENCE b_seq;

DROP TABLE t_board;

INSERT INTO t_board(bnum, title, content, memberid) VALUES (b_seq.NEXTVAL, '제목222.', '글 내용2222', 'cloud');

SELECT * FROM t_board;
SELECT * FROM t_board ORDER BY regdate DESC