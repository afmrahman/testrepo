public class HelloWorld {

	static String city = "New York";

	public static int add(int i, int j) {
		int result;
		result = i + j;
		return result;
	}

	//method overloading
	public static double add(double i, double j) {
		double result;
		result = i + j;
		return result;
	}

	public static int sub(int i, int j) {
		int result;
		result = i - j;
		return result;
	}

	public static void main(String args[]) {
		int age;
		age = 30;

		String name = "Mustfiz";

		int i = 30, j = 20;
		int k = add(i,j);
		int l = sub(i,j);
		double d = add(1.2,3.4);

		System.out.println("k: " + k + " l:" + l + " d: " + d);
		System.out.println( i == j );
		System.out.println("name: " + name + " is " + age + " years old" );
		System.out.println("Hello World!");
		System.out.println("Goodbye!");
	}
}