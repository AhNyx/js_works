# 배송비 계산
# 주문 상품 가격이 2만원 미만이면 배송비 2500원을 포함하고,
#아니면 배송비를 포함하지 않는 프로그램

"""

delivery_fee = 2500

if price < 20000 :
    price = price + delivery_fee

print(price)
"""

def get_price(unit_price, num):

    price = unit_price * num
    delivery_fee = 2500

    if price < 20000:
        price += delivery_fee

    return price


order1 = get_price(15000, 2)
order2 = get_price(5000, 3)


print(f'주문1 가격은 {order1}원 입니다')
print(f'주문2 가격은 {order2}원 입니다')
