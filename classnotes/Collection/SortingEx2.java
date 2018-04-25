import java.util.*;
class SortingEx2{
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ravi","100"));
		list.add(new Student("babu","200"));
		list.add(new Student("babu","300"));
		Collections.sort(list);
		System.out.println("Sorted list"+list);
	}
	
}
class Student implements Comparable<Student>{
	String name;
	String id;//do with integer
	Student(String name,String id){
		this.name = name;
		this.id = id;
	}
	public String toString(){
		return ("name"+name+" "+"id"+id);
	}
	//to compare integer we create integet wrappper class
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}
	public String getName(){
		return name;
	}
}  