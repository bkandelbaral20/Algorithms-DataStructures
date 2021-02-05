package javaRefresher;
/*

For this exercise, you will design a set of classes that work together to simulate a car's fuel gauge and odometer.
The classes you will design are the following:

The FuelGauge Class: This class will simulate a fuel gauge. Its responsibilities are as follows:
To know the car’s current amount of fuel, in gallons.
To report the car’s current amount of fuel, in gallons.
To be able to increment the amount of fuel by 1 gallon. This simulates putting fuel in the car.
( The car can hold a maximum of 15 gallons.)
To be able to decrement the amount of fuel by 1 gallon, if the amount of fuel is greater than 0 gallons.
This simulates burning fuel as the car runs.

The Odometer Class: This class will simulate the car’s odometer. Its responsibilities are as follows:
To know the car’s current mileage.
To report the car’s current mileage.
To be able to increment the current mileage by 1 mile. The maximum mileage the odometer can store is 999,999 miles.
When this amount is exceeded, the odometer resets the current mileage to 0.
To be able to work with a FuelGauge object. It should decrease the FuelGauge object’s current amount of fuel by 1
gallon for every 24 miles traveled. (The car’s fuel economy is 24 miles per gallon.)

Demonstrate the classes by creating instances of each. Simulate filling the car up with fuel, and then run a loop that
increments the odometer until the car runs out of fuel. During each loop iteration, print the car’s current mileage
and amount of fuel.
 */

public class CarInstrumentSimulator {

    public static void main(String[] args) {
        FuelGauge amountOfFuel = new FuelGauge(15);
        Odometer currentMileage = new Odometer(0);

        while (amountOfFuel.getAmountOfFuel() > 0) {
            currentMileage.incrementCurrentMileage();

            if (currentMileage.getCurrentMileage() % 24 == 0) {
                amountOfFuel.decrementFuel();
            }

            System.out.println("The car's current amount of fuel is : " + amountOfFuel.getAmountOfFuel() + " litres");
            System.out.println("The car's current mileage is : " + currentMileage.getCurrentMileage());
        }
    }

    // create a FuelGauage class
    static class FuelGauge {

        // constructor with int gallon parameter
        public FuelGauge(int gallons) {
            amountOfFuel = gallons;
        }

        // Variable for storing amount of fuel in gallon
        public int amountOfFuel;

        // Method to get the amount of fuel
        public int getAmountOfFuel() {
            return amountOfFuel;
        }

        // cars can hold 15 gallons of fuel
        // method to increment the amount of fuel by 1 gallon,
        public void incrementFuel() {
            if (amountOfFuel < 15) {
                amountOfFuel++;
            }
        }

        // method to decrement the current amount of fuel by 1 gallons
        public void decrementFuel() {
            if (amountOfFuel > 0)
                amountOfFuel--;
        }
    }

    // make a Odometer class which is able to work with Fuel Gauge object
    static class Odometer {

        // constructor with int miles parameter
        public Odometer(int miles) {
            currentMileage = miles;
        }

        //Variable to store current mileage
        public int currentMileage;

        // Method to get the amount of current mileage
        public int getCurrentMileage() {
            return currentMileage;
        }

        // Method to increment current mileage
        public void incrementCurrentMileage() {
            if (currentMileage < 999999) {
                currentMileage++;
            } else {
                currentMileage = 0;
            }
        }

        //Method to decrement the current mileage by 1 current mileage
        public void decrementCurrentMileage() {
            if (currentMileage > 24)
                currentMileage--;
        }
    }
}
