import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "S-Class", 2024, 1000);

        mercedes.drive();
        mercedes.info();
        System.out.println(Auto.country);
    }
}