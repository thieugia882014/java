package session.s2;

public class S2Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "911";
        System.out.println("So banh xe: " + c.getSoBanhXe());
        c.run();
        //c.going();
    }
}
