import sqlite3

def getconn():
    conn = sqlite3.connect("C:\green_project\sqlworks\pydb\memberdb.db")
    return conn
print(getconn(), "연결 객체 생성됨")

def select():
    conn = getconn()
    cursor = conn.cursor()

    sql = "SELECT * FROM member"
    cursor.execute(sql)
    rs = cursor.fetchall()
    print(rs)
    conn.close()

def select_one():
    conn = getconn()
    cursor = conn.cursor()

    sql = "SELECT * FROM member WHERE memberid = ? AND passwd = ?"
    cursor.execute(sql, ('df12','123123'))
    rs = cursor.fetchone()
    print(rs)
    conn.close()

#select()
select_one()