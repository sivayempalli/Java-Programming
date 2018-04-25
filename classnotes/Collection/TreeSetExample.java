 import java.util.*;
class TreeSetExample{
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<Book>();//here we send comparator also
		Book b1 = new Book(1,"java");
		Book b2 = new Book(2,"programmimg");
		Book b3 = new Book(3,"learning");
		set.add(b1);
		set.add(b2);
		set.add(b3);
		System.out.println(set.floor(b2));
		System.out.println(set.lower(b2));
	}
}