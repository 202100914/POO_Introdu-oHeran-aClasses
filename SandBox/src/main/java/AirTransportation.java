public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = (name != null && !name.isEmpty()) ? name : "";
        this.numberOfContainers = numberOfContainers;
        setFees(0.04);
    }

    public AirTransportation() {
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name != null && !name.isEmpty()) ? name : "";
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public String getTransportType(){
        return "Air Transport";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Aircraft Name: ").append(name).append("\n");
        sb.append("Number of Containers: ").append(numberOfContainers).append("\n");
        return sb.toString();
    }
}

