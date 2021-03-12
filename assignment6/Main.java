package assignment6;

public class Main {
    public static void main(String[] args) {
        MonHocDaiCuong mh = new MonHocDaiCuong();
        mh.themLopHoc("t2008m", 2);
        mh.themLopHoc("t2009m", 1);
        mh.themLopHoc("t2007m", 3);
        mh.themLopHoc("t2009m", 15);

        mh.xoaLopHoc("t2008m");
        mh.sapXep();
        mh.inDanhSach();
    }
}
