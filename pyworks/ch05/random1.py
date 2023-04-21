# random 모듈
# 숫자(정수)를 랜덤 추출 - random.randint(1,10)
# 리스트에서 랜덤 추출 - random.choice(리스트)
# 1 ~ 10 : random.randint()
import random

# 1 ~ 10 중 무작위로 추출
# print(random.randint(1, 10))

# 주사위 만들기
dice = random.randint(1, 6)
# print(dice)
"""
for i in range(10):
    dice = random.randint(1, 6)
    print(dice)
"""
# 리스트에서 랜덤하게 값을 추출하기
과일 = ['딸기', '수박', '참외', '사과']

#print(random.choice(과일))

# 주사위 2개를 10번 던지기
# 두 눈의 합이 7이면 "Seven Thrown!!" 출력, 11이면 "Eleven Thrown"
# 두 눈의 수가 같으면 "Double Thrown!!" 출력

for i in range(1,10) :
    a = random.randint(1,6)
    b = random.randint(1,6)

    if a == b :
        print(f'1번 주사위 : {a}, 2번 주사위 : {b}, 합 : {a+b}')
        print("Double Thrown!!")
    elif (a + b) == 7 :
        print(f'1번 주사위 : {a}, 2번 주사위 : {b}, 합 : {a+b}')
        print("Seven Thrown!!")
    elif (a + b) == 11:
        print(f'1번 주사위 : {a}, 2번 주사위 : {b}, 합 : {a+b}')
        print("Eleven Thrown!!")
    else :
        print(f'1번 주사위 : {a}, 2번 주사위 : {b}, 합 : {a+b}')