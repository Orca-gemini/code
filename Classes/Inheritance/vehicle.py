class Vehicle:
    def __init__(self, name, mileage, capacity):
        self.name = name
        self.mileage = mileage
        self.capacity = capacity

    def fare(self):
       return self.capacity * 100


class school(Vehicle):
   def fare(self):
      amount = super().fare()
      return amount + (0.1 * amount)
  
sb = school("schoolBus", 12, 50)
print("Total bus fare: ", sb.fare())
