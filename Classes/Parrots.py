class Parrot:
    counter = 7000
    def __init__(self, name, color):
        self.__name = name
        self.__color = color
        self.__unique_number = Parrot.counter + 1
        Parrot.counter += 1

    def get_name(self):
        return self.name
    
    def get_color(self):
        return self.color
    
    def get_unique_number(self):
        return self.unique_number
    
p1 = Parrot("p", "blue")
print(p1.counter)

p2= Parrot("p", "blue")
 
p3 = Parrot("p", "blue")
print(p3.counter)