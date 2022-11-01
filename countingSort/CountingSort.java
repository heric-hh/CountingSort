package countingSort;

public class CountingSort {
    void countSort( int arr[], int size ) {
        int[] output = new int[ size + 1 ];
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if( arr[i] > max ) {
                max = arr[i];
            }
        }
        int[] count = new int [ max + 1 ];
        
        //Inicializar count del array con todos los ceros
        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }
        
        // Almacenar el contador de cada elemento
        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }
        
        // Almacenar la acumulacion de count de cada array
        for (int i = 1; i <= max; i++) {
            count[i] += count[ i - 1 ];
        }
        
        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            arr[i] = output[i];
        }
    }
}
