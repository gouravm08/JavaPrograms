//java program to multiply two matrix
import java.util.*;
class test{ 
	public static void main(String[] args)
	{
		int col1,col2,row1,row2,i,j,k;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first row and coloum ");
		row1=scan.nextInt();
		col1=scan.nextInt();
		int a[][]=new int[row1][col1];
       System.out.println("enter second row and coloum ");
		row2=scan.nextInt();
		col2=scan.nextInt();
		int b[][]=new int [row2][col2];
		System.out.println("enter element of first matrix");
		for( i=0;i<row1;i++)
		 { for(j=0;j<col1;j++)
			a[i][j]=scan.nextInt();
		}
		System.out.println("enter element of second matrix");
	    for( i=0;i<row2;i++){
		  for(j=0;j<col2;j++)
			b[i][j]=scan.nextInt();}
		int c[][]=new int [row1][col1];
		if(row1!=col2)
			System.out.println("Multiplication is not possible");
		else{   
			for( i=0;i<row1;i++)
			{   
				for( j=0;j<row2;j++)
				{  c[i][j]=0;
                    for( k=0;k<col2;k++)
                    	c[i][j]+=a[i][k]*b[k][j];
				}
			}
		for( i=0;i<row1;i++){
		 for( j=0;j<col1;j++)
		  System.out.print(" "+c[i][j]);
             System.out.println();
		  }	
		}
	}
}