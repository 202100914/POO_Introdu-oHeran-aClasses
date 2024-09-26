public class Van extends GroundTransportation {
    private int packages;

    public Van(String licensePlate, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

    public Van() {
        this("", 0);
    }

    // Getter
    public int getPackages() {
        return packages;
    }

    // Setter
    public void setPackages(int packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Number of Packages: ").append(packages).append("\n");
        return sb.toString();
    }
}
