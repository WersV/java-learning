import drivers.ChromeDriver;
import drivers.FirefoxDriver;

public class InterfaceChecker {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
    }
}
