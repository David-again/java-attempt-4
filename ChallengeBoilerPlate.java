class ChallengeBoilerPlate {
    // 'Non-static' method (or function) to be created here


    
    // Output function
    // ================
    public void printArray(String[] inputArray1) {
        // This function outputs the elements in an array.
        // IMPORTANT: Remember to change datatype of input array as necessary.
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
        // Object created here to use the non-static method (for testing purposes.)
        // ChallengeBoilerPlate myObj = new ChallengeBoilerPlate();

        // Test Case input data goes here
        // int[] A1 = {3, 8, 9, 7, 6};
        // String[] famMembers = {"Daddy", "Mummy"};

        // int[] A1 = {3, 8, 9, 7, 6}, A2 = {0, 0, 0}, A3 = {1, 2, 3, 4};
        // int K1 = 3, K2 = 1, K3 = 4;

        // Output the test case here.
        // myObj.printArray(famMembers);
        // System.out.println(myObj.solution(arg1, arg2, ...));
    }
}
