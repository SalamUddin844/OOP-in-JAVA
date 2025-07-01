public abstract class Twowheeler extends Vechicle {

    protected String price;
    protected String type;

    Twowheeler(String brand, String model, int passangers, int engine, String price, String type) {
        super(brand, model, passangers, engine);
        this.price = price;
        this.type = type;
    }

}
