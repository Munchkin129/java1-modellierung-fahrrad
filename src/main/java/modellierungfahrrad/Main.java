package modellierungfahrrad;

public class Main {
    public static void main ( String[] args )
    {
        System.out.println( "Hello" );
        Bike TestBike1 = new Bike("Hansi","Texas",21,200);
        String hilfe = TestBike1.getBikeName();
        System.out.println("Dieses Fahrrad heißt "+ TestBike1.getBikeName() + " und hat " + TestBike1.getNumberOfGears() + " Gänge und gehört " + TestBike1.getBikeOwner());
        TestBike1.setNumberOfGears(TestBike1.getNumberOfGears()+1);
        TestBike1.setBikeOwner("Günther");
        System.out.println("Dieses Fahrrad heißt "+ TestBike1.getBikeName() + " und hat " + TestBike1.getNumberOfGears() + " Gänge und gehört " + TestBike1.getBikeOwner());
    }
}

