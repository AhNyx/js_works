# bmi.py
# 체질량 지수 체중 / 키(m)의 제곱
# 키 = 키 / 100 -> cm로 환산
# 거듭제곱 3 ** 2 = 3x3
name = input("이름을 입력하세요")
height = float(input('키를 입력하세요'))
weight = float(input('몸무게를 입력하세요'))
height = height / 100

# 체질량 지수
bmi = weight / (height ** 2)

print(f'{bmi:.2f}') # f 스트링(string) 방식
print("%s님의 bmi는 %.2f입니다" % (name, bmi)) # % 포맷방식


if bmi < 20 :
    print('저체중입니다')
elif bmi >= 20 and bmi < 24 :
    print('정상입니다.')
elif bmi >= 24 and bmi < 30 :
    print('과체중입니다')
else :
    print('비만')
