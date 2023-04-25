import turtle as t
import random

score = 0
enemy_speed = 9

t.shape('turtle')
t.bgcolor('orange')
t.color('white')
t.up()
t.speed(0)

te = t.Turtle()
te.shape('turtle')
te.color('red')
te.up()
te.speed(0)
te.goto(0, 300)

tf = t.Turtle()
tf.shape('circle')
tf.color('green')
tf.speed(0)
tf.up()

tf.goto(0,-150)

def turn_right():
    t.setheading(0)

def turn_up():
    t.setheading(90)

def turn_left():
    t.setheading(180)

def turn_down():
    t.setheading(270)

t.onkeypress(turn_right,"Right")
t.onkeypress(turn_up,"Up")
t.onkeypress(turn_left,"Left")
t.onkeypress(turn_down, "Down")

t.listen()

def message(x, y):
    t.clear()
    t.goto(0, 180)
    t.write(x, False, 'center', ("", 20))
    t.goto(0, -180)
    t.write(y, False, 'center', ("", 20))
    t.home()

def play():
    global score
    global enemy_speed

    t.clear()

    if t.distance(te) > 12:
        t.ontimer(play, 100)
        #잡힘
    if t.distance(te) < 12:
        message('Game Over', f'score = {score}')
        score = 0
        enemy_speed = 9
        t.home()
        te.goto(0, 300)

    t.forward(10)
    te.forward(enemy_speed)

    if random.randint(1, 5) == 4:
        te.setheading(te.towards(t.pos()))

    if t.distance(tf) < 12:
        score += 1
        x = random.randint(-230, 230)
        y = random.randint(-230, 230)
        tf.goto(x,y)
        if enemy_speed < 15 :
            enemy_speed += 1


message("Turtle Run","[Space]")

t.onkeypress(play,"space")

t.mainloop()