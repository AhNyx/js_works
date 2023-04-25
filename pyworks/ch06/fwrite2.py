# 파일 쓰기 - 리스트
try:
    season = ["봄","여름","가을","겨울"]
    f = open("c:/pyfile/season.txt","w")
    for i in season:
        f.write(i + ' ')
    f.close()

except:
    print("파일을 쓰기에 실패했습니다")