public class Lorry extends GroundTransportation {
    private int numberOfPallets;
    private int trailers;

    public Lorry(String licensePlate, int numberOfPallets, int trailers) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public Lorry() {
        this("", 0, 0);
    }

    // Getters e Setters
    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers() {
        return trailers;
    }

    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Number of Pallets: ").append(numberOfPallets).append("\n");
        sb.append("Number of Trailers: ").append(trailers).append("\n");
        return sb.toString();
    }
}

