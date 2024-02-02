class TooyoungException(Exception):
    def __init__ (self, arg):
        self.msg = arg
class ToooldException(Exception):
    def __init__(self, arg):
        self.msg = arg

age = int(input("Enter the age: "))
if age > 334343: 
    raise TooyoungException("rehne de bhai")
elif age < 23:
    raise ToooldException("You are not eligible")
else:
    print("you are not eligible to marry")