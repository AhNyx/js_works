# 원 그리기
import turtle as t
t.shape("turtle")
t.bgcolor('black')
t.color('green')
t.speed(0) # 1~10 숫자가 클수록 빠른데, 0이 가장 빠름
for x in range(50) :
    t.circle(80)
    t.left(10)
    t.forward(5)




t.mainloop()