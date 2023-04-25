# 파일 읽기
# 파일 개방 open("경로", 'ㄱ')
try:
    f = open("c:/pyfile/file1.txt", 'r')

# 파일 읽기
    data = f.read()
    print(data)

# 파일 종료
    f.close()
except:
    print("파일을 찾을수 없습니다")
