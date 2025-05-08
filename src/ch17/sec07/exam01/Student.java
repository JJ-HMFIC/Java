package ch17.sec07.exam01;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() { return name; }
    public int getScore() { return score; }
}
