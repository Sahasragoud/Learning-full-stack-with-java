def revString(text,i):
	if(i == 0):
		return text[0]
	return text[i] + revString(text,i-1)
txt = "mam"
n = len(txt)
rev= (revString(txt,n-1))

if (txt == rev):
	print("Pallindrome")
else:
	print("Not pallindrome")