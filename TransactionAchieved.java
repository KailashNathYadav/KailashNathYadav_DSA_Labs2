package com.app.paymoney.transaction;

public class TransactionAchieved {
	public void targetAchieved(int[] arr,long target) {
		long sum = 0;
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
			if(sum >= target) {
				System.out.println("Target Achieved at " + (i + 1) + " transaction.\n");
				return;
			}
		}
		System.out.println("Given target is not achieved.");
	}
}
