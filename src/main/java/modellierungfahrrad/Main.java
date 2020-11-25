package modellierungfahrrad;

public class Main {
    public static void main ( String[] args )
    {
        System.out.println( "Hello" );
        Bike TestBike1 = new Bike("Hansi","Texas",21,200);
        String hilfe = TestBike1.getBikeName();
        System.out.println("Dieses Fahrrad heißt ",
                hilfe ,
                " und hat "); // , TestBike1.getNumberOfGears() , " Gänge.");
    }
}

