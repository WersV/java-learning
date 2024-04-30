public class AppChecker {
    public static void main(String[] args) {
        AndroidApp myAndroidApp = new AndroidApp("Przemek");
        myAndroidApp.runAndroidApp();
        myAndroidApp.appInfo();

        IphoneApp myIphoneApp = new IphoneApp("Agata");

        myIphoneApp.runIphoneApp();
        myIphoneApp.appInfo();

    }
}