import java.util.Arrays;
class MergeEx1{
	public static void main(String[] args) {
		int[] arr = {1,7,5,4,3};
		Arrays.sort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}
}