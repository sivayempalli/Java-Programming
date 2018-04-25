import java.lang.*;
class EnumEx1{
	CoffeeSize size;
	public static void main(String[] args) {
		EnumEx1 drink1 = new EnumEx1();
		drink1.size = CoffeeSize.BIG;
		EnumEx1 drink2 = new EnumEx1();
		drink2.size = CoffeeSize.HUGE;
		System.out.println(drink1.size.getOunces());
		System.out.println(drink2.size.getOunces());
	}
}
enum CoffeeSize{
	BIG(10),HUGE(20),OVERWHELMING(30);
	CoffeeSize(int ounces){
		this.ounces = ounces;
	}
	private int ounces;
	public int getOunces(){
		return ounces;
	}
}