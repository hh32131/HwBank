package net.hookie.bank;

import java.util.Scanner;

public class Client {
	private final int deposit = 1;
	private final int withdraw = 2;
	
	public void bank() {
		Scanner input = new Scanner(System.in);
		System.out.println("안녕하세요 국민은행 입니다");
		System.out.println("예금주 명을 입력하세요");
		String name = input.next();
		System.out.println(name);
		

		System.out.println("계좌번호를 입력하세요(예: 835-00-04-214-506)");
		String accountNum = input.next();
		System.out.println(accountNum);
	

		System.out.println("개설일자를 입력하세요(예: 1990-08-07)");
		String setUpDate = input.next();
		System.out.println(setUpDate);
		

		System.out.println("입금금액을 입력하세요");
		int deposit = input.nextInt();
		System.out.println(deposit);
	

		System.out.println("계좌가 생성되었습니다");
		Bank bank = new Bank();
		bank.setClient(name);
		bank.setAccountNumber(accountNum);
		bank.setSetUpDate(setUpDate);
		bank.setMoney(deposit);
		bank.showMyBalance();
		

		

		
		int withdrawMoney;
		int depositMoney;

		while (true) {

			System.out.println("업무를 선택하세요");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			int selectedMenu = input.nextInt();

			if (selectedMenu == 1) {
				System.out.println("입금할 금액을 입력해주세요");
				depositMoney = input.nextInt();
				bank.deposit(depositMoney);
				System.out.println(depositMoney + "원이 입금되었습니다");
				bank.showMyBalance();
				//System.out.println("[계좌번호 :" + accountNum + ", 예금주 :" + name + "] 잔액 : " + resultMoney);
				
			} else if (selectedMenu == 2) {
				while (true) {

					System.out.println("출금할 금액을 입력해주세요");
					withdrawMoney = input.nextInt();
					if (withdrawMoney <= bank.getMoney()) {
						bank.withdraw(withdrawMoney);
						System.out.println(withdrawMoney + "원이 출금 되었습니다");
						bank.showMyBalance();
						//System.out.println("[계좌번호 :" + accountNum + ", 예금주 :" + name + "] 잔액 : " + resultMoney);
						
						break;
					} else {
						System.out.println("잔액이 모자랍니다. 출금할 수 없습니다");
					}
				}
			} else if (selectedMenu == 3) {
				break;
			} else {
				System.out.println("잘못선택하셨습니다");
				System.out.println("");
			}
		}

	}

	public static void main(String[] args) {

		new Client().bank();
	}
}
