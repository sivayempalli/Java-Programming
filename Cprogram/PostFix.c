#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
 
#define MAX 5    //Maximum number of elements that can be stored
 
int top=-1;
char stack[MAX];
void push(int);
int pop();
void display();

void push(int val)
{
    
    if(top == MAX-1)
    {
        printf("\nStack is full!!");
    }
    else
    {
        stack[++top]=val;
    }
}

int pop()
{
    if(top == -1)
    {
        printf("\nStack is empty!!");
        return -1;
    }
    else
    {
        return stack[top--];
         
    }
}

/*void display(){
	int i;

	if(top == -1){
		printf("\n Stack is empty");
	}
	else{
		printf("\n Stack is : \n");
		for(int i = 0;i)
	}
}
*/
void main(){
	char exp[] = "6 2 + 5 * 8 4 / -";
    int n = sizeof(exp);
    exp[n+1] = '\0';
    
    int i=0;
    int x,y;
    while(exp[i] != '\0'){
    	if (isdigit(exp[i])){
    		push(exp[i]);
    	}
    	else{
    		
    		switch(exp[i]){
    			case '+' : 
    			            x = pop();
    			            y = pop();
    			            push(y+x);
    			            break;
    			           

    			case '-'  :
    			           	x = pop();
    			            y = pop();
    			            push(y-x);
    			            break;
    			           

    			case '*'  :
                           
    		                x = pop();
    			            y = pop();
    			            push(y*x);
    			            
    			           
    			case '/'  : x = pop();
    			           y = pop();
    			           push(y/x);
    			           break;
    			           
    	    }
        }
    i++;
    }    
    printf("value is : %d",pop());
}
