public class Transport {
    private String id;
    private String origin;
    private String destination;
    private double price;
    private double fees;
    private boolean available;

    private static int counter = 0;

    public Transport() {
        this.id = String.format("T-%03d", ++counter);
        this.origin = "";
        this.destination = "";
        this.price = 0.0;
        this.fees = 0.0;
        this.available = true;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public double getFees() {
        return fees;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPriceWithFees(){
        return price + (price * fees);
    }

    public String getTransportType(){
        return "Generic Transport";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transport Type: ").append(getTransportType()).append("\n");
        sb.append("Transport ID: ").append(id).append("\n");
        sb.append("Origin: ").append(origin).append("\n");
        sb.append("Destination: ").append(destination).append("\n");
        sb.append("Price: ").append(price).append("\n");
        sb.append("Fees: ").append(fees).append("\n");
        sb.append("Total Price with Fees: ").append(getPriceWithFees()).append("\n");
        sb.append("Available: ").append(available ? "Yes" : "No").append("\n");
        return sb.toString();
    }
}
