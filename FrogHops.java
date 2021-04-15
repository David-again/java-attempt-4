class FrogHops {
    // 'Non-static' method (or function) to be created here
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        // Algorithm
        // dist2go = Y-X
        // float hops = dist2go / D
        // actualHops = hops rounded to nearest integer
        // return actualHops

        // Implementation
        double dist2go = Y - X;
        double hops = dist2go / D;
        double roundedHops = Math.ceil(hops);
        int actualHops = (int) roundedHops;
        return actualHops;
    }


    public static void main(String[] args) {
        // Object created here to use the non-static method (for testing purposes.)
        FrogHops myObj = new FrogHops();

        // Test Case input data goes here
        int X = 1;
        int Y = 1;
        int D = 3;

        // Output the test case here.
        System.out.println(myObj.solution(X, Y, D));
        
    }
}
