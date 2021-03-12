package labs4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Acount a1 = new Acount();
        Acount acount = new Acount();
        Acount nap = new Acount();
        Acount tt = new Acount();
        Acount chuyen = new Acount();
        Scanner sc = new Scanner(System.in);

        a1.setId(1);
        a1.setName("Nguyễn Văn A");
        a1.setBalance(100000);
        acount.setId(2);
        acount.setName("Hoàng Khánh B");
        acount.setBalance(250000);

        System.out.println("Tài khoản A: ");
        a1.hienThi();
        System.out.println("Tài khoản B" + acount);
        acount.hienThi();


        System.out.println("Nhập số tiền cần nạp: ");
        if (a1.credit(sc.nextInt())){
            System.out.println("Nạp thành công");
            System.out.println("Số dư hiện có: " + a1.getBalance());
        }else {
            System.out.println("Nạp không thành công");
        }

        System.out.println("Nhập số tiền cần thanh toán: ");
        if (acount.debit(sc.nextInt())){
            System.out.println("Thanh toán thành công");
            System.out.println("Số dư hiện có: " + acount.getBalance());
        }else {
            System.out.println("Thanh toán không thành công");
        }

        System.out.println("Nhập số tiền cần chuyển: ");
        if (a1.tranferTo(acount, sc.nextInt())){
            System.out.println("Chuyển khoản thành công");
            System.out.println("Số dư hiện có: "+a1.getBalance());
            System.out.println("Số dư hiện có: "+acount.getBalance());
        }else {
            System.out.println("Chuyển không thành công");
        }
    }
}
