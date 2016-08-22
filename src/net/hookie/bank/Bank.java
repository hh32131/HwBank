package net.hookie.bank;

public class Bank {
	
	String accountNumber = "";
	String client ="";
	String setUpDate = "";
	int money = 0;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getSetUpDate() {
		return setUpDate;
	}
	public void setSetUpDate(String setUpDate) {
		this.setUpDate = setUpDate;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void deposit(int depositMoney){
	
		this. money= money + depositMoney;
	}
	
	public void withdraw(int withdrawMoney){
		
		this. money = money - withdrawMoney;
		
		
	}
	
	public void showMyBalance(){
		
		System.out.println("[계좌번호 :" + accountNumber + ", 예금주 :" + client + "] 잔액 : " + money);
	}
	

}
