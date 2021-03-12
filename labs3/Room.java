package labs3;

import java.util.ArrayList;

public class Room {
    String tenPhong;
    String viTri;
    ArrayList<String> user;

    public Room() {
        user = new ArrayList<String>();
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void addUser(String u){
        user.add(u);
    }

    public void removeUser(int index){
        user.remove(index);
    }

    public void printRoom(){
        System.out.println("Tên phòng: " + getTenPhong());
        System.out.println("Vị trí: " + getViTri());
        System.out.println("User");
        for (String i:user){
            System.out.println(i);
        }
    }
}
