package polymorphismPrac;

public class Driver {
    public static void main(String[] args) {
        Ship[] shipList = new Ship[3];

        Ship ship = new Ship("ABC","2000");
        CruiseShip cruiseShip = new CruiseShip("BCD", "2018", 2000);
        CargoShip cargoShip = new CargoShip("DEF", "2023", 450);

        shipList[0] = ship;
        shipList[1] = cruiseShip;
        shipList[2] = cargoShip;

        for (Ship s : shipList){
            s.print();
        }
    }
}
