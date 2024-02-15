class OperatingSystem:
    def __init__(self, name, version, year):
        self.__name = name
        self.__version = version 
        self.__year = year
    
    def __getName(self):
        print("The name is: ", self.__name)
    
    def _getVersion(self):
        print("The version is: ", self.__version)
        print("The year is: ", self.__year)
    
    def print():
        print("Yeah working")

# inheritance: 
class MobileOs(OperatingSystem):
    pass 

Mos = MobileOs("NM", 5.6, 2005)
Mos.print()



