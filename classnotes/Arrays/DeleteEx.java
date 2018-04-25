class DeleteEx{

	//deleteNode method
	public static char[] deleteNode(char[] name,int index){
		if(index >= 0 && index < name.length){
			char[] temp = new char[name.length - 1];
			System.arraycopy(name,0,temp,0,index);
			System.arraycopy(name,index + 1,temp,index,name.length - index -1);
			return temp;
		}
		else 
			return name;
	}

	public static void main(String[] args) {
		char[] name  = {'R','A','V','u','U','L','A'};

		//deleting index 3
		name = deleteNode(name,3);
		for (char c : name){
			System.out.println(c);
		}
	}
}