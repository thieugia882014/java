package labs4_2;

import java.util.ArrayList;

public class LopHoc {
    int maLop;
    String tenLop;
    String phongHoc;
    ArrayList<SinhVien> danhSachSV;

    public LopHoc() {
        danhSachSV = new ArrayList<SinhVien>();
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public ArrayList<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }

    public void addSV(SinhVien sv){
        getDanhSachSV().add(sv);
    }

    public void removeSV(SinhVien sv){
        getDanhSachSV().remove(sv);
    }

    SinhVien s = new SinhVien();

    public void printDanhSach(){
        System.out.println("Mã lớp: " + getMaLop());
        System.out.println("Tên lớp: " + getTenLop());
        System.out.println("Phòng học: " + getPhongHoc());
        System.out.println("Danh sách SV: ");
        for (SinhVien s:getDanhSachSV()){
            System.out.println(s.getMaSo() + " - " + s.getHoTen() + " - " + s.getSdt() + " - " + s.getDiaChi());
        }
    }
}
