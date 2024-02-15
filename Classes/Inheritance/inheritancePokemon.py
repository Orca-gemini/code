class Pokemon:
    def __init__(self, name):
        self.name = name 
    
    def info(self):
        print(self.name, "is a Pokemon!")

class WaterPokemon(Pokemon):
    type = "water"
    
    def info(self):
        super().info() # calls the parent class !! 
        print(self.name, "is a", self.type,  "pokemon")


a = WaterPokemon("Bulbosaur")
a.info()

