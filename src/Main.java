import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calc calculator = new Calc("User1", "user1@test.pl");
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę a: ");
//        int aNum = scanner.nextInt();
//
//        System.out.println("Podaj liczbę b: ");
//        int bNum = scanner.nextInt();
//
//        int additionResult = calculator.addition(aNum, bNum);
//        int subtractionResult = calculator.subtraction(aNum, bNum);
//        int multiplicationResult = calculator.multiplication(aNum, bNum);
//        int divisionResult = calculator.division(aNum, bNum);
//        int moduloResult = calculator.modulo(aNum, bNum);
//
//
//        System.out.println("Addition: " + additionResult);
//        System.out.println("Subtraction: " + subtractionResult);
//        System.out.println("Multiplication: " + multiplicationResult);
//        System.out.println("Division: " + divisionResult);
//        System.out.println("Modulo: " + moduloResult);

        System.out.println(calculator.name + " " + calculator.email);

    }
}