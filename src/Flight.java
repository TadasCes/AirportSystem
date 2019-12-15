public class Flight {
    private String departure;
    private String destination;
    private Airplane airplane;

    public Flight(Airplane airplane, String departure, String destination) {
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
