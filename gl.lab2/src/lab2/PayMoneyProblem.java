package lab2;

import java.util.Scanner;

public class PayMoneyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOfTransactions = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		noOfTransactions = scan.nextInt();
		
		int transactionAmounts[] = new int[noOfTransactions];
		System.out.println("Enter the values of array");
		for(int index=0; index<transactionAmounts.length; index++)
		{
			transactionAmounts[index]=scan.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int noOfTargets = scan.nextInt();
		int targetAmount[] = new int[noOfTargets];
		for (int index=0; index<targetAmount.length; index++)
		{
			System.out.println("Enter the value of target");
			int amount = scan.nextInt();
			
			int total = 0;
			boolean targetAchieved = false;
			for(int travel=0; travel<transactionAmounts.length; travel++)
			{
				total += transactionAmounts[travel];
				if (total>=amount)
				{
					System.out.println("Target achieved after " + (travel+1)+ " transactions");
					targetAchieved = true;
					break;
				}
			}
			if (!targetAchieved)
			System.out.println("Given target is not achieved");
		}
		
		{
			
		}

	}

}
