package assignment1;

public class Tamgiac {
    int a;
    int b;
    int c;
    double cv;
    double p;
    double s;


    void run(){
        System.out.printf("Cạnh thứ 1: " + a + "\n" + "Cạnh thứ 2: " + b + "\n" + "Cạnh thứ 3: " + c + "\n");
    }

    void changeA(int n){a = n;}
    void changeB(int n2){b = n2;}
    void changeC(int n3){c = n3;}

    boolean checkTriangle(){
        if(a + b > c && b + c > a && a + c > b){
            cv = a + b + c;
            p = cv / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return true;
        }
        return false;
    }
}
