public class Airplane {
    private String airplaneId;
    private int airplaneCapacity;


    public Airplane(String id, int capacity) {
        this.airplaneId = id;
        this.airplaneCapacity = capacity;
    }

    public String getAirplaneId() {
        return this.airplaneId;
    }

    public int getAirplaneCapacity() {
        return this.airplaneCapacity;
    }

    @Override
    public String toString() {
        return this.airplaneId + " (" + this.airplaneCapacity + " ppl)";
    }
}
