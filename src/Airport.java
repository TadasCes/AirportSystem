import java.util.ArrayList;

public class Airport {
    private final ArrayList<Airplane> planes;
    private final ArrayList<Flight> flights;


    public Airport() {
        this.planes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addAirplane(String id, int capacity) {
        Airplane newAirplane = new Airplane(id, capacity);
        planes.add(newAirplane);
    }

    public void printAllAirplanes() {
        for (Airplane plane : planes) {
            System.out.println(plane.toString());
        }
    }

    public void printAllFlights() {
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }
    }

    public void printAirplane(String id) {
        for (Airplane plane : planes) {
            if (plane.getAirplaneId().equals(id)) {
                System.out.println(plane.toString());
            }
        }
    }

    public Airplane getAirplaneFromId(String id) {
        for (Airplane plane : planes) {
            if (plane.getAirplaneId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public void addFlight(String planeID, String departure, String destinations) {
        Flight newFlight = new Flight(getAirplaneFromId(planeID), departure, destinations);
        flights.add(newFlight);
    }


}
