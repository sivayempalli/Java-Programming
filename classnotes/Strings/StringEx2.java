import java.lang.String;
class StringEx2{
	public static void main(String[] args) {
		String str = "RaviBabu";
		char s;
		int i = 0; 
		int count = 0;
		while ((s = (str.charAt(i))) != '\u0000'){
			if ( s == 'a' || s == 'e'|| s == 'i'|| s == 'o'|| s == 'u'){
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}