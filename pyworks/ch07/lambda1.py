# lambda 함수 - 익명함수(anonymous function)
# lambda 매개변수 : 표현식

def sub(x, y):
    return x - y

print(sub(3,4))

add = lambda x, y : x + y

print(add(3,4))

# 매개변수 1개, 4의 배수
times = lambda x : 4 * x

print(times(5))

# 제곱수
square = lambda x : x * x
print(square(3))
print((lambda x : x * x)(7))

# 람다 함수를 매개변수로 이용
def call_10(func):
    for i in range(10):
        func() # func() 함수 호출

def hello():
    print("안녕")

#call_10(hello) # hello() 함수가 매개로 전달

# 매개 변수가 없는 lambda
hello2 = lambda : print("안녕")
call_10(hello2)