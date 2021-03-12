package session.s9;

public class StaticDemo {
    public void run(){
        System.out.println("Running...");
    }

    public static boolean kiemTraSNT(int n){
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
