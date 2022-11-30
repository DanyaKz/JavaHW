package FlightsPack;

import java.util.*;

public class Main {
    static Map<Integer, Set<Passenger>> flightsData = new TreeMap<Integer, Set<Passenger>>();
    static List<Flight> flights = new ArrayList<Flight>();
    static List<Passenger> passengers = new ArrayList<Passenger>();

    public static void main(String[] args) {
        createFlights();
        createPassengers();
        addPassengersToFlights();
        fillFligthData();
        printFlightsData();
    }

    static void addPassengersToFlights(){
        Collections.sort(flights);
        flights.get(0).addPassengers(passengers.get(0));
        flights.get(0).addPassengers(passengers.get(1));
        flights.get(1).addPassengers(passengers.get(2));
        flights.get(1).addPassengers(passengers.get(3));
        flights.get(1).addPassengers(passengers.get(4));

    }

    static void createFlights(){
        flights.add(new Flight(2, "Tokyo", "Kyoto"));
        flights.add(new Flight(1, "Astana", "Tokyo"));
    }

    static void createPassengers(){
        passengers.add(new Passenger("Subaru",442312));
        passengers.add(new Passenger("Rem",442422));
        passengers.add(new Passenger("Meliodas",442867));
        passengers.add(new Passenger("Meliodas",442867));
        passengers.add(new Passenger("Elizabeth",442356));
    }

    static void fillFligthData(){
        for (Flight f: flights){
            flightsData.put(f.getNumber() , f.getPassengers());
        }
    }



    static void printFlightsData(){
        for (var fg: flightsData.entrySet()){
            String route = flights.get(fg.getKey()-1).getFromCity() +
                    " - " + flights.get(fg.getKey()-1).getFromCity();
            System.out.println("Flight " + route);
            for (Passenger p: fg.getValue()){
                System.out.println("\t" + p.getName());
            }
        }
    }

}
