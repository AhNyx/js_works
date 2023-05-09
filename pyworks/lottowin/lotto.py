import requests
from bs4 import BeautifulSoup
from tkinter import *


def lotto_win():
    # num = 1065
    num = entry.get()  # 폼에 입력된 값
    url = "https://dhlottery.co.kr/gameResult.do?method=byWin&drwNo={}".format(num)
    response = requests.get(url)

    soup = BeautifulSoup(response.text, "html.parser")
    win_result = soup.select_one('div.win_result')  # 태그이름.클래스이름
    win_result.text
    win_list = win_result.text.split('\n')[7:13]
    bonus_num = win_result.text.split('\n')[-4]
    output.delete(0.0, END)
    output.insert(END, "당첨번호\n" + ' '.join(win_list) + "\n보너스번호\n" + bonus_num)


# lotto_win()

window = Tk()

Label(window, text="당첨 회차 입력: ").grid(row=0, column=0, sticky=W)
# 입력 상자
entry = Entry(window, bg='yellow')
entry.grid(row=1, column=0, sticky=W)

btn = Button(window, text="당첨 번호 확인", command=lotto_win)
btn.grid(row=2, column=0, sticky=W)

# 출력 상자
output = Text(window, bg='skyblue', width=50, height=5)
output.grid(row=3, column=0, sticky=W)

window.mainloop()