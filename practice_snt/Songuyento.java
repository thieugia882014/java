package practice_snt;

public class Songuyento {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSNT(a)){
            this.a = a;
        }else {
            System.out.println("Không set");
        }
    }

    public boolean isSNT(int x){
        if (x<2)
            return false;
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i<=squareRoot; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public int SNTNext(){
        for (int i = a+1;; i++){
            if (isSNT(i)){
                setA(i);
                return i;
            }
        }
    }
}
