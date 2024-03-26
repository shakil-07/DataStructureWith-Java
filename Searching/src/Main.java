import java.util.Arrays;
import java.util.Scanner;

/*
    Binary Search works with sorted array.
    Binary search repeatedly divides the search interval in half. It begins by comparing the target value to the middle element of the array.
    If the target value matches the middle element

    Binary search has a time complexity of O(log n), where 'n' is the number of elements in the array.
    This logarithmic time complexity means that as the size of the array increases,
    the time taken by the algorithm grows very slowly. So, Binary Search is very faster with more elements
 */
class BinarySearch {
    public int binarySearch(int[] arr, int number) {
        int array_size = arr.length;
        int left =0;
        int right = array_size - 1;
        while(left < right) {
            int mid = (left + right)/2;
            if (arr[mid] > number) {
                right = mid - 1;
            } else if (number > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

/*
    The time complexity of the linear search algorithm is O(n),
    where 'n' is the number of elements in the array.
    O(n) signifies that the time taken by the algorithm is directly proportional to the number of elements in the array.
    As the size of the array increases, the time taken by the algorithm also increases linearly.
 */
class LinearSearch {
    public int linerSearch(int[] arr,int n) {
        int array_size = arr.length;
        for (int i = 0; i < array_size; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3,8,6,7,2};
        System.out.println("The Array is: " + Arrays.toString(arr));
        //Linear Search
        System.out.println("Find the number:");
        int number = scanner.nextInt();
        LinearSearch linearSearch = new LinearSearch();
        System.out.println("So the value is present in index:" + linearSearch.linerSearch(arr,number));

        //Binary Search
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Get Binary Searched Number at index " + binarySearch.binarySearch(arr,number));
    }
}