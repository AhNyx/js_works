# 계산기

from tkinter import *

def click(key):
    if key == '=':
        try:
            value = eval(display.get()) # 입력된 계산값
            result = str(value)[0:10] # 소수점 포함 10자리까지 출력
            display.insert(END, '=' + str(value))
        except:
            display.insert(END, "-->오류") #예외 처리
    elif key == 'C':
        display.delete(0, END) # 첫번째 문자부터 삭제
    else:
        display.insert(END, key)

root = Tk()
root.title("나의 계산기")

# top_row 프레임 - 입력창
top_row = Frame(root)
top_row.grid(row=0, column=0, columnspan=2, sticky=N) # N-North 북쪽
display = Entry(top_row, width=50, bg='light green')
display.grid(row=0, column=0)

# num_pad 프레임 - 숫자 버튼

num_pad = Frame(root)
num_pad.grid(row=2, column=0, sticky=W) # W-West 서쪽
num_pad_list = [
    '7','8','9',
    '4','5','6',
    '1','2','3',
    '0','.','='
                ]
r = 0
c = 0
for btn_text in num_pad_list:
    def cmd(x=btn_text): # 함수에 인수(버튼 키)를 전달
        click(x)


    Button(num_pad, text=btn_text, width=5, command=cmd).grid(row=r,column=c)
    c = c + 1
    if c > 2 : # column이 2(3열)보다 크면 0(1열) 으로 설정
        c = 0
        r = r + 1 # row(행) 1증가

# 연산자 프레임
operator = Frame(root)
operator.grid(row=2, column=1, sticky=E)
operator_list = [
    '*','/',
    '+','-',
    '(',')',
    'C']

r = 0
c = 0
for btn_text in operator_list:
    def cmd(x=btn_text): # 함수에 인수(버튼 키)를 전달
        click(x)
    Button(operator, text=btn_text,width=5, command=cmd).grid(row=r, column=c)
    c = c + 1
    if c > 1:
        c = 0
        r = r + 1





root.mainloop()