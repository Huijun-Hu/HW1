package polymorphismPrac;

public class CargoShip extends Ship{

    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print(){
        System.out.printf("\nCargoShip named %s has cargo ccapacity of %d tons",
                this.getName(), this.cargoCapacity);
    }
}
