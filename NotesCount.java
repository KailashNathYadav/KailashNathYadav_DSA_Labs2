package com.app.currencydenomination.services;

public class NotesCount {
	public void notesCnt(int[] notes,int amount) {
		int n = notes.length;
		int[] count = new int[n];
		for(int i = 0; i < n; i ++) {
			int numberOfNotes = amount / notes[i];
			if(numberOfNotes == 0 && amount != 0) {
				System.out.println("You cannot make payment using higher denominations");
				return;
			}
			amount -= notes[i]*numberOfNotes;
			count[i] = numberOfNotes;
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i = 0; i < n; i ++) {
			if(count[i] != 0)
				System.out.println(notes[i] + ":" + count[i]);
		}
	}
}