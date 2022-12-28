# def sum(*args):
#     # print("a = ",ass); print("b = ",bss); print("c = ", css)
#     # print("Sum of number ", a, "+", b, "+", c, " is = ", z)
#     print(args[0])
#
#
# a = input("enter a : ")
# b = input("enter b : ")
# c = input("enter c : ")
# # a=int(a)
# # b=int(a)
# # c=int(a)
# sum(int(a), int(b), int(c))

# def func_any_datatype(**arg):
#     # print(arg[3])
#     print("My name is", arg["fname"], "and my surname is", arg["lname"])


# lst = [1,2,3,4,5]

# func_any_datatype(fname="Yash", lname="Bhanderi")

# func_any_datatype(lst)

def factorial(n, value):
    if(n==1):
        return value
    value *= n
    return factorial(n-1, value)

print(factorial(4,1))
