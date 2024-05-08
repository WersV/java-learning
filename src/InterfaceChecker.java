import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import packages.WebDriver;

public class InterfaceChecker {
    public static void main(String[] args) {
        WebDriver driver = getDriver("chrome");

        driver.get();
        driver.findElementBy();

    }

    public static WebDriver getDriver(String driverName) {
        if(driverName.equals("chrome")) {
            return new ChromeDriver();
        } else if(driverName.equals("firefox")) {
            return new FirefoxDriver();
        }
        return new ChromeDriver();
    }
}
