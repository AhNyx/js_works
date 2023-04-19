# vaccine.py
# 현재년도 - 출생년도 + 1 
age = input("출생년도 입력 : ")
year = 2023

age2 = year - int(age) + 1

agelast = age[-1]

day = ["월","화","수","목","금"]

if age2 > 19 and age2 < 66 :
    print("백신 접종 대상")
    if agelast == '1' or agelast == '6' :
        print("{0}요일 접종".format(day[0]))
    elif agelast == '2' or agelast == '7' :
        print("{0}요일 접종".format(day[1]))
    elif agelast == '3' or agelast == '8' :
        print("{0}요일 접종".format(day[2]))
    elif agelast == '4' or agelast == '9' :
        print("{0}요일 접종".format(day[3]))
    elif agelast == '5' or agelast == '0' :
        print("{0}요일 접종".format(day[4]))
else :
    print("하반기 일정 확인")
