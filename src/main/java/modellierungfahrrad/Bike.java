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
public class Bike {
    private static final int NUMBER_OF_TIRES = 2;
    private static final String EMPTY_OWNER_VALUE = "no owner";
    private static final typeOfGearSystem DEFAULT_TYPE_OF_GEAR_SYSTEM = typeOfGearSystem.DERAILLEUR;

    private String bikeName;
    private String companyName;
    private String owner;
    private typeOfGearSystem gearSystem;
    private int numberOfGears;
    private float price;
    private String bikeDespriction;
    private String articleNumber;
    private boolean lightsIncluded;
    private colour colour;


}
