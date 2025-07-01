public class paddleRickshaw extends Rickshaw {

    paddleRickshaw(String brand, String model, int passangers, int engine, String price, String type) {
        super(brand, model, passangers, engine, price, type);

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

    

    /// ===========================Mthod overring======================////
    @Override
    public int maxSpeed() {
        return 40;

    }

    @Override
    public String mileage() {
        return "this paddle rickshaw can go 20 km per hour";
    }

    @Override
    public String showInfo() {
        return "its brand is " + brand + " and model is " + model + ". it can carry " + passangers
                + " passangers. its engine is " + engine + "cc with having ";
    }
}
