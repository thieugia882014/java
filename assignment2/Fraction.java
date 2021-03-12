package assignment2;

import java.util.Scanner;
import java.util.function.Function;

public class Fraction {
    private int tu, mau;

    public Fraction(){
        tu = 0;
        mau = 1;
    }

    public Fraction(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void nhapPS(Scanner sc){
        int t;
        int m;

        do {
            System.out.println("Nhập vào tử số: ");
            t = sc.nextInt();
            System.out.println("Nhập vào mẫu số: ");
            m = sc.nextInt();

            if (m==0){
                System.out.println("Mẫu số không thể bằng 0. Hãy nhập lại");
            }else{
                tu = t;
                mau = m;
            }
        }while (m == 0);
    }

    public void hienThi(){
        if (tu * mau < 0){
            System.out.println("-" + Math.abs(tu) + "/" + Math.abs(mau));
        }else {
            System.out.println(Math.abs(tu) + "/" + Math.abs(mau));
        }
    }

    public Fraction add(Fraction fr2){
        int t = tu*fr2.mau + fr2.tu*mau;
        int m = mau* fr2.mau;
        return new Fraction(t,m);
    }

    public Fraction sub(Fraction fr2){
        int t = tu*fr2.mau - fr2.tu*mau;
        int m = mau* fr2.mau;
        return new Fraction(t,m);
    }

    public Fraction mul(Fraction fr2){
        int t = tu*fr2.tu;
        int m = mau* fr2.mau;
        return new Fraction(t,m);
    }

    public Fraction div(Fraction fr2){
        int t = tu*fr2.mau;
        int m = mau* fr2.tu;
        return new Fraction(t,m);
    }

    public int uocChung(int tu, int mau){
        int r = tu % mau;
        while (r != 0){
            tu = mau;
            mau = r;
            r = tu % mau;
        }
        return mau;
    }

    public Fraction rutGon(){
        int i = uocChung(tu, mau);
        tu /= i;
        mau /= i;
        return new Fraction(tu,mau);
    }

    public Fraction nghichDao(){
        int tmp;
        tmp = tu;
        tu = mau;
        mau = tmp;
        return new  Fraction(tu,mau);
    }


}
