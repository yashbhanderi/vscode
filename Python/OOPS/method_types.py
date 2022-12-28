class Student:
    school = 'XYZ'

    def __init__(self, m1, m2, m3):
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3

    def avg(self):
        return (self.m1 + self.m2 + self.m3) / 2

    @classmethod
    def getSchoolName(cls):
        print(cls.school)

    @staticmethod
    def static_method():
        Student.school = "Yash Bhanderi"
        print("This is static method!")

s1 = Student(40, 50, 60)
s2 = Student(42, 54, 70)

print(s1.avg())
print(s2.avg())
s1.static_method()
Student.getSchoolName()