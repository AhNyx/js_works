# 환율 정보 - 네이버 > 증권 > 시장지표
import requests
from bs4 import BeautifulSoup

url = "https://finance.naver.com/marketindex/"
response = requests.get(url)

html = BeautifulSoup(response.text, 'html.parser')
ul = html.find('ul', attrs={'class':'data_lst'})
first_li = ul.find('li')
#print(first_li)
exchange = first_li.find('span', attrs={'class':'blind'}) # 환율의 종류\
exchange_value = first_li.find('span', attrs={'class':'value'}) # 환율의 종류
#print(exchange.text,':',exchange_value.text)


# 전체 환율
all_li = ul.findAll('li')



# for li in all_li:
#     exchange = li.find('span', attrs={'class':'blind'})
#     exchange_value = li.find('span', attrs={'class':'value'})
#     #print(exchange.text,':',exchange_value.text)
#     print(exchange.text.split(' ')[-1],':',exchange_value.text)