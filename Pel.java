 
import java.util.*;
class pel
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=""; 
		String [] str1=str.split(" ");
        for(int j=0;j<str1.length;j++)
        { 
        	char []arr=str1[j].toCharArray();
        	//System.out.println(arr); 
		 for(int i=0;i<arr.length/2;i++)
		  {
			if((arr[arr.length-1-i]=='a'||arr[arr.length-1-i]=='e'||arr[arr.length-1-i]=='i'||arr[arr.length-1-i]=='o'||arr[arr.length-1-i]=='u')&&(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'))
			{
                  char c=arr[i];
                  arr[i]=arr[arr.length-1-i];
                  arr[arr.length-1-i]=c;                
 			}
		 }
       	System.out.print(arr);     //rev=rev+arr+" ";
	   }
	 // for(int i=0;i<str1.length;i++)
	  
	  
	  
	}
}