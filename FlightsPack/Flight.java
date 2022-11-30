package FlightsPack;


import java.util.HashSet;
import java.util.Set;

public class Flight implements Comparable<Flight> {
    private int number;
    private String fromCity;
    private String toCity;
    private Set<Passenger> passengers = new HashSet<Passenger>();

    public Flight(int number, String fromCity, String toCity) {
        this.number = number;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public int getNumber() {
        return number;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }


    public boolean addPassengers(Passenger passenger) {
        return passengers.add(passenger);
    }

    public void setPassengers(Set<Passenger> passengers) {
        this.passengers = passengers;
    }


    @Override
    public int compareTo(Flight f) {
        return Integer.compare(number, f.number);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
