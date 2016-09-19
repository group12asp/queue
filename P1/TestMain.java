

public class TestMain {
    public static void main(String[] args) {
        
        QuickSort qs = new QuickSort();
        // Generate 1000 random numbers
        int[] list = qs.getRandomNumber(1000);
        System.out.println("before:");
        qs.display(list);
        // Record begin time of program
        long StartTime = System.nanoTime();
        qs.sort(list);
        //Record stop time of program
        long EndTime = System.nanoTime();
        System.out.println("\n\nsort:");
        qs.display(list);
        System.out.println("\nrunning time:" + (EndTime-StartTime)/1000 + "ns");
     
    }
}
