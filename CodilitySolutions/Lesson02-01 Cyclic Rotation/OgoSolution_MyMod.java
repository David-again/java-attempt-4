import java.util.Arrays;

public class OgoSolution_MyMod {

	public int[] solution(int[] A, int K){
        return null;
	}
	
	public static void main(String[] args) {
		
		String[] mainArray = {"A", "B",  "C", "D", "E"};
        // int[] mainArray = {3, 8, 9, 7, 6};
		int noOfRotations = 9;
		
		for (int m = 0; m < noOfRotations; m++) {
			System.out.println(Arrays.toString(mainArray));
			String[] tmp = new String[noOfRotations];
			int j = 0;

			for (int i = 0; i < mainArray.length; i++) 
				tmp[i] = mainArray[i];

			for (int i = 1; i < mainArray.length; i++) 
				mainArray[i] = tmp[j++];

			mainArray[0] = tmp[mainArray.length-1];
			

		}
	}
}
