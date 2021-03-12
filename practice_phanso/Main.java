package practice_phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo ft1 = new PhanSo();
        ft1.setTuSo(1);
        ft1.setMauSo(2);
        PhanSo ft2 = new PhanSo();
        ft2.setTuSo(1);
        ft2.setMauSo(3);

        PhanSo t = ft1.add(ft2);
        t.hienPS();
    }
}
