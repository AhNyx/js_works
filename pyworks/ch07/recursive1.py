# 재귀 함수
# 종료 조건을 항상 명시(if ~ else)
# 1부터 10까지 곱하기
import time

def getgob(n):
    gob = 1 # 곱셈에서는 1을 기억
    for i in range(n):
        gob *= i

        return gob



start = time.time()
def facto(n):
    if n <= 1:
        return 1
    return n * facto(n-1)


#facto(57)
print(facto(3))







def sos(n):
    print('Help me!')
    #종료 조건
    if n == 1:
        return ""
    else:
        return sos(n-1)

#sos(3)

