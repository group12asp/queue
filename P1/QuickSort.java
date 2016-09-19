
public class QuickSort {

    private void quicksort(int[] arr,int low, int high) {
        int i = low, j = high;
        // Get the pivot element in the middle of the list
        int pivot = arr[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
        	// Continue to move i If the current value from the left list
            //  is smaller then the pivot element
            while (arr[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (arr[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                swap(arr,i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(arr,low, j);
        if (i < high)
            quicksort(arr,i, high);
    }
    
    private void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(int[] val) {
        // Check if array is empty
        if (val ==null || val.length==0){
        	System.out.println("length can not be zero");
            return;
        }      
        quicksort(val,0, val.length - 1);
    }
    
    public int[] getRandomNumber(int len) {
        if (len < 1) {
            len = 1;
        }
        int[] arr = new int[len];
        // Generate 1000 random integers
        for (int index = 0; index < len; index++) {
            arr[index] = (int) (Math.random() * 1000);
        }
  
        return arr;
    }
    
    public void display(int[] arr) {
        for (int index = 0; null != arr && index < arr.length; index++) {
        	// Change line for each 10 list
            if (0 == index % 10) {
                System.out.println();
            }
            System.out.print(arr[index] + "   ");
        }
    }
}
