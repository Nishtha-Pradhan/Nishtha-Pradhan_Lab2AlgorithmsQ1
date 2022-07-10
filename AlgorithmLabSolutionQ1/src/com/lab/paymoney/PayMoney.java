/**
 * 
 */
package com.lab.paymoney;


/**
 * @author nishthapradhan
 *
 */
public class PayMoney {
	
	public int daysToAchieveTarget(int[] transactions, int target) {
		
		for (int i = 0; i < transactions.length; i++) {
			if( transactions[i] == target || target < transactions[i]) 
				return i+1;
			
			else
				target = target - transactions[i];
		}
		
		return -1;
		
	}

}
