
myself = {
    "fname" : "Yash",
    "lname" : "Bhanderi",
    "age" : 19
}

print(myself)
print(myself["fname"], myself["lname"])

for x, y in myself.items():
        print(x,y)

for x in myself.values():
    print(x)
print(end="\n")

myself["mname"] = "Jamanbhai"
myself["age"] = 20

for x in myself:
    print(x)
    print(myself[x])
