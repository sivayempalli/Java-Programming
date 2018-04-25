class Thread1 extends Thread{
    
    //override thread method
    public void run(){
	  for (int i=0;i < 5 ;i++ ) {
		System.out.println(i);
	  }
	}
}

class Thread2 extends Thread{

	public void run(){
	  for(int i = 5;i < 10;i++){
		System.out.println(i);
	  }
	}
}


class ThreadEx1{
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();
		Thread t2 = new Thread2();
		t2.start();
	    	
	}
}