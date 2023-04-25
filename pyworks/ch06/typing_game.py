# 영어 타자 게임
# 단어장 읽어오기
import random
import time
with open('./output/word.txt', 'r') as f :
    data = f.read().split()

try:
    n = 1 # 문제 번호
    input("[타자 게임] 준비되면 엔터")
    start = time.time()
    while n <= 10:
        question = random.choice(data)
        print(f'문제 {n}')
        print(question)
        user = input()
        if question == user :
            print("통과!")
            n += 1
        else:
            print("오타! 다시 도전")
        if n > 10 :
            print("게임 종료")
            end = time.time()
            endtime = end - start
            print(f'소요시간 : {endtime:.2f}초')
except:
    print("파일을 불러오지 못했습니다")


