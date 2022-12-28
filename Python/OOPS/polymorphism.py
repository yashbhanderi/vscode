# DUCK Typing
# class Bird:
#     def fly(self):
#         print("Birds Fly")
#
#
# class RobotBird:
#     def fly(self):
#         print("Robot Birds Fly")
#
#
# class Fish:
#     def swim(self):
#         print("Fish Swims")
#
#
# for x in (Bird(), RobotBird(), Fish()):
#     x.fly()

# OPERATOR OVERLOADING
#
# class Student:
#
#     def __init__(self, m1, m2):
#         self.m1 = m1
#         self.m2 = m2
#
#     def __add__(self, other):
#         return "{} {}".format(self.m1 + other.m1, self.m2 + other.m2)
#
#
# s1 = Student(50, 60)
# s2 = Student(45, 73)
#
# print(s1 + s2)

#METHOD OVERRIDING

class A:

    def show(self,x):
        print("in class - A")

class B(A):

    def show(self,x):
        print("in class - B")


obj = B()

obj.show(10)



















