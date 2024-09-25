def gcd(a,b):
	if(b == 0):
		return a
	rem= a%b
	return gcd(b,rem,)
		
print(gcd(56,0))