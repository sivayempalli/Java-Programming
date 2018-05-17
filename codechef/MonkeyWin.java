//

import java.util.*;
import java.io.*;
class MonkeyWin{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("input.txt"));

		//input length
		int len = sc.nextInt();

		//store in array
		int[] arr = new int[len];
		for(int i = 0 ;i < len ; i++){
			arr[i] = sc.nextInt();
		}

		int health = 2000;
		int maxinj = 1000000;
		int max = 0;
		int achivied = 0;

		for(int i = 0 ;i < len ; i++){
			int intialHealth = health;
			int intialInjuries = 1;
			int win = 0;
			for(int j = i ; j < len ; j++){

				if(intialHealth != 0 && intialInjuries < maxinj){
					intialHealth = intialHealth - arr[i];
					intialInjuries = intialInjuries * 3;
					win++;
				}


			}
			//max monkey defeated
            if(max < win){
                	max = win;
            }

            //total position where it deffeat  defeated
            if(intialHealth > 0 ){
            	achivied++;
            }
		}
		System.out.println("Total Monkey defeated"+max);
		System.out.println("Maximum Position" + achivied);
	}
}