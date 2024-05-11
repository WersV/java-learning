public class App {
    public static void main(String[] args) {

        Student jerry = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hi I'm " + name);
            }
        };
        sayHello("jerry", jerry);

        //second way with lambda expression
        Student tom = name -> System.out.println("Hi I'm " + name);
        sayHello("Tom", tom);
    }

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}