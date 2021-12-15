package com.bridgelabz;

import java.util.Scanner;

public class gamblerSimulator {

	static int totalStake = 100;
	static int betPerGame = 1;
	static int totalWon = 1;
	static int totalLoss = 0;
	static int finalStakeAvailable = 0;
	static int monthlyDifference = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 20; i++) {
			int cash = totalStake;
			while (cash > 50 && cash < 150) {
				int gamePlay = (Math.random() <= 0.5) ? 1 : 2;
				switch(gamePlay) {
					case 1:
						cash = cash + betPerGame;
						break;
					case 2:
						cash = cash - betPerGame;
						break;
				}
			}
			if (cash == 150 || cash == 50) {
				System.out.println("Player Quits!");
			}
			if (cash > 100) {
				int wonInADay = cash - finalStakeAvailable;
				System.out.println("Player Won on "+i+" day is: $" + wonInADay);
			}
			if (cash < 100) {
				int lostInADay = cash - finalStakeAvailable;
				System.out.println("Player Lost on "+i+" day is: $" + lostInADay);
			}
			finalStakeAvailable = finalStakeAvailable + cash;
		}
		System.out.println("Total Stake remaining with Gambler after 20 days is: "+finalStakeAvailable+" $");
		monthlyDifference = finalStakeAvailable - totalStake * 20;
		
		if(monthlyDifference > 0) {
			System.out.println("Total gain of gambler is : "+monthlyDifference+"$");
		}
		else {
			System.out.println("Total Loss of gambler is : "+monthlyDifference+"$");
		}
	}
}