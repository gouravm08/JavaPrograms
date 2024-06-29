import java.lang.reflect.*;
class Student
{
 
}
class Test
{
    public static void main(String[] args) throws Exception {
      Class c=Class.forName("java.lang.String");
      int c1=0;
      Method[] m=c.getDeclaredMethods();
  for(Method m1: m)
 {
    c1++;
  System.out.println(m1.getName());
 }
  System.out.println(c1); 
    }
    
}