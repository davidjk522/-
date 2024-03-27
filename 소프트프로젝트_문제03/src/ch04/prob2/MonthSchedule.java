package ch04.prob2;

import java.util.Scanner;

public class MonthSchedule {
	int totalDate;
	Day[] dayarr;
	Scanner scanner = new Scanner(System.in);
	
	MonthSchedule(int totalDate) {
		// To do
		dayarr = new Day[totalDate];
		for(int i=0; i<totalDate; i++)
		{
			dayarr[i]= new Day();
		}
	}
	
	void input() {
		// To do
		System.out.println("Date(1-30)? ");
		int x;
		x=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Do list(without space)? ");
		String y;
		y=scanner.nextLine();
		
		dayarr[x-1].set(y);
	}
	
	void view() {
		// To do
		System.out.println("Date(1-30)? ");
		int x;
		x=scanner.nextInt();
		dayarr[x-1].show();
		System.out.println("");
		
	}
	
	void finish() {
		// To do
		System.out.println("This is the end of the program");
	}
	
	void run() {
		System.out.println("This is a schedule management program for this month.");
		int command;
		while(true) {
			System.out.println("Command(Insert: 1, Show: 2, Quit: 3 >> ");
			command = scanner.nextInt();
			switch(command) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			default:
				System.out.println("Wrong input");
				break;
			}
		}
	}
}
