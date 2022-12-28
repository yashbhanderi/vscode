values = [10, 20, 30, 40, 50]


#
# itr = iter(values)
#
# while True:
#     try:
#         # val =
#         print(next(itr))
#     except StopIteration:
#         break

def gen():
    x = len(values)-1
    while x>=0:
        yield values[x]
        x-=1

val = gen()

for i in val:
    print(i)
