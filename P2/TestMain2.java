
public class TestMain2 {
public static void main(String[] args) {
        
        QuickSort2 qs2 = new QuickSort2();
        // Generate 1000 random numbers
        int[] list = qs2.getRandomNumber(1000);
        System.out.println("before:");
        qs2.display(list);
        // Record begin time of program
        long StartTime = System.nanoTime();
        qs2.sort(list);
        //Record stop time of program
        long EndTime = System.nanoTime();
        System.out.println("\n\nsort:");
        qs2.display(list);
        System.out.println("\n:" + (EndTime-StartTime) / 10000 + "ns");
     
    }

}
