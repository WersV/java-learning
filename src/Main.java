import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int aNum = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int bNum = scanner.nextInt();

        System.out.println("Dodawanie: "+ (aNum+bNum));
        System.out.println("Odejmowanie: " + (aNum-bNum));
        System.out.println("Mnożenie: " + (aNum*bNum));
        System.out.println("Dzielenie: " + (aNum/bNum));
    }
}