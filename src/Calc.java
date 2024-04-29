public class Calc {

    public String name;
    public String email;

    public Calc(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int addition(int aNum, int bNum) {
        int result = aNum + bNum;
        return result;
    }

    public int subtraction(int aNum, int bNum) {
        int result = aNum - bNum;
        return result;
    }

    public int multiplication(int aNum, int bNum) {
        int result = aNum * bNum;
        return result;
    }

    public int division(int aNum, int bNum) {
        int result = aNum / bNum;
        return result;
    }

    public int modulo(int aNum, int bNum) {
        int result = aNum % bNum;
        return result;
    }
}
