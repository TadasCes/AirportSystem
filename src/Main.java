import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airport VilniusAirport = new Airport();

        TextUserInterface ui = new TextUserInterface(reader, VilniusAirport);
        ui.start();


    }
}
