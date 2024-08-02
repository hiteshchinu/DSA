package SpaceTimeComplexity;

public class Linear {
    public static void main(String[] args) {
        // BigO(n) (print the elements of an array)
        int[] arr = new int[]{1,2,3,4,5};
        // Add 10 to first element
        arr[0] += 10; //O(1)

        for(int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);

        // T.C. -> O(n)
        // S.C. -> O(1)

        //Copying the elements
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        for(int n: newArr)
        System.out.println(n);
    }
}
