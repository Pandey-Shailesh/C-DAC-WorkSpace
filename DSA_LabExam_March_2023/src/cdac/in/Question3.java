//Name:- Shailesh Buddthinath Pandey
//PRN:-  230310120029

package cdac.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
	public List<Integer> removeDuplicates(int array[]) {// O(n)-->time complexity and space complexity is O(n)
		Arrays.sort(array);
		List<Integer> result = new ArrayList<>();
		for (int iTemp = 0; iTemp < array.length; iTemp++) {
			if (iTemp == 0 || array[iTemp] != array[iTemp - 1]) {
				result.add(array[iTemp]);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 30, 40, 40, 50, 60, 70 };
		Question3 objQuestion3 = new Question3();
		List<Integer> objList = objQuestion3.removeDuplicates(numbers);
		System.out.println("Outpt: "+objList);

	}

}
