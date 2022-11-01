package countingSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {3, 4 , 1, 65, 35, 656, 23, 12};
        int size = data.length;
        CountingSort cs = new CountingSort();
        cs.countSort(data, size);
        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(data));
    }
}
