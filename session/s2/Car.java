package session.s2;

public class Car {
    public String model;
    protected int soBanhXe;

    //Ham khoi tao - Constructor
    public Car(){
        setSoBanhXe(4);
    }
    /*
        1. ten giong ten lop
        2. khong co gia tri tra ve
        3. tu dong chay khi tao doi tuong
    */

    public int getSoBanhXe(){
        return soBanhXe;
    }

    public void setSoBanhXe(int soBanhXe){
        this.soBanhXe = soBanhXe;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String m){
        this.model = m;
    }

    public void run() {
        System.out.printf(this.model + "Running...");
    }

    void going(){
        run();
    }
}
