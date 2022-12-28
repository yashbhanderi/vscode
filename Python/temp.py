# a = 10

# def incr():
#     global a
#     a += 1

# print(a)
# incr()
# print(a)

def fact(n):
    if n==1: return 1
    return n*fact(n-1)

for i in range(1,65):
    print(i, 2**i)
