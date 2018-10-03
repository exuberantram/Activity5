package activity5;

public class VehicleFrame implements Chassis {

    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    private String vehicleFrameType;

    @Override
    public Chassis getChassisType() {
        return null;
    }

    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    public String toString() {
        return
                "Chassis:" + chassis + "\n" +
                        "Vehicle Frame" + vehicleFrameType;

    }

}
