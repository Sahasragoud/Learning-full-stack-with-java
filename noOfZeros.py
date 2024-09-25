def count(n,c):
	if(n < 10):
		return c
	rem = n% 10
	if(rem == 0):
		return count(n//10,c+1)
	else:
		return count(n//10,c)
#	print(c)
print(count(10603,0))