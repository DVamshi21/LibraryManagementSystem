package models.library;

public class Rack {

    private int rackNumber;
    private String locationIdentifier;
    public Rack(int rackNumber, String locationIdentifier) {
        this.rackNumber = rackNumber;
        this.locationIdentifier = locationIdentifier;
    }
   
    public String getLocationIdentifier() {
        return locationIdentifier;
    }
}
