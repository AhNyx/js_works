43# 컨트롤 도구 - 클래스 사용 생성
x
from tkinter import *

class App:
    def __init__(self,master):
    frame = Frame(master)
    frame.pack()

    Label(frame, text="제목").grid(row=0 , column=0)
    Entry(frame).grid(row=0,column=1)
    Button(frame, text="확인").grid(row=0, column=2)

    # 체크 박스
    Checkbutton(frame, text="체크버튼").grid(row=1,column=0)

    # 리스트 목록 상자
    listbox = Listbox(frame, height=3)
    colors = ['red,'green','blue'']
    for i in colors:
        listbox.insert(END, item)
    listbox.grid(row=1,column=1)

# root.title("UI 구성")
# rootame = Frame(root)
# Button(root, text='제출', click=click).grid(row=0, column=0)
# lbl = Label(root, text='안녕하세요')
# lbl .grid(row=1, column=0f)


root = Tk()
app = App(root)
root.mainloop()