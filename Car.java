public class Car {
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;

    public Car(int odometerReading) {
        myStartMiles = odometerReading;
        myEndMiles = odometerReading;
    }
    
    public int getOdometerReading() {
        return myEndMiles;
    }

    public void fillUp(int odometerReading, double gallons) {
        myEndMiles = odometerReading;
        myGallonsUsed += gallons;
    }

    public double calculateMPG() {
        double milesPerGallon = (myEndMiles - myStartMiles) / myGallonsUsed;
        return milesPerGallon;
    }

    public void resetMPG() {
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
}
