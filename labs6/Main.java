package labs6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Tú","0966721373");
        pb.insertPhone("Tú","0123456789");
        pb.insertPhone("Nam","0967940590");
        pb.sort();
        pb.removePhone("Tú");
        pb.updatePhone("Nam","0978654321");
        pb.hienThi();
    }
}
