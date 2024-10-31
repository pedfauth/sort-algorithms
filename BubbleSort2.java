public class BubbleSort2 {
    public static void main(String[] args) {
        int[] list = {3, 7, 13, 21, 32, 19, 44, 27, 17};
        bubbleSort(list);
        System.out.println(list);
    }

    public static void bubbleSort(int[] list){
        int n = list.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
