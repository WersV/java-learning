public class AndroidApp extends App{

    public AndroidApp(String name) {
        super(name);
    }

    public void runAndroidApp() {
        System.out.println(this.name + " runs android app!");
    }

    public void appInfo() {
        System.out.println("This method is from AndroidApp class");
    }

}
