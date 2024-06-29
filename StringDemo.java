class StringDemo
{
	public static void main(String[] args) {
		String str="Gemsessence Family";
		int a[]=new int[20];
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{     a[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{   a[i]++;
                     arr[j]='0';
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' '&&arr[i]!='0'&&(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')&&a[i]==1)
				System.out.println(arr[i]+" ");
		}
	}
}