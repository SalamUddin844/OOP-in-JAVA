import java.util.*;

public class Main {

    public static void main(String[] args) {

        // car car1=new car("null", "null01", 1, 100,"jani na",10,10);

        List<Vechicle>vehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Vechicle you want to make : ");
        int numberofObject = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Vechicle Name : ");
        String Name = sc.nextLine();

        System.out.println("Enter Brand name : ");
        String brand = sc.nextLine();

        System.out.println("Enter model name : ");
        String model = sc.nextLine();

        System.out.println("Enter passanger numbers : ");
        int passangers = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Enginer type in cc : ");
        int engine = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter vehicle types (two three and four wheeler) : ");
        String type = sc.nextLine();

        sc.nextLine();

        System.out.println("Enter number of doors : ");
        int door = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter price of the vehicle : ");
        int price = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter weightlimit of the vahicle : ");
        int WeightLimit = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter carrier type : ");
        String carrier = sc.nextLine();

        for (int i = 0; i < numberofObject; i++) {

            if (Name.equalsIgnoreCase("car")) {
                vehicles.add(new car(brand, model, passangers, engine, type, price, door));
            } else if (Name.equalsIgnoreCase("bus")) {
                vehicles.add(new bus(brand, model, passangers, engine, type, price, door));
            } else if (Name.equalsIgnoreCase("truck")) {
                vehicles.add(new truck(brand, model, passangers, engine, type, price, door, WeightLimit));
            } else if (Name.equalsIgnoreCase("paddleRickshaw")) {
                vehicles.add(new paddleRickshaw(brand, model, passangers, engine, carrier, type));
            } else if (Name.equalsIgnoreCase("CNG")) {
                vehicles.add(new CNG(brand, model, passangers, engine, carrier, type));
            } else if (Name.equalsIgnoreCase("bike")) {
                vehicles.add(new bike(brand, model, passangers, engine, model, type, carrier));
            } else if (Name.equalsIgnoreCase("cycle")) {
                vehicles.add(new cycle(brand, model, passangers, engine, model, type, carrier));
            } else {
                System.out.println("Invalid Vehicle type. Please enter correct one!!!");
            }
        }

        for (Vechicle v : vehicles) {
            System.out.println(v.showInfo());
        }
        sc.close();

    }
}