
# Implementing a software for a car service station using Object Oriented Programming.

## The car service station caters to different types of cars – Hatchback, Sedan, SUV.
## It provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.
## Each service has a service code associated with it and different prices for different types of cars.

# Classes & Methods
### 1. Model class:
- To store the price according to their service and model type of car.

### 2. Servicing class:
- This calss will chek and calculate the bill for different models of class.

#### Methods
- Check():- Will check the model of car entered from console and will instantiate the HashMap for model in Model class.
- calculateBill():- This method will accept the String of services which the client wants for their car, and will calculate the different service chareges according to their model of car and will return the bill amount of it.
