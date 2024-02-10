class Dog:
    species : str = "Canines"
    def __init__(this, name, color, height, age, breed):
        this.name : str = "A"
        this.age : int = 3
        this.breed : str = "Gs"
        this.color : str = "white"
        this.height : float = 34.5
        this.sp: list = [] 
        this.isStray : bool = True
        
    def birthday(this):
        this.age += 1
        print("Age is: ", this.age)
    
    def height(this, height):
        print("Height: ", + this.height)
        
    def change_Activity(this, activity):
        this.sp.append("activity")

d1 = Dog("D", 3, "ds", "white", "Sd", True)
print(d1.species)
d1.sp = ["bark", "eat", "slee"]
print(d1.sp)

d1.change_Activity("Diving")
print(d1.sp)