package session.s5;

public class SuvCustom extends Suv {
    public int chiPhi;
    public void showInfo(){
        super.update();
        System.out.println("Show info");
    }

    public void update(){
        System.out.println("Suv custom update...");
    }
}
