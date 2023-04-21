# 좌표 이동
import turtle as t
import time
import random
t.shape('turtle')
"""
t.up()
time.sleep(1)
t.goto(0,150)
time.sleep(1)
t.goto(100,150)
time.sleep(1)
t.goto(0,0)


x = random.randint(-250, 250)
y = random.randint(-250, 250)
t.goto(x, y)
"""

# 마음대로 걷는 거북이
t.speed(3)

for x in range(100) :
    ang = random.randint(0,360)
    t.setheading(ang)
    t.forward(20)





t.mainloop()