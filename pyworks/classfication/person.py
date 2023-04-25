# Person 클래스 정의
from operator2 import str


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # 멤버의 정보


# 클래스 사용 - 객체 생성 (메모리 실행)
()  # p1 - 인스턴스 오브젝트
p1 = Person("김산", 2)


# 멤버의 정보
class Employee(Person):


    def __init__(self, name, age, id):
        super().__init__(name, age)
        self.id = id# 자식클래스 사번 ㅗ기화

    def work(self):
        print("회사에 다닙니다")
    #메서드 재정의(오버라이딩)
    def __str__(self):
        return f'이름: {self.name},나이 {self.age}, 사번: {self.id}'

e1 = Employee("이하나", 25, 'a1001')
print(e1)