
import java.util.Arrays;

public class RotateArray {
	 public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50, 60, 70};
	        int[] rotatedArray = new int[array.length];
	        
	        for (int i = 0; i < array.length; i++) {
	            int newIndex = (i + array.length - 1) % array.length;
	            rotatedArray[newIndex] = array[i];
	        }
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
	    }
}
