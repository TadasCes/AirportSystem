import java.util.Scanner;

public class TextUserInterface {
//
//                        System.out.println("*********************");
//                    System.out.println(userInput);
//                    System.out.println("*********************");

    public TextUserInterface(Scanner reader, Airport airport) {

        startInterface(reader, airport);


    }

    public void startInterface(Scanner reader, Airport airport) {
        airportPanel(reader, airport);
        flightService(reader, airport);
    }

    public void flightService(Scanner reader, Airport airport) {
        System.out.println("Flight service");
        System.out.println("--------------------");

        while (true) {
            printFlightMenu();
            String userInput = reader.nextLine();

            if (userInput.equals("1")) {
                printPlanes(airport);

            } else if (userInput.equals("2")) {
                airport.printAllFlights();
                System.out.println();
            } else if (userInput.equals("3")) {
                printPlane(reader, airport);
                System.out.println();
            } else if (userInput.equals("x")) {
                break;
            } else {
                System.out.println("Command unrecognised. Try again");
            }
        }
    }

    public void airportPanel(Scanner reader, Airport airport) {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while (true) {
            printAddMenu();
            String userInput = reader.nextLine();

            if (userInput.equals("x")) {
                System.out.println();
                break;
            } else if (userInput.equals("1")) {
                addPlane(reader, airport);

            } else if (userInput.equals("2")) {
                addFlight(reader, airport);

            } else {
                System.out.println("Command unrecognised. Try again");
            }

        }
    }

    public void addPlane(Scanner reader, Airport airport) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        airport.addAirplane(planeID, planeCapacity);
    }

    public void addFlight(Scanner reader, Airport airport) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        if (airport.getAirplaneFromId(planeID) != null) {
            System.out.print("Give departure airport code: ");
            String departure = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destination = reader.nextLine();
            airport.addFlight(planeID, departure, destination);
        } else {
            System.out.println("Plane not found. Try again");
        }
    }


    public void printPlanes(Airport airport) {
        airport.printAllAirplanes();
    }

    public void printPlane(Scanner reader, Airport airport) {
        System.out.println("Give plane ID:");
        String input = reader.nextLine();
        airport.printAirplane(input);
    }

    public void printAddMenu() {
        System.out.print("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit\n"
                + "> ");
    }

    public void printFlightMenu() {
        System.out.println("Choose operation: \n" +
                "[1] Print planes\n" +
                "[2] Print flights\n" +
                "[3] Print plane info\n" +
                "[x] Quit\n");

    }

    public void start() {

    }
}
