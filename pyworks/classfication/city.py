class City:
    a = ['Seoul', 'Incheon', 'Daejon', 'Jeju'] # 클래스 리스트

    def __init__(self, name):
        self.name = name
        self.a2 = [] # 인스턴스 리스트

    str1 = ""
    for i in City.a:
        str1 += i[0]

    print(str1)