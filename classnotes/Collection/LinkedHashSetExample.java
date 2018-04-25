import java.util.*;
public class LinkedHashSetExample{
	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<Book>();
		set.add(new Book(1,"java"));
		set.add(new Book(2,"programming"));
		set.add(new Book(3,"learning"));
		System.out.println(set);
	}
}