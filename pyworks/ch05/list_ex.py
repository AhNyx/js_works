# 리스트 복사
a = [1, 2, 3, 4]
a2 = []
"""
for i in a :
    a2.append(3 * i)
"""

# 리스트 내포
a3 = [3 * i for i in a]

print(a3)

# 3의 배수이면서 짝수인 수 저장
"""
a4 = []
for i in a:
    if i % 2 == 0:
        a4.append(3 * i)
print(a4)
"""

a4 = [3 * i for i in a if i % 2 == 0]
print(a4)

# 1에서 10까지 저장하는 리스트
b = [ i for i in range(1, 11)]
list (b)

# 에서 10 가지의 자연수를 저장
C = { x for x in range(1, 11)}
print(C)

# 1에서 20가지의 자연수 중에서 3의 배수 저장
D = { x for x in range(1, 21) if x % 3 == 0 }
print(D)