package activity5;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Write a static main method that creates two objects,
        // one with the default constructor and the
        // other with the constructor with parameters.
        // Give sample data for the parameters.

//        VehicleChassis myChassis = new VehicleChassis();
//
//        VehicleChassis yourChassis = new VehicleChassis("cn");
//
//        VehicleFrame myFrame = new VehicleFrame();
//
//        VehicleFrame yourFrame = new VehicleFrame("Ladder Frame");


//        System.out.println(myChassis.toString());
//        System.out.println(yourChassis.toString());
//
//        System.out.println(myFrame.toString());
//        System.out.println(yourFrame.toString());

        ManufacturedEngine myEngine = new ManufacturedEngine();

        Date date = new Date(2012, 01, 03, 07,13,19);

        ManufacturedEngine yourEngine = new ManufacturedEngine("Honda", date, "H-series",
                "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");

        System.out.println(myEngine.toString());
        System.out.println(" ");
        System.out.println(yourEngine.toString());
        System.out.println(" ");

        InteriorFeature myIntFeature = new InteriorFeature();
        InteriorFeature yourIntFeature = new InteriorFeature("Climate Control");

        System.out.println(myIntFeature.toString());
        System.out.println(yourIntFeature.toString());

        ExteriorFeature myExFeature = new ExteriorFeature();
        ExteriorFeature yourExFeature = new ExteriorFeature("Fog Lamps");

        System.out.println(myExFeature.toString());
        System.out.println(yourExFeature.toString());



    }

}
