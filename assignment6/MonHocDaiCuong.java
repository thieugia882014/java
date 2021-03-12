package assignment6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc{

    ArrayList<LopHoc> danhSachLopHoc;

    public MonHocDaiCuong() {
        danhSachLopHoc = new ArrayList<LopHoc>();
    }

    @Override
    public void themLopHoc(String name, int soLuongHocSinh) {
        for (LopHoc lh:danhSachLopHoc){
            if (lh.getName().contains(name)){
                System.out.println("Lớp "+ name +" đã có trong danh sách");
                return;
            }
        }
        LopHoc lh = new LopHoc(name,soLuongHocSinh);
        lh.nhapHocSinh();
        danhSachLopHoc.add(lh);
    }

    @Override
    public void xoaLopHoc(String name) {
        for (LopHoc lh:danhSachLopHoc){
            if (lh.getName().contains(name)){
                danhSachLopHoc.remove(lh);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        Collections.sort(danhSachLopHoc, new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o1.getsoHocSinh().compareTo(o2.getsoHocSinh());
            }
        });
    }

    @Override
    public void inDanhSach() {
        for (LopHoc lh:danhSachLopHoc){
            System.out.println("Lớp: " + lh.getName() + "- Sĩ số: " + lh.getsoHocSinh());
            System.out.println("Danh sách học sinh:");
            for (String s:lh.danhSachHS){
                System.out.println(s);
            }
        }
    }
}
