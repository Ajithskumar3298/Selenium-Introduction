package basicProject;

public class Methods_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods_Demo demo = new Methods_Demo();
		demo.getdata();

		Methods_Demo1 demo1 = new Methods_Demo1();
		demo1.getvalue();

		String name = demo.getdata();
		System.out.println(name);

		System.out.println("***********");
		getname();

	}

	public String getdata() {
		System.out.println("Hello World");
		return "Ajith";
	}

	public static void getname() {
		System.out.println("My name is Ajith");
	}

}
