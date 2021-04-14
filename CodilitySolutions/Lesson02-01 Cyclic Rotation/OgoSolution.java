import java.util.Arrays;

public class OgoSolution {
	public static void main(String[] args) {
		
		String[] mainArray = {"A", "B", "C"};
		int noOfRotations = 4;
		
		for (int m = 0; m < noOfRotations; m++) {
			System.out.println(Arrays.toString(mainArray));
			String[] tmp = new String[4];
			int j = 0;

			for (int i = 0; i < mainArray.length; i++) 
				tmp[i] = mainArray[i];

			for (int i = 1; i < mainArray.length; i++) 
				mainArray[i] = tmp[j++];

			mainArray[0] = tmp[mainArray.length-1];
			

		}
	}
}
