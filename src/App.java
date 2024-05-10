import enums.DriverType;

public class App {
    public static void main(String[] args) {
        getDriver(DriverType.FIREFOX);
    }

    public static void getDriver(DriverType type) {
        if(type == DriverType.CHROME) {
            System.out.println("Korzystasz z chrome");
        }
        if(type == DriverType.FIREFOX) {
            System.out.println("Korzystasz z firefoxa");
        }
    }
}