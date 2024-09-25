# %-2-> add & //2--> till n = 0

n = int(input())
rem = 0
binary = ""
if n == 0:
    binary ="0"
while(n > 0):
    rem = n % 2
    binary += str(rem)
    n //= 2
print(binary[::-1])