package assignment7;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.addStudent(1, "Tú", 18, "Ba Vì", 8 );
        ds.addStudent(2, "Nam", 18, "Hà Nội", 9);
        ds.addStudent(3, "Hoàng", 18, "Hồ Chi Minh", 6);
        ds.menu();

    }
}
