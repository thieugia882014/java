package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    String name;
    Integer soHocSinh;
    ArrayList<String> danhSachHS;

    public LopHoc(String name, Integer soHocSinh) {
        this.name = name;
        this.soHocSinh = soHocSinh;
        danhSachHS = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getsoHocSinh() {
        return soHocSinh;
    }

    public void setsoHocSinh(Integer soHocSinh) {
        this.soHocSinh = soHocSinh;
    }

    public void nhapHocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách học sinh:");
        for (int i = 0; i < getsoHocSinh(); i++){
            danhSachHS.add(sc.nextLine());
        }
    }
}
