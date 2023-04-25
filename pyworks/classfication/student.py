# 객체 지향 언어 - 모든 사물을 객체화(Object)
# 객체화를 위한 코드로 정의한 것 - 클래스

class Student :
    # 멤버 변수
    name = ""
    grade = 0

    def info(self): # 저절로 self가 붙여짐
        print(self.name, self.grade)

std1 = Student() # 객체 생성 (인스턴스)
std1.name = '김하나'
std1.grade = 1
#print(std1.name, std1.grade)
std1.info()

std2 = Student() # 객체 생성 (인스턴스)
std2.name = '김하나'
std2.grade = 1
#print(std2.name, std2.grade)