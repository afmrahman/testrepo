/*
Wirte a program
*/

import java.util.Scanner;

public class ATMTranV2
{

	public static void main(String[] args)
	{
		int choice = -1, daysInAYear= 365;
		Scanner scanner = new Scanner(System.in);

		double balance = 1000.00, withdrawlAmount = 0.0, depositAmount = 0.0, interstRate = 1.2;
		boolean isInterestCalculated = false, quitATM = false;

		System.out.println("==========================================");
		System.out.println("Welcome to ITPFUS Knowledge Bank ATM Booth");
		System.out.println("Here are your choices:");

		do
		{
			System.out.println("=============== Bank Menu ================");
			System.out.println("0. Quit");
			System.out.println("1. See balance");
			System.out.println("2. Make a Deposit");
			System.out.println("3. Make a Withdrawl");
			System.out.println("4. Calculate Daily Interest");
			System.out.println("==========================================");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();


			switch(choice) {
				case 0:
					quitATM = true;
					break;

				case 1:
					System.out.println("Your current balance is: $" + balance);
					break;

				case 2:
					System.out.print("Enter amount you want to deposit Amount: ");
					depositAmount = scanner.nextDouble();

					if (depositAmount > 0.0)
					{
						balance = balance + depositAmount;
					}

					System.out.println("Your current balance is: $" + balance);
					break;

				case 3:
					System.out.print("Enter amount you want to withdraw: ");
					withdrawlAmount = scanner.nextDouble();

					if (withdrawlAmount > balance)
					{
						System.out.println("You are not allowed to withdraw more than your current balance of " + balance);
					} else if (withdrawlAmount <= balance)
					{
						balance = balance - withdrawlAmount;
						System.out.println("Here is your writhdrawl amount. Your current balance is: $" + balance);
					}
					break;

				case 4:
					if (isInterestCalculated)
					{
						System.out.println("Your interest earnnings is already added to your current balance of $" + balance);
					} else {
						isInterestCalculated = true;
						double interest = balance * interstRate / 100.00 / daysInAYear;
						balance = balance + interest;
						System.out.println("Your interest earnings is $" + interest + ". Your current balance is: $" + balance + ". Dont try to be sneaky");
					}
					break;

				default:
					System.out.println("***Invalid choice!");
					break;

			}

			if (quitATM) {
				break;
			}

//			if (choice == 0)
//			{
//				break;
//			} else if (choice == 1)
//			{
//				System.out.println("Your current balance is: $" + balance);
//			} else if (choice == 2)
//			{
//				System.out.print("Enter amount you want to depositAmount: ");
//				depositAmount = scanner.nextDouble();
//				if (depositAmount > 0)
//				{
//					balance = balance + depositAmount;
//				}
//				System.out.println("Your current balance is: $" + balance);
//			} else if (choice == 3)
//			{
//				System.out.print("Enter amount you want to withdraw: ");
//				withdrawlAmount = scanner.nextDouble();
//
//				if (withdrawlAmount > balance)
//				{
//					System.out.print("You are not allowed to withdraw more than your current balance of " + balance);
//				} else if (withdrawlAmount <= balance)
//				{
//					balance = balance - withdrawlAmount;
//					System.out.println("Here is your writhdrawl amount. Your current balance is: " + balance);
//				}
//			} else if (choice == 4)
//			{
//
//				if (isInterestCalculated)
//				{
//					System.out.println("Your interest earnnings is already added to your current balance of " + balance);
//				} else {
//					isInterestCalculated = true;
//					double interest = balance * 1.2 / 100.00;
//					balance = balance + interest;
//					System.out.println("Your interest earnings is $" + interest + ". Your current balance is: $" + balance + ". Dont try to be sneaky");
//				}
//			} else
//			{
//				System.out.println("***Invalid choice!");
//			}

		} while (choice != 0);

		System.out.println("Thank you for banking with ITPFUS Organization!");
		System.out.println("Where knowledge you gain will set you to a successful career path!");
		System.out.println("Have a nice day!");
		System.out.println("==========================================");

		if (scanner != null)
		{
			scanner.close();
		}

	}

}