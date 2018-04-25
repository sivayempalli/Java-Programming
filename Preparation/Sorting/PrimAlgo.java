class PrimAlgo{

    static int minCost(int[][] arr,int size){
    	int min = 99;
    	for(int i = 0;i < size ; i++){
    		for(int j = 0 ; j< size ;j++){
    			if(min > arr[i][j]){
    				min = arr[i][j];
    			}
    		}
    	}
    	return min;
    } 

    static void minSpan(int[][] arr,int size){
    	//int cost = minCost(arr,size);
         //minimum cost
    	int l =0,k = 0;
    	int min = 99;
    	for(int i = 0;i < size ; i++){
    		for(int j = 0 ; j< size ;j++){
    			if(min > arr[i][j]){
    				min = arr[i][j];
    				k = i;
    				l = j;
    			}
    		}
    	}



        //creating array by edges
        //edge are vertex-1
    	int[][] t = new int[size-1][2];

    	t[0][0] = k;
    	t[0][1] = l;

        //mincost
        int mincost = 0;
        mincost = mincost + min;

        //near Array size is Vertex
        int[] near = new int[size];

        for(int i = 0 ; i < size ; i++){
        	if(arr[i][k] < arr[i][l]){
        		near[i] = k;
        	}
        	else{
        		near[i] = l;
        	}
        }
        near[k] = -1;
        near[l] = -1;

        //logic
        for(int i = 1 ; i < size-1 ; i++){
        	int minsub ;
        	int m = 0;

        	//want index of near
        	//minsub = arr[0][near[0]];
        	minsub = 99;
        	for(int j = 1 ;j < size ;j++){
        		 
        		if(near[j] != -1 && minsub > arr[j][near[j]]){
                    minsub = arr[j][near[j]];
                    m = j;
        		}
        	}

        	mincost = mincost + arr[m][near[m]];
        	t[i][0] = m;
        	t[i][1] = near[m];
        	near[m] = -1;//what was the mistake is we are using zero index also 

        	for(int p = 0 ; p < size ; p++){
        		if(near[p] != -1 && arr[p][near[p]] > arr[p][m]){
        			near[p] = m;
                    
        		}
        	}
        }
        System.out.println(mincost);
        for(int i = 0 ;i < (size-1) ; i++){
        	System.out.println(t[i][0] +" "+ t[i][1]);
        }
    }

	public static void main(String[] args) {
		int vertex  = 7;
		int[][] arr = {{99,28,99,99,99,10,99},
		                {28,99,16,99,99,99,14},
		                 {99,16,99,12,99,99,99},
		                  {99,99,12,99,22,99,18},
		                   {99,99,99,22,99,25,24},
		                    {10,99,99,99,25,99,99},
		                     {99,14,99,18,29,99,99}};

	    //check representation correct or wrong	
	    //System.out.println(arr[2][1]);
	    //size not working
	   //System.out.println(arr[0].size);               

        //find min cost
        //int min = minCost(arr,vertex);
        //System.out.println(min);
        minSpan(arr,vertex);

	}
}