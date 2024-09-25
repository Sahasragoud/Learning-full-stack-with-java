# abc = a^3+b^3+c^3

new = int(input())
n = new
rem = 0
sum =0
while (n> 0):
    rem = n % 10
    sum += (rem ** 3)  
    n //= 10
if new == sum :
    print("Armstrong number")
else:
    print("Not armstrong number")