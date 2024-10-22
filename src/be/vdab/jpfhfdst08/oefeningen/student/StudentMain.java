package be.vdab.jpfhfdst08.oefeningen.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Jeff");
        Student student2 = new Student("Jeff", 7);

        System.out.println(student1.getNaam() + student1.getScore());
        System.out.println(student2.getNaam() + student2.getScore());

        student2.setNaam("Vis");

        System.out.println(student1.getNaam() + student1.getScore());
        System.out.println(student2.getNaam() + student2.getScore());
    }
}
