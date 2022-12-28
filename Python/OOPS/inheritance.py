class A:
    var_a = 10

    def __init__(self):
        print("init - class A")

    def fun1(self):
        print("fun1 - A")


class B:
    var_b = 20

    def __init__(self):
        print("init - class B")

    def fun2(self):
        print("fun2 - B")


class C(A, B):
    def __init__(self):
        super().__init__()
        print("init - class C")

    def fun3(self):
        super().fun1()
        super().fun2()
        print("fun3 - C")


obj = C()
obj.fun3()
print(obj.var_a)
print(obj.var_b)
