//creditcard details

class EncapsulationEx1{
	public static void main(String[] args) {
		CreditCard cc = new CreditCard(523);
		cc.setLimit(15000);
		if(cc.buyWithCredit(7000)){
			System.out.println("balance is" + cc.getBalance());
		}
		if(cc.creditSettle(2000)){
			System.out.println("balance is"+" "+cc.getBalance());
		}

	}
}
class CreditCard{
	private int number;
	private double balance;
	private double limit;
	static final double MAX_LIMIT = 20000;
	CreditCard(int number){
		this.number = number;
	}
	public void setLimit(double limit){
		if(limit <= MAX_LIMIT){
			this.limit = limit;
			this.balance = limit;
		}
		else
			System.out.println("System Error");
	}
	public boolean buyWithCredit(double amount){
		if((balance - amount) < 0){
			System.out.println("balance is less");
			return false;
		}
		else{
			balance = balance - amount;
			System.out.println("Transaction complete");
			return true;
		}
	}
	public boolean creditSettle(double amount){
		if (amount < 0){
			System.out.println("error");
			return false;
		}
		else{
			balance = balance + amount;
			return true;
		}
	}
	public double getBalance(){
		return  this.balance;
	}
}