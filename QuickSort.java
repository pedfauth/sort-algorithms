public class QuickSort {
    public static void sort(int[] arr, int menor, int maior) {
        if (menor < maior) {
            int particao = partition(arr, menor, maior);
            sort(arr, menor, particao - 1);
            sort(arr, particao + 1, maior);
        }
    }
    private static int partition(int[] array, int menor, int maior) {
        int pivo = array[maior];
        int i = menor - 1;

        for (int j = menor; j < maior; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;

        return i + 1; 
    }
}
