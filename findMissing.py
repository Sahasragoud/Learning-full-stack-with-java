list1 = [1,2,3,6,4]
list1.sort()
n = list1[-1]
for i in range(1,n+1):
    if i not in list1 :
        print(i)
        break