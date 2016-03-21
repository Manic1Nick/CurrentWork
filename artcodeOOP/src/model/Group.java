package model;

public class Group {

    private String name;
    private int size;
    private Student[] student;

    public Group(String name, int size, Student[] student) {

        this.name = name;
        this.size = size;
        this.student = student;

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Student[] getStudent() {
        return student;
    }
}
