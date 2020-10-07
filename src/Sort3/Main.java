package Sort3;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student[] students = {new Student(48), new Student(1), new Student(35), new Student(0), new Student(193)};
        Student[] students_ = {new Student(77), new Student(4), new Student(81), new Student(17)};
        Student[] std = new Student[students.length + students_.length];
        Sort3.sort3(students, students_, std);

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }
    }
}