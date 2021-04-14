class CodilityBoilerPlate {
    // 'Non-static' method (or function) from Codility to be created here


    
    // Output functions
    // ================
    static void printArray(int[] inputArray1) {
        // This function outputs the elements in an array.  Object not necessary to call, since it's static.
        // IMPORTANT: Remember to change datatype of the argument array as necessary.
        System.out.print("[ ");
        for (int i = 0; i < inputArray1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(inputArray1[i]);
        }
        System.out.print(" ]");
    }

    public static void main(String[] args) {
        // Test Case input data goes here
        // ******************************
        // int[] A1 = {3, 8, 9, 7, 6}, A2 = {0, 0, 0}, A3 = {1, 2, 3, 4};
        // int K1 = 3, K2 = 1, K3 = 4;
        // String[] famMembers = {"Daddy", "Mummy"};
        
        
        // Object created here to use the non-static method (for testing purposes.)
        // ************************************************************************
        // CodilityBoilerPlate myObj = new CodilityBoilerPlate();



        
        // Output the test case here.
        // *****************************
        // System.out.println(myObj.solution(arg1, arg2, ...));
        // printArray(A3);

        // For non-static methods, use myObj.methodName
        // myObj.printArray(famMembers);
    }
}
