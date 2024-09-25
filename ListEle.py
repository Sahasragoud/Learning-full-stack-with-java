def ele(list,i):
	if(i == len(list)):
		return
	print(list[i])
	ele(list,i+1)
list2= [2,4,7,9]
ele(list2,0)