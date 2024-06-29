import java.util.*;
public class ArrayDemo extends ArrayList
{
	public static void main(String[] args) {
		ArrayDemo al=new ArrayDemo();
		al.add(10);
		al.add(20);
		al.add(30);		
        al.add(45);
        al.add(32);
        al.add(442);
        al.add(41);
        System.out.println(al);
        al.removeRange(2,4);
        int i=0;
    for(i=0;i<al.size();i++)
    {
    System.out.println(al.get(i));	
    }
      //  al.clear();
     // System.out.println(al.get(i-1)); 
	}
}