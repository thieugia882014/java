package session.s5;

public class Suv extends Oto {
    public int soChoNgoi;

    public void update(){
        System.out.println("Update...");
    }

    public void update(String msg){
        System.out.println(msg + "update...");
    }

    public void update(int money){
        System.out.println("Update ton"+money);
    }

    public void update(int n, String m){

    }

    public void update(String n, int m){

    }
}
