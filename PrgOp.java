import java.io.*;
class PrgOp
{
  public static void check(File f)
  {
    String s[]=f.list();
   for(int i=0;i<s.length;i++) 
     {    
         File f1=new File(f,s[i]);
          if(f1.isFile())
             {  
              System.out.println(s[i]);       
             }   
            else
            {
              try{
              check(f1);  
               }
            catch(Exception e)
            {
              System.out.println(e.getMessage());
            }
          }
     }
  }
 public static void main(String[]args)  
 {
    File f=new File("D://");
      check(f); 
     
    }
}