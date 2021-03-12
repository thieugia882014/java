package practice_tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        float c1 = sc.nextFloat();
        System.out.println("Nhap canh 2: ");
        float c2 = sc.nextFloat();
        System.out.println("Nhap canh 3: ");
        float c3 = sc.nextFloat();

        TamGiac tg = new TamGiac();
        tg.setA(c1);
        tg.setB(c2);
        tg.setC(c3);

        if (tg.kiemTraTamGiac()){
            System.out.println("Chu vi tam giác là: " + tg.chuVi());
            System.out.println("Diện tích tam giác là: " + tg.dienTich());
        }
    }
}
