package com.app.currencydenomination.main;
import com.app.currencydenomination.services.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations"); 
		int n = sc.nextInt();
		System.out.println("Enter the currency denominations values");
		int[] notes = new int[n];
		for(int i = 0; i < n; i ++)
			notes[i] = sc.nextInt();
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		mergeSort.sort(notes,0,n-1);
		notesCount.notesCnt(notes,amount);
	}
}
