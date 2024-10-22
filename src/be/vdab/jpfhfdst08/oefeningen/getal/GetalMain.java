package be.vdab.jpfhfdst08.oefeningen.getal;

public class GetalMain {
    public static void main(String[] args) {
        Getal getal = new Getal(-45);
        getal.print();
//        System.out.println(getal.absoluut());
//        System.out.println(getal.som(50));
        getal.add(50);
        getal.print();

    }
}
