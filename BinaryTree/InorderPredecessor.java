//INORDER PREDECESSOR
import java.util.*;
class InorderPredecessor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BinaryTree bt = new BinaryTree();
		PrintPrecedessor pp = new PrintPrecedessor();

		//enter input
		int n = sc.nextInt();
		Node root = bt.insert(n);
		System.out.println(root.data);
		bt.printTree();

		//enter which element u want to find precedessor
        int element = sc.nextInt();
		pp.precedessor(element,root);

	}
}
class PrintPrecedessor{

	void precedessor(int element , Node root){
       Node current = root;
       boolean bool = true;

       while(current.data != element && bool){ // here we can use exception handling
       	  if(current.data < element){
       	  	if(current.right != null){
       	  	  current = current.right;
       	  	}
       	  	else{
       	  		bool = false;
       	  	}
       	  }
       	  else{
       	  	current = current.left;
       	  }
       }

       if(!(bool)){
       	System.out.println("element is not present");
       }
       else{
       	System.out.println("InorderPredecessor is : ");
        if(current.left != null){
       		current = current.left;
       		while(current.right != null){
       			current = current.right;
       		}
       		System.out.println(current.data);
       	}
       	else{
       		Node start = root;
       		Node store = null;
       		while(start.data != current.data  && start != null){
       			if(current.data > start.data){
       				store = start;
       				start = start.right;
       			}
       			else{
       				start = start.left;
       			}
       		}
       		if(store != null){
       		  System.out.println(store.data);
       		}
       		else{
       			System.out.println("smallest element doesnot contain inorderpredecessor");
       		}
       	}
       }
	}
}