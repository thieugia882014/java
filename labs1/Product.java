package labs1;

public class Product {
    int productCode;
    String name;
    float price;
    int amount;
    String unit;

    void running(){
        System.out.printf("labs1.Product Code: " + productCode + "\n" + "Name: " + name + "\n"+ "Price: " + price + "\n" + "Amount: " + amount + "\n" + "Unit: " + unit + "\n");
    }

    void changeAmount(int a){
        amount = a;
    }

    void changePrice(float p){
        price = p;
    }

    boolean checkStock(){
        if(amount > 0){
            return true;
        }
        return false;
    }
}
