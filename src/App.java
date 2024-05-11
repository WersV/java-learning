import enums.DriverType;

public class App {
    public static void main(String[] args) {
        getDriver(DriverType.CHROME);
    }

    public static void getDriver(DriverType type) {
        if(type.name.equals("chrome")) {
            System.out.println("Korzystasz z chrome");
        }
        if(type.name.equals("firefox")) {
            System.out.println("Korzystasz z firefoxa");
        }
    }
}