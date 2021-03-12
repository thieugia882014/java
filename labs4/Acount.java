package labs4;

public class Acount {
    int id;
    String name;
    double balance;

    public Acount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean credit(int amount){
        if (amount > 0){
            setBalance(getBalance()+amount);
            return true;
        }
        return false;
    }

    public boolean debit(int amount){
        if (amount < getBalance()){
            setBalance(getBalance()-amount);
            return true;
        }
        return false;
    }

    public boolean tranferTo(Acount acount, int amount){
        if (this.debit(amount)){
            acount.setBalance(amount + acount.getBalance());
            return true;
        }
        return false;
    }

    public void hienThi(){
        System.out.println("id: " + getId() + " name: " + getName() + " balance: " + getBalance());
    }
}
