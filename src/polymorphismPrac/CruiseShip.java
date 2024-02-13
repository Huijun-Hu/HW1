package polymorphismPrac;

public class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name,yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
   public void print(){
        System.out.printf("\nCruiseShip named %s can carry a maximum of %d passengers",
                this.getName(), this.maxPassengers);
    }
}
