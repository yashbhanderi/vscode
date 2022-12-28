set1 = {"Yash", "bhanderi", 7, True}
set2 = {3, 6, 1, 3, 9, 2, 6, 7, 0}

for x in set1: print(x)
for x in set2: print(x,end=",")

set3 = {"apple", "amazon", "microsoft"}
set4 = {"apple", "mango", "banana"}

print(set3.union(set4))
print(set3.intersection(set4))
print(set3.symmetric_difference(set4))

