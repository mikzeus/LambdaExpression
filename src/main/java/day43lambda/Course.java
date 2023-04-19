package day43lambda;
/*
        Icinde
            i)private variable'lar
            ii)Parametreli ve parametresiz constructor'lar
            iii)getter'lar
            iv)setter'lar
            v)toString() method'u
        barindiran class'lara "POJO" Class denir.
        POJO: Plain Old Java Object
 */

public class Course {
    private String name;
    private int numodStudent;
    private String season;
    private double averageScore;

    public Course(String name, int numodStudent, String season, double averageScore) {
        this.name = name;
        this.numodStudent = numodStudent;
        this.season = season;
        this.averageScore = averageScore;
    }
    public Course(){
    }

    public String getName() {
        return name;
    }

    public int getNumodStudent() {
        return numodStudent;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumodStudent(int numodStudent) {
        this.numodStudent = numodStudent;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numodStudent=" + numodStudent +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
