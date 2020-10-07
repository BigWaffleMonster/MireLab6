package Sort1;

public class Main {

    public static void main(String[] args) {

        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        Sort1.selectionSort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
