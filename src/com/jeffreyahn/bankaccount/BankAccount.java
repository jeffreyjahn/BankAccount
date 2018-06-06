package com.jeffreyahn.bankaccount;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int members = 0;
	private static double totalMoney = 0;
	private static ArrayList<String> accounts = new ArrayList<String>();
	
	public BankAccount() {
		this.accountNumber = this.accountGenerator();
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		members++;
	}
	
	private String accountGenerator() {
		Random r = new Random();
		String sb = "";
		for(int i = 0; i < 9; i++) {
			sb = sb + r.nextInt(9);
		}
		if (accounts.contains(sb)) {
			return this.accountGenerator();
		} else {
			return sb;
		}
	}
	public int getAllMembers() {
		return members;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getTotalBalance() {
		return this.getSavingsBalance() + this.getCheckingBalance();
	}

	public void deposit(String account, double amount) {
		if (amount < 0 ) {
			System.out.println("what?");
		} else {
			if(account == "checking") {
				double checking = getCheckingBalance();
				totalMoney += amount;
				double newAmount = amount + checking;
				this.setCheckingBalance(newAmount);
				System.out.println("Added $"+ amount + " to my checking!");
				System.out.println("New Balance: $" + getCheckingBalance());
			} else if (account == "savings") {
				double savings = getSavingsBalance();
				totalMoney += amount;
				double newAmount = amount + savings;
				this.setSavingsBalance(newAmount);
				System.out.println("Added $"+ amount + " to my Savings!");
				System.out.println("New Balance: $" + getSavingsBalance());
			} else {
				System.out.println("Choose a valid account.");
			}
		}
	}

	public void withdraw(String account, double amount) {
		if (amount < 0 ) {
			System.out.println("Whatpt2");
		} else {
			if(account == "checking") {
				double checking = getCheckingBalance();
				if(amount < checking) {
					totalMoney -= amount;
					double newAmount = checking - amount;
					System.out.println("Withdrew $"+ amount + " from my checking!");
					this.setCheckingBalance(newAmount);
					System.out.println("New Balance: $" + getCheckingBalance());
				} else {
					System.out.println("Insufficient checking funds");
				}
			} else if (account == "savings") {
				double savings = getSavingsBalance();
				if(amount < savings) {
					totalMoney -= amount;
					double newAmount = savings - amount;
					System.out.println("Withdrew $"+ amount + " from my Savings!");
					this.setSavingsBalance(newAmount);
					System.out.println("New Balance: $" + getSavingsBalance());
				} else {
					System.out.println("Insufficient savings funds");
				}
			} else {
				System.out.println("Choose a valid account.");
			}
		}
	}
	
}
