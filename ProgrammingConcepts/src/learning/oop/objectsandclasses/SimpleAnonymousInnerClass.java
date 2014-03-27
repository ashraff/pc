package learning.oop.objectsandclasses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleAnonymousInnerClass {

	Map<String, String> simpleMap = new HashMap<String, String>();

	Map<String, String> map = new HashMap<String, String>() {

		private static final long serialVersionUID = -8495460326146514021L;

		{
			put("KEY-1", "VALUE-1");
			put("KEY-2", "VALUE-2");
			put("KEY-3", "VALUE-3");

		}

	};

	public Map<String, String> getMap() {
		return map;
	}/*-?|Test Review|aw39997|c0|?*/

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return Arrays.toString(map.entrySet().toArray());
	}

	public static void main(String... args) {
		SimpleAnonymousInnerClass anonymousInnerClass = new SimpleAnonymousInnerClass();

		if (anonymousInnerClass.getMap().getClass()
				.equals(anonymousInnerClass.simpleMap.getClass())) {
			System.out.println("Both Classes Are Equal");
		} else {
			System.out.println("Both Classes Are Not Equal");
		}
	}

}
