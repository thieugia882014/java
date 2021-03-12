package labs7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Title: ");
        n.setTitle(sc.nextLine());
        System.out.println("Nhập PublishDate: ");
        n.setPublishDate(sc.nextLine());
        System.out.println("Nhập Author: ");
        n.setAuthor(sc.nextLine());
        System.out.println("Nhập Content: ");
        n.setContent(sc.nextLine());

        n.calculate();
        n.display();

    }
}
