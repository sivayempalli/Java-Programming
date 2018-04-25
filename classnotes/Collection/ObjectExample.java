class ObjectExample{
	public static void main(String[] args) {
		Student stu = new Student(23,"SIVA");
		System.out.println(stu.toString());//by default object class toString method will create
	}
}
class Student{
	int id;
	String s;
	Student(int id,String s){
		this.id = id;
		this.s = s;
	}
	public String toString(){
		return ("name is :"+s+"id is :"+id);//override toString method
	}
}