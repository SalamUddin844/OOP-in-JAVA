public class AutoRickshawe extends Rickshaw {

    private int battary;

    AutoRickshawe(String brand, String model, int passangers, int engine, String price, String type, int battary) {
        super(brand, model, passangers, engine, price, type);
        this.battary = battary;
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
    public int getBattary() {
        return this.battary;
    }


    // public String getCarrier() {
    // return this.carrier;
    // }

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
    public void setBattary(int battary) {
        this.battary = battary;
    }

    // public void setCarrier(String carrier) {
    // this.carrier = carrier;
    // }

    /// ===========================Mthod overring======================////
    @Override
    public int maxSpeed() {
        return 100;

    }

    @Override
    public String mileage() {
        return "this car goes 25 mile per Litter";
    }

    @Override
    public String showInfo() {
        return "its brand is " + brand + " and model is " + model + ". it can carry " + passangers
                + " passangers. its engine is " + engine + "cc with having " + battary + " WT battary";
    }
}
