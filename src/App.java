import secondPackage.SecondPackageClass;
import testPackage.database.DatabaseClass;
import testPackage.view.ViewClass;

public class App {
    public static void main(String[] args) {
        DatabaseClass databaseClass = new DatabaseClass();
        databaseClass.hello();
        System.out.println(databaseClass.defaultValue);
        ViewClass viewClass = new ViewClass();
        viewClass.hello();
        SecondPackageClass secondPackageClass = new SecondPackageClass();
        secondPackageClass.hello();
    }
}
