# 키보드로 거북이 조종하기

import turtle as t
t.shape('turtle')

def turn_right():
    t.setheading(0)
    t.forward(10)

def turn_up():
    t.setheading(90)
    t.forward(10)
def turn_left():
    t.setheading(180)
    t.forward(10)
def turn_down():
    t.setheading(270)
    t.forward(10)
def clear():
    t.clear()

# 함수 호출시 괄호가 없음 - 주의!, Right - 첫글자 대문자(상수)
t.onkeypress(turn_right,'Right')
t.onkeypress(turn_up,'Up')
t.onkeypress(turn_left,'Left')
t.onkeypress(turn_down,'Down')
t.onkeypress(clear, 'Escape')
t.listen()


t.mainloop()