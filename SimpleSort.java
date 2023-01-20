import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int arr[] = {-25, 1000, 5, 7, 320, 2, 500, 3, 19, 4, 12, 4000};
        bubbleSort(arr);
        selectionSort(arr);
        insertSort(arr);
    }
    static void bubbleSort (int arr[]){
        boolean isFinished = true;
        do {
           isFinished = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isFinished = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
            while (!isFinished);
        System.out.println("Отсортированный массив:" + Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0 ; i < arr.length-1 ; i++ ){
            int indexOfMin = i;
            for (int j = i+1; j<arr.length ; j++ ){
                if (arr[j]<arr [indexOfMin]) indexOfMin = j;
            }
            if (indexOfMin!=i){
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin]= temp;
            }
        }
        System.out.println("Отсортированный массив:" + Arrays.toString(arr));
    }
    static void insertSort (int [] arr){
        for (int i = 0 ; i< arr.length-1; i++){
            for (int j =i+1 ; j<arr.length; j++){
                if (arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr [j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив:" + Arrays.toString(arr));
    }
}
