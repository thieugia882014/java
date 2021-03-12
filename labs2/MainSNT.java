package labs2;

import java.util.Scanner;

public class MainSNT {
    public static void main(String[] args) {
        SoNguyenTo snt = new SoNguyenTo();
        snt.setA(67);
        System.out.println("SNT next: " + snt.timSoNguyenToTiepTheo());
    }
}
