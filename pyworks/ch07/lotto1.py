# 로또 복권 추첨 프로그램
# 1 ~ 45 까지 6개 랜덤수로 저장
import random

lotto = []
"""
for i in range(6):
    num = random.randint(1,45)
    if num not in lotto:
        lotto.append(num)
"""
while len(lotto) < 6:
    num = random.randint(1, 45)
    if num not in lotto:
        lotto.append(num)

print(lotto)