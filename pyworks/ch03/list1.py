# list1.py
# 리스트 생성
cart = [] # 빈 리스트
# 리스트 요소는 append() 추가
cart.append('계란')
cart.append('사과')
cart.append('생수')
cart.append('콩나물')

# 특정한 위치에 요소 추가
cart.insert(2, "양파")

# 리스트의 개수
print(len(cart))

# 리스트 수정
#cart[2] = '커피'

# 리스트 삭제
# del cart[0]
#cart.remove('계란') # 특정 요소 삭제
#cart.pop() # 맨 뒤에서 삭제

# 특정한 값을 조회
print(cart[-1])

cart2 = ['계란','사과','생수']
print(cart)
#print(cart2)
