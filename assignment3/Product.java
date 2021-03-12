package assignment3;

import java.util.ArrayList;

public class Product {
    int id;
    String productName;
    int qty;
    double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean checkQty(){
        if (getQty() > 0){
            System.out.println("Còn hàng");
            return true;
        }else {
            System.out.println("Hết hàng");
            return false;
        }
    }

}
