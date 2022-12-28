# While loops

# pcom = lambda n: print(n, end=",")
# pend = lambda n: print(n)
#
# i = 1
# while i < 6:
#     if (i == 5):
#         print(i)
#     else:
#         pcom(i)
#     i += 1
#
# else:
#     pend("i is greater than 5")
#     print("Ok")

# arr = ["Yash", 3, 5, "Bhanderi"]
# str = "Hello"
#
# for i in arr:
#     print(i, end=",")
#
# print("")
#
# for i in str:
#     print(i, end=",")
#
# for i in range(6): print(i)
# for i in range(2,6): print(i)
# for i in range(1,10,2): print(i)

# num = int(input("Enter a number : "))
#
# for i in range(1,num):
#     print(i)

row = int(input("Enter row : "))
col = int(input("Enter col : "))
nested = []

for i in range(row):
    nested.append([])
    for j in range(col):
        x = int(input("Enter a number : "))
        nested[i].append(x)

for i in range(row):
    for j in range(col):
        print(nested[i][j],end=",")
    print(end="\n")