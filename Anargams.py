str1 = input()
str2 = input()
if(sorted(str1.lower()) == sorted(str2.lower())):
    print("Anagrams")
else:
    print("Not anagrams")