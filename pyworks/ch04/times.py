# 배수를 구하는 함수를 정의하고 사용




count = 0
def A(x):
    global count
    for i in range(1,101) :
        if i % x == 0 :
            count += 1
            print(i, end= " ")

A(3)
print()
print(f'배수의 개수 = {count}')



