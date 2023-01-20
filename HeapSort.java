import java.util.Arrays;
// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
//
//* Сделать Асимптотическую оценку сложности
// Ассимптотическая сложнсть алгоритма равна O(n*(Log(n)) - мы дважды проходимся по элементам массива
// - сначала при построении двоичной кучи, потом при ее сортировке, что дает нам линейную сложность O(n);
// но внутри этих действий, при рекурсивном вызове метода heapify, элементы перемещаются по глубине двоичного дерева
// (глубина двоичного дерева - логарифм n по основанию 2).
//Поэтому n умножаем на log(n).



public class HeapSort {

    public static void main(String[] args) {
       int arr[] = {-25, 1000,5,7,320,2,500,3,19,4,12,4000};
       heapSort (arr);
        System.out.println("Отсортированный массив:" + Arrays.toString(arr));

    }
    static void heapSort (int arr[]){
        int n = arr.length;
        for (int i = n/2-1; i>=0;i--) {
            heapify(arr,i,n );
        }
        System.out.println("Двоичная куча:" + Arrays.toString(arr));

        for (int i = n-1; i>=1; i--){
            swap(arr,0,i);
            heapify(arr, 0,i);
        }


    }
    static void heapify (int arr[], int i, int n){
        int leftChildIndex = 2*i+1;
        int rightChildIndex = 2*i+2;
        int biggestElementIndex=i;
        if ((leftChildIndex <n)&&(arr[leftChildIndex]> arr[i]))biggestElementIndex = leftChildIndex;
        if ((rightChildIndex<n) && (arr[rightChildIndex]>arr[biggestElementIndex])) biggestElementIndex = rightChildIndex;
        if (!(biggestElementIndex==i)) {
            swap(arr, i, biggestElementIndex);
            heapify(arr,biggestElementIndex,n);
        }
    }
    static void swap (int arr[], int i, int j){
        int temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;

    }
}
