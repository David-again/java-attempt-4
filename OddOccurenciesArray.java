public class OddOccurenciesArray {
    public int solution(int[] A){

        //Algoritm
        // ==========
        // Duplicate the Array B[] = A[];
        // for currentIndex in B[]  (loop thru 0 to B.length)
        //      uniqueItem = true    (i.e. assume it's a unique element)
        //      for searchIndex in B    (i.e. loop from currIndex + 1 to B.length)
        //          if B[currIndex] == B[searchIndex]
        //              change both elements to -1 and uniqueItem = false
        //              break out of inner loop
        //          end if
        //      end innerloop
        //      if uniqueItem == true
        //          unpairedIndex = currentIndex
        //          break out of outer loop
        //      end if
        //  end outerloop
        // return unpairedIndex

        // Implementation
        boolean uniqueItem; 
        int unpairedIndex = -1;
        int[] B = A;
        for (int currentIndex = 0; currentIndex < B.length; currentIndex++) {
            uniqueItem = true;
            if (B[currentIndex] == -1) { continue; }
            for (int searchIndex = (currentIndex+1); searchIndex < B.length; searchIndex++) {
                if (B[currentIndex]==B[searchIndex]) {
                    B[currentIndex] = -1;
                    B[searchIndex] = -1;
                    uniqueItem = false;
                    break;
                }
            }
            if (uniqueItem == true) {
                unpairedIndex = currentIndex;
                break;
            }
        }
        return A[unpairedIndex];
    }
    public static void main(String[] args) {
        // Test Cases
        int[] A = {9,3,9,3,9,7,9};

        // Object to run the method:
        OddOccurenciesArray myObj = new OddOccurenciesArray();
        System.out.println(myObj.solution(A));
    }
}
