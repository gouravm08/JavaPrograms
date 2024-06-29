//java program to find occuurence of a number (hard code)
class Name{
public static void main(String args[])
{ int a0=0,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,d,n=77230;
System.out.println();
while(n>0)
{
d=n%10;
n/=10;
if(d==0) a0++;
else if(d==1) a1++;
else if(d==2) a2++;
else if(d==3) a3++;
else if(d==4) a4++;
else if(d==5) a5++;
else if(d==6) a6++;
else if(d==7) a7++;
else if(d==8) a8++;
else if(d==9) a9++;
}
System.out.println("0"+" "+ a0);
System.out.println("1"+" "+ a1);
System.out.println("2"+" "+ a2);
System.out.println("3"+" "+ a3);
System.out.println("4"+" "+ a4);
System.out.println("5"+" "+ a5);
System.out.println("6"+" "+ a6);
System.out.println("7"+" "+ a7);
System.out.println("8"+" "+ a8);
System.out.println("9"+" "+ a9);
}
}