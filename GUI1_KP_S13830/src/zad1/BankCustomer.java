package zad1;

public class BankCustomer {
	private Person person1;
	private Account account1;
	public BankCustomer(Person person1){
		this.person1=person1;
		account1 = new Account();
		}

	public Account getAccount(){
		return account1;
		}

	public String toString(){
		return "Stan konta klienta "+ person1.getImie()+ " "+ account1.getbalance();
		}
}

