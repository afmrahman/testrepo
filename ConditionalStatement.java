import java.util.Scanner;
public class ConditionalStatement {
	public static void main(String args[]) {
	String name = "David";
	System.out.print("Please enter the hour of the day[10|14|20|22]:");
	Scanner scanner = new Scanner(System.in);
	int timeOfTheDay = scanner.nextInt();

	System.out.println("You have entered: "+ " " + timeOfTheDay+ " " + "Good Choice");

	//LocalDateTime now = LocalDateTime.now();
   // System.out.println(dtf.format(now));




	if (timeOfTheDay == 10) { //true
	System.out.println("name" +" "+ "Good Afternoon");
  } else if (timeOfTheDay == 14) {
	  System.out.println("name" +" "+ "Good Morning");
  }  else if (timeOfTheDay == 20) {
	  	  System.out.println("name" +" "+ "Evening");
  }  	  else if (timeOfTheDay == 22) {
		  	  System.out.println("name" +" "+ "Good Night");
  }  else {
		  	  System.out.println("name" +" "+ "Hi");
  }
 }
}
