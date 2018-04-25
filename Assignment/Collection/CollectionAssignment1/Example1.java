import java.util.*;
class Example1{
	public static void main(String[] args) {
		int count = 0;
		String[] input = {"raudra","ravi","java","ravula","ravi","ravula"};
		HashSet<String> hs = new HashSet<String>();

		for(String str : input){

			//add method will return boolean if duplicate is added return false
			if(!(hs.add(str))){
                 count++;
                 //print duplicate element
                System.out.println("duplicate element : "+str);
			}
		}
		//print how many duplicate element are present
        System.out.println("No of Duplicate Element Are" + count);

	}
}

//we can use boolean contains(Object o) it will return present or not

//output
// duplicate element : ravi
// duplicate element : ravula

//Time(sec) : 0.08 Memory(MB) : 56.8555