package basicProject;

public class CorejavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variable data type

		/*
		 * int number = 5; String value = "Ajith is my name"; double dece = 4.55; char
		 * name = 's';
		 * 
		 * System.out.println(number+" is my lucky number");
		 * 
		 * System.out.println(value); System.out.println(dece);
		 * System.out.println(name);
		 */

		//
		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

		System.out.println("************");

		// int[] number = {2,4,5,7,8};

		System.out.println(num[0]);

		String[] name = new String[2];

		name[0] = "Ajith";
		name[1] = "Aniyan";

		System.out.println(name[0]);
		System.out.println("************");

		// iterating in loop
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);

		}

		System.out.println("************");

		String[] names = { "Ajith", "Aniyan", "Amma" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("************");

		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("************");

		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {

				System.out.println(values[i]);

			} else {

				System.out.println(values[i] + " Is an odd number");
				break;
			}
		}

	}

}
