#피보나치 수열
# 첫째항 및 둘째항이 1이며, 그 뒤의 항은 바로 앞 두항의 합임

def fibo(n):
    if n <= 2 : # 종료 조건
        return 1
    else:
        return fibo(n-2) + fibo(n-1)

print(fibo(1))
print(fibo(2))
print(fibo(3))
print(fibo(4))
print(fibo(5))

@app.route('/')
def inde=x():    return "heloo Heloo~"