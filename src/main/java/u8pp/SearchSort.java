package u8pp;

import java.util.ArrayList;

public class SearchSort {


/*/
1. selectionSort function
*/
    public static void selectionSort(int[] arr){
        //traverse from 0 to end
        for(int i = 0; i < arr.length; i++){
            // i is a min, min changes for every i++
            int min = arr[i];
            int check = i;
            //traverse from i to end of array
            for(int j = i; j < arr.length; j++){
                // check if there is a number smaller than min
                if(arr[j] < min) { 
                    min = arr[j];
                    check = j;
                }
            }
            //will only swap if check is changed
            arr[check] = arr[i];
            arr[i] = min;
        }
    }

    public static ArrayList<Student> selectionSort(ArrayList<Student> arr){
        return arr;
    }



/*/
2. insertionSort function
*/
    public static void insertionSort(int[] arr){
        //traverse array from index 1 to end
        for (int i = 1; i < arr.length; i++) {
            //traverse backwards from index to beginning
            for (int j = i; j > 0; j--) {
                //put it in the correct spot
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    
    public static ArrayList<Student> insertionSort(ArrayList<Student> arr){
        return arr;
    }



/*/
3. mergeSort function
*/
    public static void mergeSort(int[] arr) {

        //find the middle and seperate the array into 2 arrays
        int n = arr.length;

        if (n < 2) {
            return;
        }

        int middle = n / 2;

        int[] one = new int[middle];
        int[] two = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            one[i] = arr[i];
        }
        for (int i = middle; i < n; i++) {
            two[i - middle] = arr[i];
        }

        //recursive function to reduce each array into half arrays ... then half arrays of the half ... then half arrays of the half ... :D
        mergeSort(one);
        mergeSort(two);

        //when they are all seperate arrays, call the merge function
        merge(arr, one, two, middle, n - middle);
        
    }

    public static void merge(int[] sorted, int[] one, int[] two, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (one[i] <= two[j]) {
                sorted[k++] = one[i++];
            }
            else {
                sorted[k++] = two[j++];
            }
        }
        while (i < left) {
            sorted[k++] = one[i++];
        }
        while (j < right) {
            sorted[k++] = two[j++];
        }

    }

    public static ArrayList<Student> mergeSort(ArrayList<Student> arr){
        return arr;
    }    
    


/*/
Extra Credit: bubbleSort function
*/
    public static void bubbleSort(int[] arr){
        //traverse array
        for(int i = 0; i < arr.length; i++){
            //traverse from 1 + index i
            for(int j = i + 1; j < arr.length; j++){
                //a greater number will be swapped
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr){
        return arr;
    }    

    public static ArrayList<Student> bubbleSort(ArrayList<Student> arr){
        return arr;
    }    


}