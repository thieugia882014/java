package labs5;

import java.util.Scanner;

public class Student extends Person{
    int maSV;
    int diemThi;
    String email;

    public Student() {
    }

    public Student(int maSV, int diemThi, String email) {
        this.maSV = maSV;
        this.diemThi = diemThi;
        this.email = email;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputIf(){
        super.inputIf();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã SV: ");
        setMaSV(sc.nextInt());
        System.out.println("Nhập điểm thi: ");
        setDiemThi(sc.nextInt());
        System.out.println("Nhập email: ");
        setEmail(sc.next());
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Mã số: " + getMaSV());
        System.out.println("Điểm: " + getDiemThi());
        System.out.println("Email: " + getEmail());
    }

    public boolean checkDiem(){
        if (getDiemThi() > 8){
            return true;
        }
        return false;
    }
}
