class Account 
{
private int accno; 
private float balance;
void setAccount(int x,float y)
{
accno = x;
balance = y;
}
void withdraw(float tamt)
{
balance = balance - tamt;
}
void printAccount()
{
System.out.println(accno);
System.out.println(balance);
System.out.println(this);
}
}


class Demo7
{
public static void main(String args[])
{
Account obj1 = new Account();
obj1.setAccount(23,1000f);
obj1.withdraw(500f);
obj1.printAccount();
}
}