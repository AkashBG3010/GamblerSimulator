package com.bridgelabz;

public class gamblerSimulator {

	public static void main(String[] args) {
			int totalStake = 100;
			int betPerGame = 1;
			
			if (Math.random() < 0.5){
				totalStake++;
			System.out.println("Gambler Won and his total Stake will be: " + totalStake);
			}
			else {
				totalStake--;
			System.out.println("Gambler Lost and his total Stake will be: " +totalStake);
			}
		}
	}