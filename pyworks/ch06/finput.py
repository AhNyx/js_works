# 입력 받아 파일 쓰기

with open('./output/input.txt', 'a') as f:
    while True:
        text = input("저장할 내용을 입력해 주세요(종료z)")
        if text == 'z' or text == 'Z':
            break
        f.write(text)
        f.write('\n')