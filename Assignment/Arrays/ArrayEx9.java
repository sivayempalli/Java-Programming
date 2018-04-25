//Q)Can you change size of array once created?
//so)
//no we cannot change th array size
class ArrayEx9{
	public static void main(String[] args) {
		int[] arr = new int[4];
		System.out.println(arr.length);
        //arr.length = arr.length + 4;
        arr[5] = 40;
        System.out.println(arr[5]);
	}
}

//output:

//ArrayEx9.java:8: error: cannot assign a value to final variable length
//        arr.length = arr.length + 4;
//1 error
