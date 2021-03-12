package labs1;

public class LabS1 {
    public static void main(String[] args) {

        Product inf = new Product();
        Product inf2 = new Product();
        Product inf3 = new Product();

        inf.productCode = 1;
        inf.name = "iphone";
        inf.price = 1000;
        inf.amount = 50;
        inf.unit = "Chiếc";

        inf2.productCode = 2;
        inf2.name = "samsung";
        inf2.price = 8000;
        inf2.amount = 30;
        inf2.unit = "Chiếc";

        inf3.productCode = 3;
        inf3.name = "oppo";
        inf3.price = 5000;
        inf3.amount = 80;
        inf3.unit = "Chiếc";

        inf.changePrice(1200);
        inf.changeAmount(40);

        inf.running();
        inf2.running();
        inf3.running();

        if (inf.checkStock()){
            System.out.printf("Sản phẩm " + inf.name + " còn " + inf.amount + inf.unit);
        }else{
            System.out.printf("Đã hết hàng");
        }
    }
}
