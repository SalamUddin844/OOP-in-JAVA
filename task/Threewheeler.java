public abstract class Threewheeler extends Vechicle {

    protected String price;
    protected String type;

    Threewheeler(String brand, String model, int passangers, int engine, String price, String type) {
        super(brand, model, passangers, engine);
        this.price = price;
        this.type = type;
    }

}
