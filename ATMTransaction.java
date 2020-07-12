import java.util.Scanner;
public class ATMTransaction
{
	public static void main(String args[])
	{
		double balance = 400;
	Scanner scan = new Scanner(System.in);


	System.out.println("enter withdrawal amount: ");
	double WithdrawAmount = scan.nextDouble();

	if (balance == 0)
	{
	System.out.println("Insufficient Fund");
	}
	else if ( WithdrawAmount < balance)
	{
		System.out.println("Here is your money");
	}
	scan.close();
  }
}