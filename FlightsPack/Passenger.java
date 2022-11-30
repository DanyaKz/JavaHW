package FlightsPack;


public class Passenger {
    private String name;
    private int documentNumber;

    public Passenger(String name, int documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Passenger)) {
            return false;
        }

        Passenger user = (Passenger) o;

        return user.name.equals(name) &&
                user.documentNumber == documentNumber ;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + documentNumber;
        return result;
    }

}
