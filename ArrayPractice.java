public class ArrayPractice {

    public void outputNums(int[] theNumbers) {
        // outputs the numbers in an integer array.
        for (int currentNum : theNumbers){
            System.out.println(currentNum);
        }
    }

    public void printArray(int[] inputArray1) {
        // This function outputs the elements in an array.
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
        int[] luckyNums = {4, 7, 25, 17};
        
        //create another array with same length
        int[] another = new int[luckyNums.length];      
        
        ArrayPractice arrObj = new ArrayPractice();
        arrObj.printArray(luckyNums);       // output original array
        System.out.println();
        
        arrObj.printArray(another);     // output new array (auto-initialized with zeroes)
        
        // duplicate original array into new array
        another = luckyNums;
        another[2] = 12;        // change specific array element
        System.out.println();
        arrObj.printArray(another);     // output new array containing updated version of original array
        
    }
}
