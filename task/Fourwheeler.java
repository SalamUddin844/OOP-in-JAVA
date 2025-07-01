public abstract class Fourwheeler extends Vechicle {

    protected String type;
    protected int price;

    Fourwheeler(String brand, String model, int passangers, int engine, String type, int price) {
        super(brand, model, passangers, engine);
        this.type = type;
        this.price = price;
    }

}
