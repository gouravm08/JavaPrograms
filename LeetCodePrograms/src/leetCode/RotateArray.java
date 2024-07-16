package leetCode;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		int d=2;
		rotateOptimize(arr, d);

	}
	
	public static void rotate(int[] arr, int k) {
		int j=0;
		for(int i=0;i<k;i++)
		{
			int t=arr[0];
			for( j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=t;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	private static void rotateOptimize(int[] arr,int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr,0, arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void reverse(int[] arr,int i,int j) {
		while(i<=j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
}

