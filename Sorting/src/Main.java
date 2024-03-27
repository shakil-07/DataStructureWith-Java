import java.util.Arrays;

/*
    In bubble sort in each iteration multiple swaps can be done , but in the case of insertion sort
    only one swap will be done in each iteration, so its better than bubble sort although its worst case time complexity
    is same as Bubble sort -> O(n^2)

    The time complexity of selection sort is O(n^2) in all cases: worst-case, average-case, and best-case.
    in bubble sort, swapping is done in inner loop
    in insertion sort, swapping is done in outer loop
 */
class SelectionSort {
    public void selectionSort(int[] arr) {
        int arr_size = arr.length;
        for (int i = 0; i < arr_size - 1; i++) {
            //Assume arr[i] is the maximum value
            int max_index = arr_size - i - 1;
            //get maximum element from whole array with this iteration except arr[i]
            for (int j = 0; j < arr_size - i - 1; j++) {
                if (arr[max_index] < arr[j]) {
                    max_index = j;
                }
            }
            // Swap the maximum element with the rightmost unsorted element
            int temp = arr[max_index];
            arr[max_index] = arr[arr_size - i - 1];
            arr[arr_size - i - 1] = temp;
        }
    }
}
/*
    In bubble sort array element is compared with the each iteration and if the element is greater than the next element
    It's swapped and at the end of iteration most greater element goes to rightmost index

    The time complexity of the bubble sort algorithm is O(n^2) in the worst and average cases, and O(n) in the best case (when the list is already sorted).
    Here, 'n' represents the number of elements in the array.
 */
class BubbleSort {
    public void bubbleSort(int[] arr) {
       int arr_length = arr.length;
       for(int i = 0; i < arr_length - 1 ; i++) {
           for (int j = 0; j < arr_length - i - 1; j++) {
               if (arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }
}


public class Main {
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,2};
        System.out.println("The Array is: " + Arrays.toString(arr));
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
//        System.out.println("Bubble Sort in progress");
//        bubbleSort.bubbleSort(arr);
//        System.out.println("after bubble sorting the Array is: " + Arrays.toString(arr));
//        System.out.println("Bubble Sort is done");

        System.out.println("Selection Sort in progress");
        selectionSort.selectionSort(arr);
        System.out.println("after Selection sorting the Array is: " + Arrays.toString(arr));
        System.out.println("Selection Sort is done");

    }
}