class Dog:

    # Class attribute
    species: str = 'mammal'

    # Initializer / Instance attributes
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Instance method
    def description(self):
        return self.name, self.age

    # Instance method
    def speak(self, sound):
        return "%s says %s" % (self.name, sound)

    # Instance method
    def eat(self):
        self.is_hungry = False 


class Pets:
    def __init__(self, dogs : list):
        self.dogs = dogs
        
d1 = Dog("a", 5)
d2 = Dog("v", 6)
d3 = Dog("s", 5)

print("Memory addresses are as follows: ")
dogs = [d1, d2, d3]
print(dogs)

print("I have ", len(dogs) , "dogs")

print("the actual values:")
for d in dogs:
    print(d.name, "is", d.age)
    
print("This all are : ", Dog.species)

