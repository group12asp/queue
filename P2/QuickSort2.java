
public class QuickSort2 {
	
	void quicksort2(int arr[], int low, int high){
	        // Create a stack
	        int stack[] = new int[high-low+1];	      
	        int top = -1;
	 
	        // Push edge values of list in the stack
	        stack[++top] = low;
	        stack[++top] = high;
	 
	        // Keep popping elements until stack is not empty
	        while (top >= 0){
	            // Pop h and l
	            high = stack[top--];
	            low = stack[top--];
	 
	            // Set pivot element at it's proper position
	            int p = partition(arr, low, high);
	 
	            // If there are elements on left side of pivot,
	            // then push left side to stack
	            if ( p-1 > low ){
	                stack[ ++top ] = low;
	                stack[ ++top ] = p - 1;
	            }
	 
	            // If there are elements on right side of pivot,
	            // then push right side to stack
	            if ( p+1 < high ){
	                stack[ ++top ] = p + 1;
	                stack[ ++top ] = high;
	            }
	       }
	    }
	 
	int partition (int arr[], int low, int high)
	    {
	        int x = arr[high];
	        int i = (low - 1);
	 
	        for (int j = low; j <= high- 1; j++)
	        {
	            if (arr[j] <= x)
	            {
	                i++;
	                // swap arr[i] and arr[j]
	                swap(arr,i,j);
	            }
	        }
	        // swap arr[i+1] and arr[high]
	        swap(arr,i+1,high);
	        return (i + 1);
	    }
	void swap(int arr[],int i,int j)
	    {
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
	        quicksort2(val,0, val.length - 1);
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
	        	// Change line for each 10 numbers
	            if (0 == index % 10) {
	                System.out.println();
	            }
	            System.out.print(arr[index] + "   ");
	        }
	    }

}
