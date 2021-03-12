package session.s5;

public class Main {
    public static void main(String[] args) {
        Oto o1 = new Oto();
        o1.brand = "Honda";
        o1.run();
        o1.speedUp();

        Suv s1 = new Suv();
        s1.brand = "Inova";
        s1.run();
        s1.speedUp();

        s1.update();

        SuvCustom sc1 = new SuvCustom();
        sc1.brand = "Khong ro";
        sc1.year = 2020;
        sc1.soChoNgoi = 7;
        sc1.chiPhi = 10000000;
        sc1.update();
    }
}
