class Account{
int acc_no;
String name;
float amount;
void insert(int acno,String fname,float amt)
{
amount=amt;
name=fname;
acc_no=acno;
}
void deposit(int amt)
{
amount+=amt;
System.out.println("dosited amount is "+ amt);
}
void withdraw(int amt)
{
if(amt>amount)
System.out.println("Insufficient balance");
else
{amount-=amt;
System.out.println(amt+"withdrawal");}
}
void check()
{
System.out.println("balance is=  "+amount);
}
void display()
{
System.out.println(name+"  "+acc_no+"  "+amount);
}
}
class Testaccount{
public static void main(String args[])
{ 
Account a=new Account();
a.insert(10012,"gourav",10000);
a.display(); 
a.deposit(40);
a.check();
a.withdraw(1000);
a.display(); 
a.check();
}
}