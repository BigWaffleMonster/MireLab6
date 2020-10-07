package Sort3;

public class Student implements Comparable<Student>{
    int number;

    public Student(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(number, s.number);
    }
    @Override
    public String toString() {
        return String.valueOf(number);
    }
}