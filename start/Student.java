package start;

public class Student {
    int id;
    String name;
    int age;

    void run(){
        eat();
        System.out.printf(name + " Running... ");
    }
    void eat(){
        System.out.printf(name + " eating... ");
    }
}
