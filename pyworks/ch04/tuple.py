# 튜플(tuple) - 요소의 수정과 삭제 불가, 소괄호 사용
t1 = (1,2,3)
        
print(t1)
print(type(t1))

# 인덱싱 #리스트와 같다
print(t1[0])
print(t1[-1])

t2 = (1, ) #1개를 저장할때는 반드시 뒤에 콤마(,) 사용
print(t2)
print(type(t2))


# 수정 (새 값을 할당
#t1[2] = 4

# 삭제
#del t1[1]