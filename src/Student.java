public class Student {
    public String name;
    public String surname;
    public String email;
    public String nick;
    public int indexId;

    public void sayHello() {
        System.out.println(name + " " + surname + " says hello!");
    }

    public void login() {
        System.out.println(nick + " logged in!");
    }

    public void provideIndexId() {
        System.out.println("Index number: " + indexId);
    }

    public void provideEmail() {
        System.out.println("Email: " + email);
    }

    public int doCalc() {
        return 4;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
