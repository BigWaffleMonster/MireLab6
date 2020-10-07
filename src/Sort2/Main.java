package Sort2;

public class Main {

    public static void main(String[] args) {

        Student[] students = {new Student(5), new Student(5), new Student(1), new Student(1), new Student(3)};
        SortingStudentsByGPA.sort(students, 0, students.length - 1);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}