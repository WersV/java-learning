import exceptions.InvalidException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InvalidException {
        getAge();
    }

    public static void getAge() throws InvalidException{
        System.out.println("Podaj wiek: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<0) {
            throw new InvalidException("Wiek nie może być mniejszy od 0");
        } else if(age >= 18) {
            System.out.println("Jesteś pełnoletni");
        }
    }
}