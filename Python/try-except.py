# try:
#     # x = 10 / 0
#     num = int(input("Enter a number : "))
#     print(num)
# except ZeroDivisionError as err:
#     print(err)
# except ValueError as err2:
#     print(err2)
# #     print("Invalid Input")

x = 10
y = 3

try:
    z = x/y
    print(z)
except Exception as e:
    print("You have got an exception :",e)
else:
    print("Z is printed")
finally:
    print("All work is done !")