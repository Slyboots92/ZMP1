package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapShow {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(new Integer(1), "bla1");
		map.put(new Integer(2), "bla2");
		map.put(new Integer(3), "bla3");
		
		Set<Integer> keys = map.keySet();
		
		for (Integer integer : keys) {
			System.out.println(map.get(integer));
		}
	}

}
