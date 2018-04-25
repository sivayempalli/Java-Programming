 import java.util.*;
class Book implements Comparable<Book>{
	private int id;
	private String title;
	Book(int id,String title){
		this.id = id;
		this.title = title;
	}
	public int hashcode(){
		return id;
	}
	public int compareTo(Book another){
		return this.title.compareTo(another.title);
	}
	public boolean equals(Object o){
		if(!(o instanceof Book)){
			return false;
		}
		return this.id == ((Book)o).id;
		//return title.equals(((Book)o).title);
	}
	public String toString(){
		return title;
	}
}
public class HashSetTest{
	public static void main(String[] args) {
		Set<Book> bookSet = new HashSet<Book>();
		bookSet.add(new Book(1,"A"));//return boolean value
		bookSet.add(new Book(4,"B"));
		bookSet.add(new Book(2,"C"));
		bookSet.add(new Book(3,"D"));
		bookSet.add(null);
		bookSet.add(new Book(4,"E"));
		bookSet.remove(new Book(2,"C"));
		System.out.println(bookSet);
	}
}