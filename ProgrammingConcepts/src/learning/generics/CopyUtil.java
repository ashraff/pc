package learning.generics;

import java.util.ArrayList;
import java.util.List;

public class CopyUtil {

	public static <T> void copy(List<? super T> dest, List<? extends T> src) {
		for (int i = 0; i < src.size(); i++)
			dest.add(src.get(i));
	}

	public static void main(String... a) throws InterruptedException {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		List<Object> numberList = new ArrayList<Object>(2);
		CopyUtil.copy(numberList, integerList);
		System.out.println(numberList);

	}

}
