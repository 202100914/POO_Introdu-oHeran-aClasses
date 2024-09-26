import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown Company";
        this.inService = new ArrayList<>();
    }

    public ShippingCompany() {
        this("");
    }

    public boolean addTransport(Transport transport) {
        if (transport != null && this.add(transport)) {
            inService.add(transport);
            return true;
        }
        return false;
    }

    public boolean removeTransport(Transport transport) {
        if (inService.remove(transport)) {
            this.remove(transport);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transport> getInService() {
        return new ArrayList<>(inService);
    }

    private Transport getTransportation(String id) {
        return inService.stream()
                .filter(transport -> transport.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private void updateTransportDetails(Transport transport, String origin, String destination, double price, boolean available) {
        transport.setOrigin(origin);
        transport.setDestination(destination);
        transport.setPrice(price);
        transport.setAvailable(available);
    }

    public void makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransportation(id);

        if (transport != null && transport.isAvailable()) {
            updateTransportDetails(transport, origin, destination, price, false);

            inService.add(transport);
            this.remove(transport);
        }
    }

    public void finalizeTransportation(String id) {
        Transport transport = getTransportation(id);
        if (transport != null) {
            inService.remove(transport);
            updateTransportDetails(transport, "", "", 0.0, true);
            this.add(transport);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shipping Company: ").append(name).append("\n");
        sb.append("Transport in Service:\n");

        if (inService.isEmpty()) {
            sb.append("No transports in service.\n");
        } else {
            inService.forEach(transport -> sb.append(transport.toString()).append("\n"));
        }
        return sb.toString();
    }
}

