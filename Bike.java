import java.util.*;
class Bike
{
public static void main(String args[]){
//  Scanner sc=new Scanner(System.in);
    //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
   
        //Thread.currentThread().setName("Gourav");     
    Set a=new HashSet();
    a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
    Set b=new HashSet();
    b.addAll(Arrays.asList(new Integer[]{1,0,5,7,3,6,5,2,9,4}));
      System.out.println(a); 
    System.out.println(b);
   //  SortedSet s=new TreeSet(a);
   //union  means=elements of a and b both without duplicates
    Set s=new HashSet(a);
    s.addAll(b);
   System.out.println(s);
   Set inter=new HashSet(a);
   s. retainAll(b);
   //a.remove(50);
  System.out.println(s);

	}
}
