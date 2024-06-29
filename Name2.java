class Name{
int i=10;
static int j=330;
Name()
{
System.out.println("constructor");
}
static{
 System.out.println("static block");
}
{
 System.out.println("non static block");
}
static void m()
{
 System.out.println("static method");
}
void m1()
{
 System.out.println("non static method");
}

 public static void main(String[] args)
{
  Name m=new Name();
System.out.println("main");
m();
m.m1();
 System.out.println(m.i);
System.out.println(j);
}
}