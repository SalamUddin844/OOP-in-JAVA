public abstract class Vechicle {
    public String brand;
    protected String model;
    protected int passangers;
    protected int engine;

    public Vechicle(String brand, String model, int passangers, int engine) {
        this.brand = brand;
        this.model = model;
        this.passangers = passangers;
        this.engine = engine;
    }

    /// ============================abstract methods============================///
    public abstract String showInfo();

    public abstract int maxSpeed();

    public abstract String mileage();
}
