package practice_tamgiac;

public class TamGiac {
    float a;
    float b;
    float c;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public boolean kiemTraTamGiac(){
        if(getA()+getB()>getC() && getA()+getC()>getB() && getB()+getC()>getA()){
            return true;
        }
        return false;
    }
    public float chuVi(){
        return getA()+getB()+getC();
    }
    public double dienTich(){
        float p = chuVi() / 2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
    }
}
