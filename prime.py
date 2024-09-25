n = int(input("Enter a number:"))
count=0
for i in range(n+1):
		if(n%i == 0):
			 count += 1;
if(count <= 2):
	 print("prime")
else :
	 print("not prime")#					
					