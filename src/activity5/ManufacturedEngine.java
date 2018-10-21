package activity5;

import java.util.Date;

// Create a concrete class named ManufacturedEngine that implements the interface Engine
public class ManufacturedEngine implements Engine {

    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    public ManufacturedEngine() {
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineType = "85 AKI";
        this.engineCylinders = 0;
        this.driveTrain = "2WD: Two-Wheel Drives";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
                              String engineMake, String engineModel, String engineType,
                              int engineCylinders, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    @Override
    public void setEngineManufacturedDate(Date engineManufacturedDate) {
        this.engineManufacturedDate = engineManufacturedDate;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String toString() {
        return
                "Engine Manufacturer: " + engineManufacturer + "\n" +
                        "Engine Manufactured: " + engineManufacturedDate + "\n" +
                        "Engine Make: " + engineMake + "\n" +
                        "Engine Model: " + engineModel + "\n" +
                        "Engine Type: " + engineType + "\n" +
                        "Engine Cylinders: " + engineCylinders + "\n" +
                        "Drive Train: " + driveTrain;


    }
}
