#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t;
	cin>>t;
	while(t--)
	{
	  long long int n,a[10000],b[10000];
	  memset(b,0,sizeof(b));
	  cin >> n ;
	  long long int i,sum=0,max;
	  for(i=0;i<n;i++)
	  {
	      cin>>a[i];
	      b[a[i]]++;
	  }
	 long long int k=1;
	  for(i=21;i>=0;i--)
	  {
	      if(b[i]>0 && k==1)
	      {
	        max=i;
	        sum=sum+i*b[i];
	        k=0;
	      }
	      else if(b[i]>0 && i==max-1)
	      {
	          sum=sum+i*(b[i]-1) ;
	          if(b[i]==1)
	            continue;
	           else
	             continue;
	          //cout << i <<endl;
	      }
	      else if(b[i]>0 && i!=max-1)
	      {
	          sum=sum+i*(b[i]);
	          max=i;
	      }
	     else
	     continue ;
	  }
	  cout<<sum<<endl;
	}
	return 0;
}