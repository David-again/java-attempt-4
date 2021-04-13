// class Solution { public int[] solution(int[] A, int K); }
class Solution1 {

    public int[] solution(int[] A, int K) {
        int [] result = {1,3};
        return result;
    }

   
    public static void main(String[] args) {
        
        Solution1 myObj1 = new Solution1();

        int[] A1 = {3, 8, 9, 7, 6}, A2 = {0, 0, 0}, A3 = {1, 2, 3, 4};
        int K1 = 3, K2 = 1, K3 = 4;

        System.out.println();
        System.out.println("Test #1");
        System.out.println("Inputs: " + A1 + "   " + K1);
        int ans1[] = myObj1.solution(A1, K1);
        for (int arrayElement : ans1) {
           System.out.print(arrayElement + "  ");
        }

        System.out.println();
        System.out.println("Test #2");
        int ans2[] = myObj1.solution(A2, K2);
        for (int test2Element : ans2) {
            System.out.print(test2Element + "  ");
        }
        
        System.out.println();
        System.out.println("Test #3");
        int ans3[] = myObj1.solution(A3, K3);
        for (int test2Element : ans3) {
            System.out.print(test2Element + "  ");
        }

    }
}
