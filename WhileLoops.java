public class WhileLoops {
	public static void main(String args[]) {

		int counter = 1;
		System.out.println("counter value is now: " + counter);
		while (counter < 10) { //evaluate
			System.out.println("[while]: counter valie is: " + counter);
			System.out.println("[while]: hello");
			counter = counter + 1;
		}

		System.out.println("counter value is now: " + counter);

		counter = 5;
		System.out.println("counter value is now: " + counter);
		do {
			System.out.println("[do-while] counter value is now: " + counter);
			System.out.println("[do-while]: hello");
			counter = counter + 1;
		} while (counter < 10);

		System.out.println("counter value is now: " + counter);
		//statement;

		counter = 50;
		System.out.println("counter value is now: " + counter);
		do {
			System.out.println("[do-while] counter value is now: " + counter);
			System.out.println("[do-while]: hello");
			counter = counter + 1;
		} while (counter < 10);

		System.out.println("counter value is now: " + counter);


	}
}