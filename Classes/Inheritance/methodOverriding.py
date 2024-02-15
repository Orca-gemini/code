class Vehicle:
    def __init__(self, name, max_speed, mileage):
        self.name = name
        self.max_speed = max_speed
        self.mileage = mileage

    def seating_capacity(self, capacity):
        print("The capacity of the", self.name , "is", self.capacity)


# Method overriding
class Bus(Vehicle):
    def seating_capacity(self, capacity = 50):
        print("The capacity of the", self.name , "is", capacity)

bus = Bus("", 500, 2)
bus.seating_capacity()


