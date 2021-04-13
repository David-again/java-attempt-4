public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Generate a random number between upper (exclusive) and lower (inclusive)
        int upper = 20, lower = 11;
        int randomNum = (int) (Math.random() * (upper - lower)) + lower;
        System.out.println(randomNum);

        // Tenary operator
        int time = 20;
        String greeting = (time < 18) ? ("Good morning.") : ("Good day.");
        System.out.println(greeting);

        // Working with a multi-dimensional array
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}