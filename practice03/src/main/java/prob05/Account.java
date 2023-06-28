package prob05;

public class Account {
	private String accountNO;
	private int balance;
	
	
	public Account(String accountNO) {
		this.accountNO = accountNO;
		System.out.println(accountNO + "계좌가 개설되었습니다.");
	}
	public String getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save(int money) {
		this.balance += money;
		System.out.println(accountNO + "계좌에 "+money+"만원이 입금되었습니다.");
	}
	public void deposit(int money) {
		this.balance -= money;
		System.out.println(accountNO + "계좌에 "+money+"만원이 출금되었습니다.");
		
	}
}
