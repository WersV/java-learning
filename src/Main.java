public class Main {
    public static void main(String[] args) {
        Teacher joe = new Teacher();
        joe.name = "Joe";
        joe.age = 27;

        joe.teach();
        joe.walk();
        joe.eat();

        Footballer mike = new Footballer();
        mike.name = "mike";
        mike.age = 20;
        mike.play();
        mike.walk();
        mike.eat();
    }
}