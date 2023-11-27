public class HowToSort {
    public static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    //    bubble sort : worst:: O(n^2), average :: O(n^2), best: O(n^2)
    public static void BubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
    }
    //    selction sort : worst:: O(n^2), average :: O(n^2), best: O(n^2)
    public static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            swap(arr, i, minIdx);
        }

    }
    //    Insert Sort : worst:: O(n^2), average :: O(n^2), best: O(n)
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j = i - 1;
            while(j >= 0 && tmp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }
}
