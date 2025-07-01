///=============Encapsulation and inheritance===============///

public class car extends Fourwheeler {

    private int door;

    car(String brand, String model, int passangers, int engine, String type, int price, int door) {
        super(brand, model, passangers, engine, type, price);

        this.door = door;
    }

    //// ==============================getter method=============================///

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getPassangers() {
        return this.passangers;
    }

    public int getEngine() {

        return this.engine;
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDoor() {
        return this.door;
    }

    /// =====================setter method=======================///

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    /// ===========================Mthod overring======================////
    @Override
    public int maxSpeed() {
        return 180;

    }

    @Override
    public String mileage() {
        return "this car goes 80 mile per Litter";
    }

    @Override
    public String showInfo() {
        return "this is " + type + " wheeler car and its brand is " + brand + " and model is " + model
                + ". it can carry " + passangers + " passangers. its engine is " + engine + "cc with having " + door
                + " door";
    }
}
