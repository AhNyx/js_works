# 순차 탐색
# 리스트의 첫번째 자료부터 하나씩 비교하면서 같은 값이 나오면
# 그 위치를 돌려주고(반환), 못찾으면 -1을 반환함

def search_list(a, x):
    n = len(a)
    for i in range(0, n):
        if a[i] == x :
            return i
    return -1

def search_list2(a, x):
    n = len(a)
    v = []
    for i in range(0, n):
        if a[i] == x :
            v.append(i)
    if len(v) > 0 :
        return v
    else:
        return -1

def search_list3():
    pass






v = [60, 5, 33, 12, 97, 24, 5]

# 매개변수 - 리스트, 찾는값
#print(search_list(v, 24))


print(search_list2(v, 5))
"""
n = len(v)
for i in range(0, n):
    if v[i] == 12:
        print("찾음")
    else:
        print("없음")
"""
