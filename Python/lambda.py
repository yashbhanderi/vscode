from functools import reduce

# f = lambda a: a * a
#
# print(f(2))
# print(f(4))
# print(f(6))
# print(f(8))

nums = [1, 3, 4, 2, 6, 7, 8, 2, 5, 9]

print(list(map(lambda a: a * a, nums)))
print(list(filter(lambda a: a%2==0, nums)))
print(reduce(lambda a,b: a+b, nums))
