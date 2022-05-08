n = 5
fact = 1
# factorial
while(n != 0):
    fact = fact * n
    n = n-1
print(fact)

# l = len(str(fact))
# print(l)

lst = []  # declare l size array
while(int(fact) != 0):
    #lst.append(int(fact) % 10)

    lst.insert(0, (int(fact) % 10))
    print(lst)
    fact = fact / 10

print(lst)

# reverse the list
# print(lst[::-1])

for i in range(len(lst)):
    # print(lst[i])
    if(lst[i] == 0):
        print(lst[i-1])
        break
