import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
    public static void main(String[] args) {
        try {
            readFile("src/texat.txt");
            System.out.println("Plik odczytany");
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program zakończony");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
