package basicProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorejavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<String> array = new ArrayList<String>(); array.add("Ajith");
		 * array.add("Hari"); array.add("Amma"); array.add("Amalu");
		 * array.add("selenium"); array.remove(1);
		 * 
		 * System.out.println(array.get(1));
		 * 
		 * System.out.println("*************");
		 * 
		 * for(int i=0; i<array.size();i++) { System.out.println(array.get(i)); }
		 * 
		 * System.out.println("*************");
		 * 
		 * for (String value : array) { System.out.println(value); }
		 * System.out.println("*************");
		 * 
		 * System.out.println(array.contains("selenium"));
		 * 
		 * String[] names = {"Ajith","Aniyan","Amma"};
		 * 
		 * List<String> Arraynames = Arrays.asList(names);
		 * System.out.println(Arraynames.contains("Ammu"));
		 */

		// split string
		String s = "speridian Technologies Pvt Ltd";
		String[] arraysplit = s.split("Technologies");
		System.out.println(arraysplit[0]);
		System.out.println(arraysplit[1]);
//		System.out.println(arraysplit[2].trim());
//		System.out.println(arraysplit[3]);

	}

}
