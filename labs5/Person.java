package labs5;

import java.util.Scanner;

public class Person {
    String name;
    String gioiTinh;
    String ngaySinh;
    String diaChi;

    public Person(){
    }

    public Person(String name, String gioiTinh, String ngaySinh, String diaChi) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        setName(sc.nextLine());
        System.out.println("Nhập giới tính");
        setGioiTinh(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        setNgaySinh(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        setDiaChi(sc.nextLine());
    }

    public void hienThi(){
        System.out.println(getName() + " - " + getGioiTinh() + " - " + getNgaySinh() + " - " + getDiaChi());
    }
}
