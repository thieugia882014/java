package practice_phanso;

import assignment2.Fraction;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){

    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0){
            this.mauSo = mauSo!=0?mauSo:1;
        }
    }

    public void nhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        setTuSo(sc.nextInt());
        System.out.println("Nhập mẫu số: ");
        setMauSo(sc.nextInt());
    }

    public void hienPS(){
        System.out.println("Phân số: "+getTuSo() + "/" + getMauSo());
    }

    public int timUCLN(){
        for (int i = Math.min(getTuSo(), getMauSo()); i > 0; i--){
            if (getTuSo()%i==0 && getMauSo()%i==0) return i;
        }
        return 1;
    }

    public void rutGon(){
        int ucln = timUCLN();
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);

    }

    public void nghichDao(){
        int ms = getMauSo();
        if (getTuSo()!=0){
            setMauSo(getTuSo());
            setTuSo(ms);
        }else {
            System.out.println("Không thể nghịch đảo");
        }
    }

    public PhanSo add(PhanSo ft2){
        int ts = this.getTuSo() * ft2.getMauSo() + ft2.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ft2.getMauSo();
        PhanSo tong = new PhanSo();
        tong.setTuSo(ts);
        tong.setMauSo(ms);
        tong.rutGon();
        return tong;
    }

    public PhanSo sub(PhanSo ft2){
        int ts = this.getTuSo() * ft2.getMauSo() - ft2.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ft2.getMauSo();
        PhanSo hieu = new PhanSo();
        hieu.setTuSo(ts);
        hieu.setMauSo(ms);
        hieu.rutGon();
        return hieu;
    }

    public PhanSo mul(PhanSo ft2){
        int ts = this.getTuSo() * ft2.getTuSo();
        int ms = this.getMauSo() * ft2.getMauSo();
        PhanSo tich = new PhanSo();
        tich.setTuSo(ts);
        tich.setMauSo(ms);
        tich.rutGon();
        return tich;
    }

    public PhanSo div(PhanSo ft2){
        int ts = this.getTuSo() * ft2.getMauSo();
        int ms = this.getMauSo() * ft2.getTuSo();
        PhanSo thuong = new PhanSo();
        thuong.setTuSo(ts);
        thuong.setMauSo(ms);
        thuong.rutGon();
        return thuong;
    }
}
