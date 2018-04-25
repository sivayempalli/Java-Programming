#include<stdio.h>
//ctype is used to know isdigit() method
#include<ctype.h>

int stack[20];
int top = -1;
 
void push(int x)
{
        stack[++top] = x;
}
 
int pop()
{
        return stack[top--];
}
 
void main()
{
        char exp[] = "62+5*84/-";
        char *e;
        int n1,n2,n3,num;

        e = exp;
        while(*e != '\0')
        {
                if(isdigit(*e))
                {
                        num = *e - 48; //coverting char to int
                        push(num);
                }
                else
                {
                        n1 = pop();
                        n2 = pop();
                        switch(*e)
                        {
                                case '+':
                                {
                                        n3 = n1 + n2;
                                        break;
                                }
                                case '-':
                                {
                                        n3 = n2 - n1;
                                        break;
                                }
                                case '*':
                                {
                                        n3 = n1 * n2;
                                        break;
                                }
                                case '/':
                                {
                                        n3 = n2 / n1;
                                        break;
                                }
                        }
                        push(n3);
                }
                e++;
        }
        printf("The result of expression %s = %d",exp,pop());
 
}