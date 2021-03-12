package session.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] arr; // khai báo rằng arr là 1 biến kiểu mảng số nguyên -> chưa có ô nhớ
//        arr = new int[3]; // báo rằng arr là mảng số nguyên 3 phần tử -> lúc này mới có ô nhớ
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 3;
        System.out.println("Kích thước mảng: " + arr.length);
        int[][] mularr = new int[3][4];
        mularr[0][0] = 9;
        ArrayList arrL = new ArrayList(); // Tạo 1 đối tượng array list -> đối tượng tập hợp
        arrL.add(1);
        arrL.add("Hello");
        for (int i = 0; i < arrL.size(); i++){
            System.out.println(arrL.get(i)); // không phải arrL[i] mà là arrL.get(i)
        }

        // Khởi tạo 1 collection chi gồm các string
        ArrayList<String> arrS = new ArrayList<String>();
        arrS.add("xin chào");
        arrS.add("các bạn");
        for (String x:args){ // foreach -> x tương đương arrS.get(i)
            System.out.println(x);
        }
        ArrayList<Dog> arrD = new ArrayList<Dog>(); // Tập hợp các dối tượng dog
        Dog d1 = new Dog();
        arrD.add(d1);
        for (int i = 0; i < 100; i++){
            arrD.add(new Dog());
        }
        System.out.println("Số lượng chó trong lồng là: " + arrD.size());
        arrD.remove(d1);
        arrD.remove(arrD.get(3));
        arrD.remove(5);
        System.out.println("Số lượng chó trong lồng là: " + arrD.size());

        ArrayList<Integer> ig = new ArrayList<Integer>();
        Integer x = new Integer(5);
        Integer y = 10; // int y = 10; -> Interger y = new Interger(y);
        y += 20; // boxing - unboxing -> primitive <=> references: Tự động
    }
}
