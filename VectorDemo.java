import java.util.*;
class VectorDemo
{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(10);
		v.addElement(11);
		v.addElement(12);
		v.addElement(13);
		v.addElement(14);
		ListIterator itr=v.listiterator();
	//	while(e.hasNext())
           //  {
             	Integer a=(Integer)itr.next();
             	System.out.println(itr.hasPrevious());
             	
             	System.out.println(a);
             //}
		System.out.println(v);

	}
}