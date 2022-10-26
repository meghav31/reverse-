def reverseString(s):

   reversedString = ""

   for char in s:

       reversedString = char + reversedString

   return reversedString

s = input("Enter the String: ")

print("The original string was - ", s)

print("The reversed string is - ", reverseString(s))
