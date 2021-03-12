package session.s9;


import session.s6.Human;
import session.s7.IHuman;

public class AnDanh {
    public static void main(String[] args) {
        int x = 1000;
        Human h = new Human() {
            @Override
            public void showInfo() {
                System.out.println("Làm gì đó" + x);
            }
        };
        h.showInfo();

        IHuman ih = new IHuman() {
            @Override
            public void eat() {
                System.out.println(x+10);
            }

            @Override
            public void jump() {
                System.out.println(x+20);
            }
        };

        Is s = new Is() {
            @Override
            public void callMe(String msg) {
                System.out.println("Call me.." + msg);
            }
        };

        Is s2 = (String msg) -> { // lamba
            System.out.println("Call me.." + msg);
        };
    }
}
