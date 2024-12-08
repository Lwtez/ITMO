a = [1,2,3,4,5,6,7,8,9]
b = []
c = []
for x in a:
    if x%2 == 0:
        b.append(x)
    else:
        c.append(x)
print(b)
print(c)
