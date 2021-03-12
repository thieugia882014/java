package session.s9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 6;
//        if (StaticDemo.kiemTraSNT(x)){
//            System.out.println(x + " là số nguyên tố");
//        }else {
//            System.out.println(x + " không phải là số nguyên tố");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = sc.nextInt();
        System.out.println("Nhập b = ");
        int b = sc.nextInt();
        a++;
        System.out.println("a = " + a);
        int c = a / b;
        System.out.println("c = " + c);
    }
}
