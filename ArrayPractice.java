public class ArrayPractice {

    public void outputNums(int[] theNumbers) {
        // outputs the numbers in an integer array.
        for (int currentNum : theNumbers){
            System.out.println(currentNum);
        }
    }
    public static void main(String[] args) {
        int[] luckyNums = {4, 7, 25, 17};
        // luckyNums = {4, 7, 25, 17};
        int[] another = new int[luckyNums.length];
        
        luckyNums[2] = 12;
        ArrayPractice arrObj = new ArrayPractice();
        arrObj.outputNums(luckyNums);
        System.out.println();
        arrObj.outputNums(another);
        another = luckyNums;
        System.out.println();
        arrObj.outputNums(another);
        
    }
}
