# 사각형의 넓이 계산 함수
# 사각형의 넓이 계산 함수, 넓이 = 가로의 길이 x 세로의 길이
# 삼각형의 넓이, 넓이 = (밑변 x 높이) / 2
# 함수이름 - calc_area()

def calc_area(x, y):
    val = x * y
    return val

def tri_area(x, y) :
    val = (x * y) / 2
    return val

def area() :
    result = calc_area(4, 3)
    print('사각형의 면적', calc_area(4, 3))
    print(f'사각형의 면적 : {result}')

# 삼각형, 밑변- 4, 높이 - 5
result2 = tri_area(4, 5)
print(f'삼각형의 넓이 : {result2}');

# 정사각형의 면적
size = int(input('숫자를 입력: '))

def calc_size(n) :
    area = n * n
    return area


print(calc_size(1000))
