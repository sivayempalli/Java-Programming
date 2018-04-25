import java.lang.*;
class EnumEx2{
	public static void main(String[] args) {
	    Fruits arr[] = Fruits.values();
	    for(Fruits fr : arr){
	    	System.out.println(fr+"index at"+fr.ordinal());
	    }
	    Fruits f = Fruits.valueOf("APPlE");
	    System.out.println(f);    	
	}
}
enum Fruits{
	APPLE,
	BANANA,
	CARROT;
}