package Homework3;

// Реализовать алгоритм сортировки массива слиянием

public class Task3_3 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 1, 9};
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Отсортированный массив: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
    
        while (i <= mid && j <= right) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
    
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
    
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
    
        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
}
