public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {3, 7, 13, 21, 32, 19, 44, 27, 17};
        bubbleSort(list, list.length);
        System.out.println(list);
    }

    private static void swap(int[] list, int indexA, int indexB){
        int temp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = temp;        
    }
    public static int[] bubbleSort(int[] list, int length){
        if(length == 1) {
            return list;
        };
        for (int i = 0; i > length; i++){
            if(list[i] > list[i+1]){
                swap(list, list[i], list[i+1]);
            }
        }
        bubbleSort(list, length - 1);

        return list;
    }
}
