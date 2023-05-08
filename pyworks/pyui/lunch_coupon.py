# 쿠폰 추천기 만들기
from tkinter import *
import random
namelist = ['이진성','노승우','박성호','권지혜','김은효',
            '이경철','성의석','이유진','유성길','한주훈',
            '강정현','김현우','이영준','안재훈','김민정',
            '유세현','윤기은','오화룡','조은별','이가은']
# 5명 랜덤 추출

def click():
    result = []
    while len(result) < 5:
        person = namelist[random.randint(0, len(namelist) - 1)]
        if person not in result:
            result.append(person)
    output.delete(0.0, END)
    output.insert(END, result)






window = Tk()
window.title('쿠폰 추천기')
window.option_add('*Font', '맑은고딕 14')


#이미지 넣기 PhotoImage(file)
img = PhotoImage(file = './bronx.png')
lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=0, column=0, sticky=W)

#추천 버튼
Button(window, text='추첨',command=click).grid(row=1, column=0, sticky=E)

#이름 출력

output = Text(window, width=33, height=4,bg='yellow')
output.grid(row=2, column=0, sticky=W)

window.mainloop()