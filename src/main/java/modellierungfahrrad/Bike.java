package modellierungfahrrad;

enum typeOfGearSystem {
    DERAILLEUR,
    HUBGEAR
}

enum colour {
    RED,
    GREEN,
    YELLOW,
    WHITE,
    BLACK,
    BLUE
}

enum gender {
    MALE,
    FEMALE
}

public class Bike {
    private static final Owner EMPTY_OWNER_VALUE = null;
    private static final Seller EMPTY_SELLER_VALUE = null;

    // Bike Information
    private String bikeName;
    private String manufacturerName;
    private boolean lightsIncluded;
    private colour colour;
    private typeOfGearSystem gearSystem;
    private int numberOfGears;
    private typeOfGearSystem typeOfGearSystem;
    private float weight;
    private gender gender;
    private String bikeDespriction;

    // Seller Information
    private Seller seller;

    // Owner Information
    private Owner owner;

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean isLightsIncluded() {
        return lightsIncluded;
    }

    public void setLightsIncluded(boolean lightsIncluded) {
        this.lightsIncluded = lightsIncluded;
    }

    public modellierungfahrrad.colour getColour() {
        return colour;
    }

    public void setColour(modellierungfahrrad.colour colour) {
        this.colour = colour;
    }

    public modellierungfahrrad.typeOfGearSystem getGearSystem() {
        return gearSystem;
    }

    public void setGearSystem(modellierungfahrrad.typeOfGearSystem gearSystem) {
        this.gearSystem = gearSystem;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public modellierungfahrrad.typeOfGearSystem getTypeOfGearSystem() {
        return typeOfGearSystem;
    }

    public void setTypeOfGearSystem(modellierungfahrrad.typeOfGearSystem typeOfGearSystem) {
        this.typeOfGearSystem = typeOfGearSystem;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public modellierungfahrrad.gender getGender() {
        return gender;
    }

    public void setGender(modellierungfahrrad.gender gender) {
        this.gender = gender;
    }

    public String getBikeDespriction() {
        return bikeDespriction;
    }

    public void setBikeDespriction(String bikeDespriction) {
        this.bikeDespriction = bikeDespriction;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Bike(String bikeName, String manufacturerName, boolean lightsIncluded, modellierungfahrrad.colour colour, modellierungfahrrad.typeOfGearSystem gearSystem, int numberOfGears, modellierungfahrrad.typeOfGearSystem typeOfGearSystem, float weight, modellierungfahrrad.gender gender, String bikeDespriction) {
        this.bikeName = bikeName;
        this.manufacturerName = manufacturerName;
        this.lightsIncluded = lightsIncluded;
        this.colour = colour;
        this.gearSystem = gearSystem;
        this.numberOfGears = numberOfGears;
        this.typeOfGearSystem = typeOfGearSystem;
        this.weight = weight;
        this.gender = gender;
        this.bikeDespriction = bikeDespriction;
        this.seller = EMPTY_SELLER_VALUE;
        this.owner = EMPTY_OWNER_VALUE;
    }
}
