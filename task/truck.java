public class truck extends Fourwheeler {

    private int door;
    private int WeightLimit;

    truck(String brand, String model, int passangers, int engine, String type, int price, int door, int WeightLimit) {
        super(brand, model, passangers, engine, type, price);
        this.door = door;
        this.WeightLimit = WeightLimit;
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

    public int getDoor() {
        return this.door;
    }

    public int getWeightLimit() {
        return this.WeightLimit;
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

    public void setDoor(int door) {
        this.door = door;
    }

    public void setWeightLimit(int WeightLimit) {
        this.WeightLimit = WeightLimit;
    }

    /// ===========================Mthod overring======================////
    @Override
    public int maxSpeed() {
        return 120;

    }

    @Override
    public String mileage() {
        return "this truck goes 60 mile per Litter";
    }

    @Override
    public String showInfo() {
        return "this is " + type + " wheeler truck and its brand is " + brand + " and model is " + model
                + ". it can carry " + passangers + " passangers. its engine is " + engine + "cc with having " + door
                + " and it can carry " + WeightLimit + " KG weight maximum";
    }

}
