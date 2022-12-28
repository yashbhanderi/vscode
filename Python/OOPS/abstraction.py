from abc import ABC, abstractmethod


class A(ABC):

    @abstractmethod
    def anything(self, x):
        pass

    def any2(self):
        print("This is static - A")


class B(A):

    def anything(self, x):
        print("This is B -", x)

    def any3(self):
        print("This is static - B")


obj = B()
obj.anything(10)
obj.any2()
obj.any3()

