from student2 import Student
"""
st1 = Student2.Student('이셋', 3)
st1.info()
"""
# 객체 리스트 생성
student = [
    Student("김하나", 1),
    Student("박둘", 2),
    Student("이셋", 3)
]

# 특정한 학생
student[0].info()
student[1].info()

#전체 조회
for i in student:
    i.info()