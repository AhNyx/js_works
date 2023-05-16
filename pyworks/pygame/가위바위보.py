import random
"""
- 가위 바위 보 게임 만들기
- 게임 방법
1.당신(you)은 가위, 바위, 보 중 하나를 입력한다.
2. 컴퓨터(com)는 가위, 바위, 보 중 하나를 랜섬 생성한다
3. 결과 출력은 무승부, 패, 승이다
4. 잘못 입력한 경우 " 잘못된 입력입니다. 다시 입력해 주세요"
"""

userpae = ""
usernum = 0
while True:
    userpae = input("가위바위보 입력\n")
    if userpae == '가위' :
        usernum = 1
        break;
    elif userpae == '바위' :
        usernum = 2
        break;
    elif userpae == '보' :
        usernum = 3
        break;
    else :
        print("잘못된 입력입니다. 다시 입력해 주세요")


comnum = random.randint(1 , 3)
if comnum == 1:
    compae = '가위'
elif comnum == 2:
    compae = '바위'
elif comnum == 3:
    compae = '보'

result = ""

if usernum == compae :
    print("무승부")
elif usernum == 1:




print(f'당신 : {userpae}')
print(f'컴퓨터 : {compae}')
print(f'당신 : {result}')

