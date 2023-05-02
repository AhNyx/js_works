# 컨트롤러 start_app.py
# templates 폴더, static 폴더
# 웹 서버 - flask

from flask import Flask, render_template, request, redirect, url_for, session
import sqlite3

app = Flask(__name__)
app.secret_key = "asdfqwer1234"

# sqlite3와 연동 - 연결 객체 생성
def getconn():
    conn = sqlite3.connect("C:\green_project\sqlworks\pydb\memberdb.db")
    return conn
print(getconn())


# url - '/' 경로 설정
@app.route('/')
def index():
    return render_template('index.html')

#회원 목록
@app.route('/memberlist', methods = ['GET'])
def memberlist():
    conn = getconn()
    cursor = conn.cursor()

    sql = "SELECT * FROM member"
    cursor.execute(sql)
    rs = cursor.fetchall()
    conn.close()
    return render_template('memberlist.html',rs=rs)


def insert():
    conn = getconn()
    cursor = conn.cursor()
    sql = "INSERT INTO member(memberid, passwd, name, gender) " \
          "VALUES (?, ?, ?, ?);"
    cursor.execute(sql, ('today123','m123456$','투데이','여'))
    conn.commit()
    conn.close()

@app.route('/register', methods=['GET','POST'])
def register():
    if request.method == 'POST':
        # 가입 폼에 입력된 자료를 넘겨받음
        id = request.form['memberid']
        passwd = request.form['passwd1']
        name = request.form['name']
        gender = request.form['gender']
        # DB에 저장
        conn = getconn()
        cursor = conn.cursor()
        sql = f"INSERT INTO member(memberid, passwd, name, gender)" \
              f"VALUES ('{id}', '{passwd}', '{name}', '{gender}')"
        cursor.execute(sql)
        conn.commit()
        conn.close()

        #회원가입후 회원 목록 페이지로  강제 이동
        return redirect(url_for('memberlist'))
    else:
        return render_template('register.html')

@app.route('/login', methods = ['GET',"POST"])
def login():
    if request.method == "POST":
        # 로그인 폼에 입력된 데이터 넘겨 받음
        id = request.form['memberid']
        pw = request.form['passwd']

        #database에 접속 - 로그인 체크
        conn = getconn()
        cursor = conn.cursor()

        sql = f"SELECT * FROM member WHERE memberid = '{id}' AND passwd = '{pw}'"
        cursor.execute(sql)
        rs = cursor.fetchone()
        print(rs)
        conn.close()
        if rs:
            session['userid'] = rs[0] # memberid를 세션에 저장(세션 발급)
            return redirect(url_for('index'))
        else:
            error_msg = "아이디나 비밀번호를 확인해 주세요"
        return render_template("login.html", error_msg=error_msg)
    else:
        return render_template("login.html")

@app.route('/logout')
def logout():
    session.clear() # 모든 세션 삭제
    return redirect(url_for('index'))



app.run()
# def register():
#     conn = getconn()
#     cursor = conn.cursor()
#     sql = "INSERT INTO member(memberid, passwd, name, gender) VALUES (?, ?, ?, ?)"
#     cursor.execute(sql, ())
#
#     conn.close()