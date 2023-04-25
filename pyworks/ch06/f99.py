# 구구단 쓰기
# with ~ as 구문에서는 f.close()를 사용하지 않음
with open("./output/gugu.txt", 'w')as f:
    for i in range(2, 10):
        for j in range(1,10):
            gugudan = f'{i} * {j} = {i * j}\n'
            f.write(gugudan)
        f.write('\n')




# 파일 읽기
try:
    with open("./output/gugu.txt", 'r') as f:
        gugudan = f.read()
        print(gugudan)
except:
    print("파일을 찾을 수 없습니다")