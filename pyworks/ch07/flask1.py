# flask 웹 프레임워크 사용하기
import flask
from flask import Flask

app = Flask(__name__)

@app.route('/') # 217
def index(): #127.0.0.1:5000
    return "<h1>hello~flask1</h1>"

@app.route('/login') #127.0.0.1/login
def login():
    return "<h1><b>로그인</b> 페이지 입니다.</h1>"

@app.route('/board/view')
def detail():
    return "<h1>게시판 상세 페이지</h1>"



app.run()

