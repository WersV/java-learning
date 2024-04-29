public class Auto {

    public String make;
    public String model;
    public int year;
    public int mileage;

    public static String country = "Poland";

    public Auto(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println("Drive!");
    }

    public void info() {
        System.out.println("Marka: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Mileage: " + this.mileage);
    }
}
