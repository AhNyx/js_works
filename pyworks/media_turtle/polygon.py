# 다각형 그리기
import turtle as t

t.shape("turtle")
"""
for i in range(3) :
    t.forward(100)
    t.left(120)

t.up()
t.left(90)
t.forward(200)
t.left(30)
t.down()
"""

def polygon(n): # 매개변수 도형의 변의 개수

    for i in range(n) :
        t.forward(50)
        t.left(360/n)

def polygon2(n, d):
    for i in range(n) :
        t.forward(d)
        t.left(360/n)


polygon(5)

t.up()
t.forward(100)
t.down()

polygon2(3, 100)


t.mainloop()

