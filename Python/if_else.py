# x = 10
# y = 10
# z = 0
# if (x == y):
#     print("x and y are same")
#     z = 10
# else:
#     print("x and y aren't same")
#     print(z)

marks = input("Enter Marks : ")
marks = int(marks)

if (marks >= 90):
    print("Distinction")
elif (marks >= 80 and marks < 90):
    print("2nd class")
elif (marks >= 33 and marks < 80):
    print("3rd class")
else:
    print("Fail!")
