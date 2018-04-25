import java.util.*;
class SearchingEx1{
	public static void main(String[] args) {
		String[] sample = {"ab","bc","cd"};//how arrays works
		Arrays.sort(sample);
		for(String str : sample){
			System.out.println(str);
		}
		System.out.println("search"+Arrays.binarySearch(sample,"bc"));
	}
}
