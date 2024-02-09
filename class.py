class Student:
    def __init__(self, name, phy, chem, bio):
        self.name = name
        self.phy = phy
        self.chem = chem
        self.bio = bio 
    
    def totalObtained(self):
        result = (self.phy + self.chem + self.bio) 
        return result
        
St = Student("Yash", 25,26,28)
St2 = Student("Djdj", 45,56,43)
print(St2.totalObtained())
print(St.totalObtained())