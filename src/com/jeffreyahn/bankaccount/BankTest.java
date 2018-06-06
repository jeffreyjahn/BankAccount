package com.jeffreyahn.bankaccount;

public class BankTest {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount();
		System.out.println(acc1.getAccountNumber());
		System.out.println(acc2.getAccountNumber());
		System.out.println(acc3.getAccountNumber());
		System.out.println(acc1.getAllMembers());
		System.out.println(acc2.getAllMembers());
		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		
		acc1.deposit("checking", 100.00);
		acc1.deposit("checking", 1300.00);
		System.out.println(acc1.getCheckingBalance());
		acc1.deposit("savings", 100.00);
		acc1.deposit("savings", 2100.00);
		System.out.println(acc1.getSavingsBalance());
		System.out.println(acc1.getTotalBalance());
		

		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		
		acc1.withdraw("checking", 20.00);
		System.out.println(acc1.getCheckingBalance());
		acc1.withdraw("savings", 500.00);
		System.out.println(acc1.getSavingsBalance());
		System.out.println(acc1.getTotalBalance());
		

		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		
		acc2.deposit("checking", 100.00);
		acc2.deposit("checking", 1300.00);
		acc2.getCheckingBalance();
		acc2.deposit("savings", 100.00);
		acc2.deposit("savings", 2100.00);
		acc2.getSavingsBalance();
		acc2.getTotalBalance();

		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		
		acc2.withdraw("checking", 20.00);
		System.out.println(acc2.getCheckingBalance());
		acc2.withdraw("savings", 500.00);
		System.out.println(acc2.getSavingsBalance());
		System.out.println(acc2.getTotalBalance());
		

		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		
		acc3.deposit("checking", 23.00);
		acc3.deposit("checking", 141.00);
		acc3.getCheckingBalance();
		acc3.deposit("savings", 2323.00);
		acc3.deposit("savings", 34123.00);
		acc3.getSavingsBalance();
		acc3.getTotalBalance();
		acc3.withdraw("checking", 20.00);
		System.out.println(acc3.getCheckingBalance());
		acc3.withdraw("savings", 500.00);
		System.out.println(acc3.getSavingsBalance());
		System.out.println(acc3.getTotalBalance());
		
		System.out.println(acc1.getTotalMoney());
		System.out.println(acc2.getTotalMoney());
		System.out.println(acc3.getTotalMoney());
		
	}
}
