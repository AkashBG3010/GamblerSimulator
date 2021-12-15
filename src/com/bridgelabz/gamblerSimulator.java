package com.bridgelabz;

import java.util.Scanner;

public class gamblerSimulator {

	static int totalStake = 100;
	static int betPerGame = 1;
	static int totalWon = 1;
	static int totalLoss = 0;
	static int finalStakeAvailable = 0;

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
				if (gamePlay == 1) {
					System.out.println("Gambler Won");
				}
				else {
					System.out.println("Gambler Lost");
				}
			}
			if (cash == 150 || cash == 50) {
				System.out.println("Player Quits!");
			}
				finalStakeAvailable = finalStakeAvailable + cash;
		}
		System.out.println("Total Stake remaining with Gambler after 20 days is: "+finalStakeAvailable+" $");
	}
}