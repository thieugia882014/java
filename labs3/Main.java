package labs3;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();

        r.setTenPhong("Phòng 1");
        r.setViTri("Trần Hưng Đạo");
        r.addUser("Hoàng Anh Tú");
        r.addUser("Trương Đăng Quang");
        r.addUser("Bùi Chí Thanh");
        r.removeUser(2);
        r.printRoom();
    }
}
