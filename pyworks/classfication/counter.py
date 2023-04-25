# Counter 클래스 만들기
class Counter:
    x = 0

    def __init__(self):
        Counter.x += 1 # 클래스 변수이므로 클래스로 직접 접근


    def get_count(self):
        return Counter.x

c1 = Counter()
print(c1.get_count())
c2 = Counter()
print(c2.get_count())


"""
class Counter:
    def __init__(self):
        self.x = 0
        self.x += 1 # x에 1을증가

    def get_count(self):
        return self.x

c1 = Counter()
print(c1.get_count())

c2 = Counter()
print(c2.get_count())
"""