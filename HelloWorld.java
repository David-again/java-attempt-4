public class HelloWorld {

    static int randomIntBetween(int low, int hi){
        // returns a random number between low and upper (inclusive)
        // Note: no error checking of the inputs.

        // This is a 'static method', which therefore does not require an object to be accessed.
        int randomNum = (int) (Math.random() * (hi - low)) + low;
        return randomNum;
    }

    public int addUpTo(int k) {
        // Add all integers up to (and including) K
        // Note that input isn't error-checked!

        // Public (or 'non-static' method); requires an object to be accessed!  Note to self: don't forget!!!
        if (k > 0) {
          return k + addUpTo(k - 1);
        } else {
          return 0;
        }
    }
    
    public static int addIntBetween(int start, int end) {
        // This method is both public + static at the same time???  Yet doesn't require an object to be accessed... interesting!
        if (end > start) {
            return end + addIntBetween(start, end - 1);
        } else {
            return end;
        }
    }

    static String checkAge(int age) {
        // Use Tenary operator to check age

        // This is also a static method; doesn't require an object to be accessed.
        String greeting = (age >= 18) ? ("Welcome, adult... Access granted!") : ("You are under-age.  Access denied!");
        return greeting;
    }

    static void print2DArray(int[][] twoDArray){
        // prints a 2-dimensional array.

        // Also a static method; doesn't require an object to be accessed.
        for (int i = 0; i < twoDArray.length; ++i) {
            for (int j = 0; j < twoDArray[i].length; ++j) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print a random number (within a given range) from custom function.
        System.out.println("Random number between 11 and 20: " + randomIntBetween(11, 20));

        // Working with a multi-dimensional array
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        print2DArray(myNumbers);

        System.out.println(checkAge(20));

        // System.out.println(addUpTo(9));  
        // Previous line throws this error: "Cannot make a static reference to the non-static method"
        
        HelloWorld myObj = new HelloWorld();
        System.out.println(myObj.addUpTo(6));

        System.out.println(addIntBetween(0, 9));
        System.out.println(addIntBetween(10, 13));
    }
}