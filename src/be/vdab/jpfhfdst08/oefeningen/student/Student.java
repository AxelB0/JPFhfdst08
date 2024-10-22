package be.vdab.jpfhfdst08.oefeningen.student;

public class Student {
    String naam;
    int score;

    public Student(String naam){
        this.naam=naam;
    }

    public Student (String naam, int score){
        this(naam);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
