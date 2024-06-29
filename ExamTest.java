import java.util.*;
class ExamTest
{
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
      // HashMap<Integer,Boolean> m = new HashMap<>();
       //ArrayList<Integer> a = new ArrayList<>();
       int arr[]=new int[N];
       for(int i=0;i<N;i++)
          arr[i] = sc.nextInt();
       int sum = 0;
       for(int i=0; i<N;i++)
       {
       	for(int j=i+1;j<N;j++)
              {
              	if(arr[i]==arr[j])
              	{
              		arr[j]=arr[j-1]+1;
              	}
              }
           sum = sum + arr[i];
       }
       System.out.print(sum);
}
}