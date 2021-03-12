package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        Fraction tong = new Fraction();
        Fraction hieu = new Fraction();
        Fraction tich = new Fraction();
        Fraction thuong = new Fraction();
        Fraction rg = new Fraction();
        Fraction nd = new Fraction();


        System.out.println("Nhập phân số thứ 1: ");
        fr1.nhapPS(sc);
        System.out.println("Nhập phân số thứ 2: ");
        fr2.nhapPS(sc);

        tong = fr1.add(fr2);
        hieu = fr1.sub(fr2);
        tich = fr1.mul(fr2);
        thuong = fr1.div(fr2);

        System.out.println("Phân số thứ 1 là: ");
        fr1.hienThi();
        System.out.println("Phân số thứ 2 là: ");
        fr2.hienThi();

        System.out.println("Tổng 2 phân số là: ");
        tong.hienThi();
        rg = tong.rutGon();
        System.out.println("Rút gọn");
        rg.hienThi();

        System.out.println("Hiệu 2 phân số là: ");
        hieu.hienThi();
        nd = hieu.nghichDao();
        System.out.println("Nghịch đảo của phân số là: ");
        nd.hienThi();

        System.out.println("Tích 2 phân số là: ");
        tich.hienThi();
        System.out.println("Thương 2 phân số là: ");
        thuong.hienThi();
    }
}
