# sys 모듈 - system
# 명령프롬프트(명령 행에서 인수 사용하기)
import sys

print(sys.argv)

args = sys.argv[1:] # arg 리스트 생성



total = 0
for i in args:
    total += int(i) # 입력 받은 문자를 숫자형으로 변환해야함
print(total)