package chp08.ex8_5;

public class Student {
    // static field
    static int count;

    // non-static field
    int id;
    String name;

    Student(int id, String name) {
        Student.count++;
        this.id = id;
        this.name = name;
    }
}
