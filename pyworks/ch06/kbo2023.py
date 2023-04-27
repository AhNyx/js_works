# f = open() -> with open()
"""
f = open('./output/string.txt', 'w')

f.write('여름이 온다\n')
f.write('123\n')
val = (12 * 1000) / 5
f.write(str(val))


f.close()
"""
#kbo팀 파일에 기록
try:
    team = ['키움','삼성','롯데','두산','기아','SSG','LG','NC','한화']
    with open('./output/kbo2023.txt', 'w') as f:
            for i in team:
                if i == team[-1] :
                    f.write(i)
                else :
                    f.write(i + ', ')
except:
    print('파일을 쓸 수 없습니다.')




# kbo2023.txt 읽기
try:
    with open('./output/kbo2023.txt', 'r') as f:
        team = f.read()
        print(team)
except FileNotFoundError as e:
    print(e)