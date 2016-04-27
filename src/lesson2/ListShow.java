package lesson2;

import java.util.ArrayList;
import java.util.List;

public class ListShow {

	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		test.add("test1");
		test.add("test2");
		
		for (String string : test) {
			System.out.println(string);
		}
	}
	
}
