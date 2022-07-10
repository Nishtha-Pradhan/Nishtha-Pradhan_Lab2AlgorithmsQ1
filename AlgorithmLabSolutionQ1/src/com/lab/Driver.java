/**
 * Driver class for Algorithm Lab Q1 
 */
package com.lab;
import java.util.Scanner;

import com.lab.paymoney.PayMoney;

/**
 * @author nishthapradhan
 *
 */
public class Driver {
	public static void main(String args[]) {
		int transac_days, target;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days you want to track:");
		transac_days = sc.nextInt();
		System.out.println();
	
		// Taking transac_days as limit, take transactions in array
		int[] transactions = new int[transac_days];  
		for(int i = 0; i < transac_days; i++) {
			System.out.printf("Please enter transaction "
					+ "amount(in Crores) for day %d: ", i+1);
			transactions[i] = sc.nextInt();
		}
		
		// Take Target amount
		System.out.println("\nEnter your target amount:");
		target = sc.nextInt();
		
		// Find out if target is achieved
		PayMoney pm = new PayMoney();
		int targetTester = pm.daysToAchieveTarget(transactions, target);
		if(targetTester == -1)
			System.out.printf("\nSorry, the target of %d crores transactions "
					+ "was not achieved.", target);
		else
			System.out.printf("\nCongratulations! The target of %d crores transactions "
					+ "was achieved in day %d", target, targetTester);
		
		sc.close();
	
	}

}
