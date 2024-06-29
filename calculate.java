class Calculate{
void fact(int num)
{
int fact=1;
for(int i=num;i>0;i--)
fact*=i;
System.out.println("factorial="+fact);
}
}
class Cal{
public static void main(String args[])
{

new Calculate().fact(6);
}
}