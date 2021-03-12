package labs8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList ds = new ArrayList();
        KhachHangVN vn = new KhachHangVN(1,"Tú","24/12/2019",153,"Sinh hoạt");
        KhachHangVN vn2 = new KhachHangVN(2,"Nam","24/12/2019",53,"Kinh doanh");
        KhachHangVN vn3 = new KhachHangVN(3,"Hoàng","24/12/2019",42,"Sinh hoạt");
        KhachHangVN vn4 = new KhachHangVN(4,"Trung","24/12/2019",352,"Sản xuấ");
        KhachHangNN nn = new KhachHangNN(1,"Trí","24/12/2019",135,"Anh");
        KhachHangNN nn2 = new KhachHangNN(2,"Khánh","24/12/2019",62,"Đức");
        KhachHangNN nn3 = new KhachHangNN(3,"Thư","24/12/2019",42,"Mĩ");
        ds.add(vn);
        ds.add(vn2);
        ds.add(vn3);
        ds.add(vn4);
        ds.add(nn);
        ds.add(nn2);
        ds.add(nn3);



        for (int i = 0; i < ds.size(); i++){
            if (ds.get(i) instanceof KhachHangVN){
                System.out.println("Id: " + ((KhachHangVN) ds.get(i)).getMaKH() + " - " + ((KhachHangVN) ds.get(i)).getHoTen() + " - " + ((KhachHangVN) ds.get(i)).getDoiTuong() + " - " + ((KhachHangVN) ds.get(i)).getNgayRaHoaDon() + " - " + ((KhachHangVN) ds.get(i)).getSoLuong());
                System.out.println("Tổng tiền: " + (((KhachHangVN) ds.get(i)).thanhTien()));
            }else if (ds.get(i) instanceof KhachHangNN){
                System.out.println("Id: " + ((KhachHangNN) ds.get(i)).getMaKH() + " - " + ((KhachHangNN) ds.get(i)).getHoTen() + " - " + ((KhachHangNN) ds.get(i)).getNgayRaHoaDon() + " - " + ((KhachHangNN) ds.get(i)).getSoLuong());
                System.out.println("Tổng tiền: " + (((KhachHangNN) ds.get(i)).thanhTien()));
            }
        }

        int count = 0;
        double total = 0;
        for (int i = 0; i < ds.size(); i++){
            if (ds.get(i) instanceof KhachHangNN){
                total += ((KhachHangNN)ds.get(i)).thanhTien();
                count++;
            }
        }
        System.out.println("Tổng: " + total + " - Số lượng: " + count);

        if (total != 0){
            double tb = total/count;
            System.out.println("Trung bình: " + tb);
            return;
        }

    }
}
