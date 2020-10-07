package Sort2;

public class SortingStudentsByGPA {

    static int fast(Comparable[] list, int leftBorder, int rightBorder) {

        int p = (leftBorder + rightBorder) / 2;
        int i = leftBorder;
        int j = rightBorder;

        while (i <= j) {
            while (list[p].compareTo(list[i]) > 0) i++;
            while (list[p].compareTo(list[j]) < 0) j--;

            if (i <= j) {
                Comparable buffer = list[i];
                list[i] = list[j];
                list[j] = buffer;
                i++;
                j--;
            }
        }
        return i;
    }

    static void sort (Comparable[] list, int leftBorder, int rightBorder) {
        if (list.length <= 1) return;

        int index = fast(list, leftBorder, rightBorder);

        if (leftBorder < index - 1) sort(list, leftBorder, index - 1);
        if (index < rightBorder) sort(list, index, rightBorder);
    }

}
