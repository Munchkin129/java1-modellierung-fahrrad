package modellierungfahrrad;

public class Owner {
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }
}
