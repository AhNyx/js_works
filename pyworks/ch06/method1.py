# 함수 - function, method(메소드)
import time
# 1부터 10까지 출력
for i in range(1,11):
    print(i)

# 1부터 n까지 출력하는 함수
def xxx(n):
    for i in range(1,n+1):
        print(i)

xxx(15)
##get_sum(20)
start = time.time_v
def get_sum(n):

    sum_v = 0
    for i in range(1, n + 1):
        sum_v += i
    return sum_v

# 1부터 n까지 합계를 구하는 함수


#계산 복잡도 - 곱셈, 덧셈, 나눗셈 3 번 : 0(1)
statt = time.time()
def get_sum2(n):
    sum_v = (n * (n+1)) // 2
    return sum_v

# ㅎ모듈 이용법
# import method1 as met 인 ㅇ

















































































































































































































































































































































































