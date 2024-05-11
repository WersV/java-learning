package enums;

public enum DriverType {
    CHROME("chrome", "src/drivers/chrome.exe"),
    FIREFOX("firefox", "src/drivers/firefox.exe");

    public String name;
    public String path;

    DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
