public class GroundTransportation extends Transport{
    private String licensePlate;

    public GroundTransportation() {
        this("");
    }

    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = (licensePlate != null && !licensePlate.isEmpty()) ? licensePlate : "";
        setFees(0.03);
    }

    // Getter e Setter para licensePlate
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String getTransportType(){
        return "Ground Transport";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("License Plate: ").append(licensePlate).append("\n");
        return sb.toString();
    }
}
