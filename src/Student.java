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
        System.out.println(email + " " + indexId + " logged in!");
    }

}
