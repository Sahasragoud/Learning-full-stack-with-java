#sum of digits in num
def sum(n):
	if (n == 0):
		return 0
	rem = n % 10
	return rem + sum(n//10)
print(sum(3571))