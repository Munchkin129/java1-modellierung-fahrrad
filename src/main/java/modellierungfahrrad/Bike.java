package modellierungfahrrad;

enum typeOfGearSystem {
    DERAILLEUR,
    HUBGEAR
}

public class Bike {
    private static final int NUMBER_OF_TIRES = 2;
    private static final String EMPTY_OWNER_VALUE = "no owner";
    private static final typeOfGearSystem DEFAULT_TYPE_OF_GEAR_SYSTEM = typeOfGearSystem.DERAILLEUR;

    private String bikeName;
    private String companyName;
    private String bikeOwner;
    private typeOfGearSystem gearSystem;
    private int numberOfGears;
    private float bikePrice;


    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBikeOwner() {
        return bikeOwner;
    }

    public void setBikeOwner(String bikeOwner) {
        this.bikeOwner = bikeOwner;
    }

    public typeOfGearSystem getGearSystem() {
        return gearSystem;
    }

    public void setGearSystem(typeOfGearSystem gearSystem) {
        this.gearSystem = gearSystem;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public float getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(float bikePrice) {
        this.bikePrice = bikePrice;
    }

    public Bike(String bikename, String companyName, int numberOfGears, float bikePrice) {
        this.bikeName = bikename;
        this.companyName = companyName;
        this.numberOfGears = numberOfGears;
        this.bikePrice = bikePrice;

        this.bikeOwner = EMPTY_OWNER_VALUE;
        this.gearSystem = DEFAULT_TYPE_OF_GEAR_SYSTEM;
    }


}
