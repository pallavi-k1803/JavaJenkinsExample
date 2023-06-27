
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByOccurance {
	public static void main(String args[]) {
		Integer array[] = {2,5,2,6,8,5,8,8,9,10};
		
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		list.sort(Comparator.comparing(i -> Collections.frequency(list, i)));
//		Collections.sort(list);
		System.out.print(list);
		
	}
}
