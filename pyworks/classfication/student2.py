#Student
class Student:

    """
    def info(self):
         print(f'이름 : {self.name}, 학년 : {self.grade}')
    """
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

    def __str__(self):
        return f'이름 : {self.name}, 학년 : {self.grade}'

    def learn(selfefl):
        print("수업을 듣습니다")

if __name__ == "__main__":

    s1 = Student('김하나','1')
    print(s1)
    s1.learn()

    s2 = Student('김기용',3)
    print(s2)
    s2.learn()