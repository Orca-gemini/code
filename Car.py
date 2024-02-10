class Car:
    carcount : int = 0
    def __init__(this, color, mileage, speed, fuel_type):     # constructor 
        this.color = color 
        this.mileage = mileage 
        this.speed = speed 
        this.fuel_type = fuel_type 
        this.gear =  0 
        Car.carcount += 1
        # carcount is updated each time i make an object
    
    # instance method 
    def run(this):
        print("Gear set to", this.gear,"the car is running at",this.speed)
    
    def change_gear(this, gear):
        this.gear = gear 
    
    # make the change speed function 
    def change_speed(this, speed):
        this.speed = speed 
c1 = Car("Blue", 25, 270, "Petrol")
c2 = Car("Red", 15, 170, "Diesel")

cars = [c1, c2]
print("I have ", len(cars), cars)

print(dir(c1)) ## list all properties related with the car !! 

print(Car.carcount)
