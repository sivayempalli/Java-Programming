//BINARY SEARCH TREE
import java.util.*;

class Node{
	int data;
	Node(int data){
		this.data = data;
	}
	Node right = null;
	Node left = null; 
}

public class BinarySearchTree{
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter input");
		int n = sc.nextInt();

		BinaryTree bt = new BinaryTree();
		Node pos = bt.insert(n);
		System.out.println(pos.data);
		bt.printTree();
    }
} 


class BinaryTree{
	Scanner sc = new Scanner(System.in);
	Node root = null;

    Node insert(int n){
		 
		 Node current;
        
     System.out.println("logic");
		 for(int i = 0; i < n ; i++){
		 	//System.out.println(i);
			int x = sc.nextInt();
			Node temp = new Node(x);
			if(root == null){
				root = temp;
			}
			else{
				current = root;
				bst(current,temp);
			}
		 }
		 return root;

	  }
		


     void  bst(Node current,Node temp){

    	if(current.data > temp.data ){
           if(current.left == null){
           	current.left = temp;
           	//System.out.println(current.data);
           }
           else{
           	bst(current.left,temp);
           }
        }
    	else{
           if(current.right == null){
           	current.right = temp;
           	//System.out.println(current.data);
           	//System.out.println(current.right.data);
           }
           else{
           	bst(current.right,temp);
           }
    	}
    }

    void printTree(){
    	System.out.println("INORDER TRAVERSAL");
    	inorder(root);
    }

    void inorder(Node current){
      if(current != null){
     	inorder(current.left);
     	System.out.println(current.data);
     	inorder(current.right);
      }


     }
}