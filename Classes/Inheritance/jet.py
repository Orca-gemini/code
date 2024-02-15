class Jets:
    model = None
    country = 0

    def __init__(self, name, country):
        self.type = "Jet"
        self.area = "Air"
        self.name = name
        self.origin = country
        
        
class F14(Jets):
    engine = 2 
    seat = 2 
    tail = 2
    def __init__(self):
        self.name = "F14"
        self.country = "America"
    
obj = F14()
print(obj)
