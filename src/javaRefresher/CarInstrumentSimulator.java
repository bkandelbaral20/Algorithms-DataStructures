package javaRefresher;

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
