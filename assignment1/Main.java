package assignment1;

public class Main {
    public static void main(String[] args) {
        Tamgiac tg = new Tamgiac();

        tg.changeA(3);
        tg.changeB(4);
        tg.changeC(5);
        tg.run();

        if (tg.checkTriangle()){
            System.out.printf("là 3 cạnh của tam giác\n");
            System.out.printf("Chu vi của tam giác là: " + tg.cv);
            System.out.printf("\nDiện tích của tam giác là: " + tg.s);
        }else{
            System.out.printf("không phải 3 cạnh của tam giác");
        }
    }
}
