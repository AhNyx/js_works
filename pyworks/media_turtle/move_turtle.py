# turtle 모듈
import turtle as t

t.shape("turtle")
"""
t.forward(100) # 직진 100px
t.left(90) # 머리방향이 왼쪽으로 90도
t.forward(100)
t.left(90) 
t.forward(100)
t.left(90) 
t.forward(100)
"""
t.color('blue')

for i in range(4) :
    t.forward(100)
    t.right(90)


for i in range(3) :
    t.forward(100)
    t.left(120)

t.pensize(3)
t.circle(50)

t.mainloop()


