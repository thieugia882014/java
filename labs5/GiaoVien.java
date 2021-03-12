package labs5;

import labs5.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    ArrayList<String> danhSachLop;
    int mucLuong;
    int soMon;
    ArrayList<String> cacMon;

    public GiaoVien() {
        danhSachLop = new ArrayList<String>();
        cacMon = new ArrayList<String>();
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    public void inputIf(){
        super.inputIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lớp dạy");
        int sl = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập danh sách lớp: ");
        for (int i = 0; i<sl;i++){
            danhSachLop.add(sc.nextLine());
        }
        System.out.println("Nhập mức lương: ");
        setMucLuong(sc.nextInt());
        System.out.println("Nhập số môn: ");
        setSoMon(sc.nextInt());
        sc.nextLine();
        System.out.println("Danh sách môn dạy: ");
        for (int i = 0; i < getSoMon(); i++){
            cacMon.add(sc.nextLine());
        }
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Danh sách lớp: " + danhSachLop);
        System.out.println("Lương: " + getMucLuong());
        System.out.println("Số môn dạy: " + getSoMon());
        System.out.println("Các môn dạy: " + cacMon);
    }
}

