package labs8;

public class KhachHangNN extends KhachHang{

    public KhachHangNN(int maKH, String hoTen, String ngayRaHoaDon, int soLuong, String quocTich) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong);
        this.quocTich = quocTich;
    }

    public String quocTich;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return getSoLuong() * 2000;
    }

}
