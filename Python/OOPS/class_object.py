# class Person:
#
#     def __init__(self, name, age):
#         self.MyName = name
#         self.MyAge = age
#         print("Constructor Called For",self.MyName)
#
#     def myself(self):
#         print("Hello, My name is", self.MyName, "\nMy age is", self.MyAge)
#
#
# per1 = Person("Yash Bhanderi", 19)
# per1.myself()
# per2 = Person("Dhruv Kakadiya", 20)
# per2.myself()
#
# # print(per1.MyName)
# # print(per1.MyAge)
# # per1.myself()

#Instance variables and Class Variables

class Car:

    wheels = 4

    def __init__(self, company, milage):
        self.Com = company
        self.Mil = milage


car1 = Car("BMW", 20)
car2 = Car("Ferrai", 24)

car1.Mil = 18
Car.wheels = 5

print(car1.Com, car1.Mil, car1.wheels)
print(car2.Com, car2.Mil, car2.wheels)
