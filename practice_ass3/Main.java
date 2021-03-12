package practice_ass3;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setPrice(15000);
        p1.setProductName("Đồng hồ rolex");
        p1.setQty(2);
        Product p2 = new Product();
        p2.setId(1);
        p2.setPrice(3000);
        p2.setProductName("Áo khoác");
        p2.setQty(5);

        Cart c = new Cart();
        c.setId(1);
        c.setCustomer("Nguyen Van A");
        c.setCity("hai duong");
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p2);
        c.addProduct(p2);

        System.out.println("Danh sách sản phẩm");
        for (Product p : c.getProductList()){
            System.out.println(p.getId() + "- " + p.getProductName()+"- "+p.getPrice());
        }
        System.out.println("Tổng tiền: " + c.finalGrandTotal());

    }
}
