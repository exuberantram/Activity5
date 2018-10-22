package activity5;

import java.util.Date;

public class Vehicle implements Engine, Chassis {
    Date vehicleManufacturedDate;
    String vehicleManufacturer;
    String vehicleMake;
    String vehicleModel;
    Chassis vehicleFrame;
    String vehicleType;
    String driveTrain;
    Engine vehicleEngine;

    public Vehicle() {
        this.vehicleManufacturedDate = new Date();
        this.vehicleManufacturer = "Generic";
        this.vehicleMake = "Generic";
        this.vehicleModel = "Generic";
        this.vehicleFrame = new VehicleChassis();
        this.vehicleType = "None";
        this.driveTrain = "2WD: Two-Wheel Drive";
        this.vehicleEngine = new ManufacturedEngine();

    }

    public Vehicle(Date vehicleManufacturedDate,
                   String vehicleManufacturer,
                   String vehicleMake,
                   String vehicleModel,
                   Chassis vehicleFrame,
                   String vehicleType,
                   String driveTrain,
                   Engine vehicleEngine) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    public Date getVehicleManufacturedDate() {
        return vehicleManufacturedDate;
    }

    public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Chassis getVehicleFrame() {
        return vehicleFrame;
    }

    public void setVehicleFrame(Chassis vehicleFrame) {
        this.vehicleFrame = vehicleFrame;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public Engine getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(Engine vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public Chassis getChassisType() {
        return null;
    }

    public void setChassisType(String VehicleChassis) {
        this.vehicleFrame.setChassisType(VehicleChassis);
    }

    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    public void setEngineManufacturer(String manufacturer) {
        this.vehicleEngine.setEngineManufacturer(manufacturer);
    }

    public void setEngineMake(String engineMake) {
        this.vehicleEngine.setEngineMake(engineMake);
    }

    public void setEngineModel(String engineModel) {
        this.vehicleEngine.setEngineModel(engineModel);
    }

    public void setEngineType(String engineType) {
        this.vehicleEngine.setEngineType(engineType);
    }

    public String toString() {
        return
                "Manufacturer Name: " + this.vehicleManufacturer + "\n" +
                        "Manufactured Date: " + this.vehicleManufacturedDate + "\n" +
                        "Vehicle Make     : " + this.vehicleMake + "\n" +
                        "Vehicle Model    : " + this.vehicleModel + "\n" +
                        "Vehicle Type     : " + this.vehicleType + "\n" +
                        vehicleEngine.toString();
    }


}

