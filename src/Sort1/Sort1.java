package Sort1;

public class Sort1 {
    public static void selectionSort (Comparable[] arr) {
        int min;
        Comparable t;

        for (int i = 0; i < arr.length-1; i++)
        {
            min = i;
            for (int k = i+1; k < arr.length; k++)
                if (arr[k].compareTo(arr[min]) < 0)
                    min = k;
            t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }
}