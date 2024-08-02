package SpaceTimeComplexity;

public class Log {
    // 0(log n)
    public static void main (String args[]) {
        int[] arr = new int[]{ 2, 5, 10, 20, 40, 60 };


        // Take is to find 40 in the given array
        var startTime = System.nanoTime();


        for(int i = 0; i < arr. length; i++) { 
            // T.C O(n)
            if (arr[i] == 40) {
                System.out.println("Found 40 at index " + i);
            }
        }

        var endTime = System.nanoTime();
        System.out.println("Linear S. Took " + (endTime - startTime));



        startTime = System.nanoTime();
        int start = 0;
        int end = arr. length - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == 40) {
                System.out.println("[BS] Found 40 at index "+ mid);
                break;
            } 
            else if(arr[mid] < 40) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Binary S. Took " + (endTime - startTime));
    }
}
