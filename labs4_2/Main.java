package labs4_2;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setMaSo(1);
        sv1.setHoTen("Nguyễn Văn A");
        sv1.setSdt(855544443);
        sv1.setDiaChi("Hà Nội");
        SinhVien sv2 = new SinhVien();
        sv2.setMaSo(2);
        sv2.setHoTen("Phùng Khoa Học");
        sv2.setSdt(584628912);
        sv2.setDiaChi("Hồ Chí Minh");
        SinhVien sv3 = new SinhVien();
        sv3.setMaSo(3);
        sv3.setHoTen("Đinh Trọng Tấn");
        sv3.setSdt(345621895);
        sv3.setDiaChi("Đà Nẵng");
        SinhVien sv4 = new SinhVien();
        sv4.setMaSo(4);
        sv4.setHoTen("Trần Huy Hoàng");
        sv4.setSdt(521678521);
        sv4.setDiaChi("Ba Vì");

        LopHoc lh = new LopHoc();
        lh.addSV(sv1);
        lh.addSV(sv2);
        lh.addSV(sv3);
        lh.addSV(sv4);
        lh.removeSV(sv4);

        lh.setMaLop(1);
        lh.setTenLop("T2008M");
        lh.setPhongHoc("A8");

        lh.printDanhSach();
    }
}
