import java.util.Calendar;
public class Demo {
   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      //System.out.println(calendar.getTime().toString());
      int day = calendar.get(Calendar.DAY_OF_WEEK);
      //System.out.println("Day: " + day);
      //int hour = calendar.get(Calendar.HOUR_OF_DAY);
      //System.out.println("Hour: " + hour);
      //int minute = calendar.get(Calendar.MINUTE);
      //System.out.println("Minute: " + minute);

      switch (day) {
	  	  case 1:
	  	    System.out.println("Monday");
	  	    break;
	  	  case 2:
	  	    System.out.println("Tuesday");
	  	    break;
	  	  case 3:
	  	    System.out.println("Wednesday");
	  	    break;
	  	  case 4:
	  	    System.out.println("Thursday");
	  	    break;
	  	  case 5:
	  	    System.out.println("Friday");
	  	    break;
	  	  case 6:
	  	    System.out.println("Saturday");
	  	    break;
	  	  case 7:
	  	    System.out.println("Sunday");
	  	    break;
	  	}
	  // Outputs "Thursday" (day 4)


   }
}