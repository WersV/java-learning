public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Przemek";
        student1.surname = "Botwina";
        student1.email = "qwe@w.pl";
        student1.nick = "WersV";
        student1.indexId = 990;


        Student student2 = new Student();
        student2.name = "Jan";
        student2.surname = "Kowalski";
        student2.email = "adsasd@sad.pl";
        student2.nick = "JANEK";
        student2.indexId = 119;


        Student student3 = new Student();
        student3.name = "Zdzisław";
        student3.surname = "Nowak";
        student3.email = "bnbnb@vvc.pl";
        student3.nick = "Zdziśek";
        student3.indexId = 201;

        Student[] studentsArr = new Student[3];

        studentsArr[0] = student1;
        studentsArr[1] = student2;
        studentsArr[2] = student3;



//        for (Student student : studentsArr) {
//            student.sayHello();
//            student.login();
//            student.provideIndexId();
//            student.provideEmail();
//            System.out.println("=============");
//        }
        int returnedValue = student3.add(3,5);
        System.out.println("Suma to: " + returnedValue);
    }
}