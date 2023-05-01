# 사용자 예외 만들기
# Excepton 클래스를 상속
class MyError(Exception):
   def __str__(self):
       print("허용되지 않는 별명입니다")

def say_nick(nick):
    if nick == '밥보='
    print(nick)

say_nick('영웅')
say_nick('바보')
   w