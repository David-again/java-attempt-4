public class CyclicRotation {
    public int[] solution(int[] A, int K){
        // Algorithm
        // Initialize any variables
        // Create B[], array of same size as A
        // For loop thru indexes of A[]
        //      int adjustedIndex = oldIndex + K
        //      if (adjustedIndex >= A.length)
        //          newIndex = adjustedIndex - A.length
        //      else
        //          newIndex = adjustedIndex
        //      end if
        //      B[newIndex] = A[oldIndex];
        // next oldIndex
        // return B[]

        int[] B = new int[A.length];
        for (int oldIndex = 0; oldIndex < A.length; oldIndex++) {
            int newIndex;
            int adjustedIndex = oldIndex + K;
            if (adjustedIndex >= A.length) {
                newIndex = adjustedIndex - A.length;
            } else {
                newIndex = adjustedIndex;
            }
            B[newIndex] = A[oldIndex];
        }
        return B;
    }

    public void outputNums(int[] theNumbers) {
        // outputs the numbers in an integer array.
        System.out.print("[");
        for (int i = 0; i < theNumbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(theNumbers[i]);
        }
        System.out.print("]");
    }
    
    public static void main(String[] args) {
                // Object created to use the non-static method (for testing purposes.)
                CyclicRotation testObj = new CyclicRotation();

                // Test Case data go here
                int[] A1 = {3, 8, 9, 7, 6}, A2 = {0, 0, 0}, A3 = {1, 2, 3, 4};
                int[] a1 = {9, 7, 6, 3, 8}, a2 = {0, 0, 0}, a3 = {1, 2, 3, 4};
                int K1 = 3, K2 = 1, K3 = 4;
        
                // Output the test case here.
                int[] ans = testObj.solution(A1, K1);
                System.out.println();
                System.out.println("Test #1");
                System.out.print("Input Array:     ");
                testObj.outputNums(A1);
                System.out.print("  Num Rotations: " + K1);
                System.out.println(); System.out.println();
                System.out.print("Function Output: ");
                testObj.outputNums(ans);
                System.out.println();
                System.out.print("Correct  answer: ");
                testObj.outputNums(a1);
                
                
    }
}
