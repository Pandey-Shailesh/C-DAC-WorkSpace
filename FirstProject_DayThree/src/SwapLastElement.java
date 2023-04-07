
import java.util.Arrays;

public class SwapLastElement {
	public static void main(String[] args) {

		System.out.println("Enter the Size of array ");
		int n = ConsoleInput.getInteger();
		int arr1[] = new int[n];
		for (int itemp = 0; itemp < n; itemp++) {
			System.out.println("Enter an " + (itemp + 1) + " integer of First Array");
			arr1[itemp] = ConsoleInput.getInteger();
		}
		System.out.println("Original Array :"+ Arrays.toString(arr1));
		int num =arr1[0];
		arr1[0]=arr1[n-1];
		arr1[n-1]=num;
		System.out.println("New Array after swapping the first and last elements :"+ Arrays.toString(arr1));
		
	}

}
