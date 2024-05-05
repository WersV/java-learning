package drivers;

import packages.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Przeglądarka otwarta za pomocą Firefox");
    }
    @Override
    public void findElementBy() {
        System.out.println("Znajduje element przez Firefoxa");
    }

}
