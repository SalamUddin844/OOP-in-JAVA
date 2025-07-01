public class CNG extends Threewheeler {

    CNG(String brand, String model, int passangers, int engine, String price, String type) {
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

    // public String getCarrier() {
    //     return this.carrier;
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

    // public void setCarrier(String carrier) {
    //     this.carrier = carrier;
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
                + " passangers. its engine is " + engine + "cc with having " ;
    }
}
