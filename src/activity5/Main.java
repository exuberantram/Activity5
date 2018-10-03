package activity5;

public class Main {

    public static void main(String[] args) {

        // Write a static main method that creates two objects,
        // one with the default constructor and the
        // other with the constructor with parameters.
        // Give sample data for the parameters.

        VehicleChassis myChassis = new VehicleChassis();

        VehicleChassis yourChassis = new VehicleChassis("cn");

        VehicleFrame myFrame = new VehicleFrame();

        VehicleFrame yourFrame = new VehicleFrame("Ladder Frame");


        System.out.println(myChassis.toString());
        System.out.println(yourChassis.toString());

        System.out.println(myFrame.toString());
        System.out.println(yourFrame.toString());


    }

}
