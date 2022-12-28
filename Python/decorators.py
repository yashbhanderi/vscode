# def upper_text(text):
#     return text.upper()
#
#
# def lower_text(text):
#     return text.lower()
#
# def change_text(func):
#     greeting = func("Good Morning")
#     print(greeting)
#
# change_text(upper_text)
# change_text(lower_text)

# def adder(x):
#     def inner(y):
#         return x + y
#
#     return inner
#
#
# add_15 = adder(15)
#
# print(add_15(5))

def div(a, b):
    print("Before")
    print(a / b)


def decorator(func):
    def change(a, b):
        if a < b:
            a, b = b, a
        return func(a, b)
    print("In the decorators")
    return change


div = decorator(div)

print(div)
div(2, 4)
