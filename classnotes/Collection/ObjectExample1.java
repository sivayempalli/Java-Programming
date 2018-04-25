class ObjectExample1{
	public static void main(String[] args) {
		Student s1 = new Student("1","ravi");
		Student s2 = new Student("1","ravi");
		if (s1 == s2){
			System.out.println("Strings are equal");
		}
		if (s1.equals(s2)){
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}
}
class Student{
	String id;
	String s;
	Student(String id,String s){
		this.id = id;
		this.s = s;
	}
	public boolean equals(Object m){
		if (m instanceof Student){
			return (id.equals(((Student)m).id) && s.equals(((Student)m).s));
		}
	return false;
	}
}