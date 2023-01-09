package com.app.paymoney.main;
import java.util.*;
import com.app.paymoney.transaction.TransactionAchieved;

public class MainPayMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of array");
		for(int i = 0; i < n; i ++)
			arr[i] = sc.nextInt();
		
		TransactionAchieved tarAch = new TransactionAchieved();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTarget = sc.nextInt();
		for(int i = 0; i < totalTarget; i ++) {
			System.out.println("Enter the value of target");
			Long target = sc.nextLong();
			tarAch.targetAchieved(arr,target);
		}
		sc.close();
	}
}
