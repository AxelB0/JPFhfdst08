package be.vdab.jpfhfdst08.oefeningen.getal;

public class Getal {
    int x;

    public Getal(int a){
        setX(a);
    }

    public void print(){
        System.out.println(x);
    }

    public int absoluut(){
        return Math.abs(x);
    }

    public int som(int a){
        return x+a;
    }

    public float som(float a){
        return x+a;
    }

    public double som(double a){
        return x+a;
    }

    public double toDouble(){
        return (double) x;
    }

    public void add(int a){
        this.x +=a;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        this.x = a;
    }
}
