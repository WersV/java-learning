package drivers;

import packages.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Przeglądarka otwarta za pomocą Chrome");
    }
    @Override
    public void findElementBy() {
        System.out.println("Znajduje element przez Chrome");
    }
}
