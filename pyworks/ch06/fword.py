# 영어 단어장 만들기
import random
try:

    word = ['ant','bear','chicken','deer','fox','eagle','elephant','horse','lion',
            'monkey','penguin']
    with open("./output/word.txt", 'w') as f :
        for i in word :
            if i == word[-1]:
                f.write(i)
            else:
                f.write(i + ' ')
except:
    print("파일을 쓸 수 없습니다")



try:
    with open("./output/word.txt",'r') as f :
        data = f.read().split(' ') # 공백문자로 구분
        print(data)
        #print(random.choice(data))


except:
    print("파일을 읽을 수 없습니다")