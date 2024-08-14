# 3.1-MPG

## Java Documentation
[Classes and Objects](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)

## Java Tutorials
[Classes and Objects](https://runestone.academy/ns/books/published/apcsareview/JavaBasics/toctree.html)

## Background:
1. Professional programmers carefully design the classes they need before any coding is done. With
well-designed classes, programming is much easier and the program has fewer bugs. Objectoriented design consists of deciding what classes are needed, what data they will hold, and how
they will behave. All these decisions are documented (written up) and then examined. If
something doesn't look right, it is fixed before any programming is done.

2. The specifications of a class that models the fuel efficiency of a car could be:

    Variables:
    ```java
        int myStartMiles; // Starting odometer reading
        int myEndMiles; // Ending odometer reading
        double myGallonsUsed; // Gallons of gas used between the readings
    ```
    Constructors:
    ```java
        // Creates a new instance of a Car object with the starting
        // odometer readings.
        Car(int odometerReading)
    ```
    Methods:
    ```java
        // Simulates filling up the tank. Record the current odometer reading
        // and the number of gallons to fill the tank.
        void fillUp(int odometerReading, double gallons)

        // Calculates and returns the miles per gallon for the car
        double calculateMPG()

        // Resets the myStartMiles to the current odometer reading and
        // resets the gallons used to zero.
        double resetMPG()
    ```
## Assignment:
1. Implement a Car class with the following properties.
    - A Car keeps track of the starting odometer reading, ending odometer reading, and the number of gallons used between readings.
    - The initial odometer reading is specified in the constructor.
    - A method calculateMPG calculates and returns the miles per gallon for the car.
    - A method fillUp simulates filling up the tank at a gas station: odometerReading is the current odometer reading and gallons is the number of gallons that filled the tank. Save these values in instance variables.
    - With this information, miles per gallon can be calculated. calculateMPG will calculate the miles per gallon since the last time resetMPG was called.

2. Write a testing class with a main method that constructs a car and calls fillUp and calculateMPG a few times. 

    Sample usage would be:
    ```java
    Car auto = new Car(15);
    System.out.println(“New car odometer reading: “);
    auto.fillUp(150,8);
    System.out.println(“Miles per gallon” + auto.calculateMPG());
    System.out.println(“Miles per gallon” + auto.calculateMPG());
    auto.resetMPG();
    auto.fillUp(350, 10);
    auto.fillUp(450, 20);
    System.out.println(“Miles per gallon” + auto.calculateMPG());
    auto.resetMPG();
    auto.fillUp(603, 25.5);
    System.out.println(“Miles per gallon” + auto.calculateMPG());
    ```

    Sample Output:
    ```java
    New car odometer reading: 15
    Miles per gallon: 16.875
    Miles per gallon: 16.875
    Miles per gallon: 10.0
    Miles per gallon: 6.0
    ```
    
