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

                // Test Case data
                // Case 1 
                // A = [3, 8, 9, 7, 6]
                // K = 3
                // Should return [9, 7, 6, 3, 8]

                // Case 2
                // A = [0, 0, 0]
                // K = 1
                // Should return [0, 0, 0]

                // Case 3
                // A = = [1, 2, 3, 4]
                // K = 2
                // Should return [3, 4, 1, 2]

        
                // Inputs 
                int[][] A = { {3, 8, 9, 7, 6}, {0, 0, 0}, {1, 2, 3, 4} };
                int[] K = { 3, 1, 2 }; 

                // Correct answer (for display only.)
                int[][] a = { {9, 7, 6, 3, 8}, {0, 0, 0}, {3, 4, 1, 2} };
        
                // Output 
                for (int i = 0; i < K.length; i++) {
                    int[] ans = testObj.solution(A[i], K[i]);    
                    System.out.println();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("***********************************************");
                    System.out.println("Test #" + (i + 1));
                    System.out.print("Input Array:     ");
                    testObj.outputNums(A[i]);
                    System.out.print("  Num Rotations: " + K[i]);
                    System.out.println(); System.out.println();
                    System.out.print("Function Output: ");
                    testObj.outputNums(ans);
                    System.out.println();
                    System.out.print("Correct  answer: ");
                    testObj.outputNums(a[i]);
                    System.out.println();
                    System.out.println("***********************************************");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println();
                }                
                
    }
}
