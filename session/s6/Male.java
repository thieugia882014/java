package session.s6;

import session.s7.IHuman;
import session.s7.IMale;

public class Male extends Human implements IHuman, IMale {
    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void eat() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void kiss() {

    }

    @Override
    public void playgame() {

    }
}
