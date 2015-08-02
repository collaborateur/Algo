
public class Sort {
public static int[] sorted(int input[])
{int temp;
for(int i=1;i<input.length;i++)
	for(int j=i;j>0;j--)
		if(input[j]<input[j-1])
		{temp=input[j];
		input[j]=input[j-1];
		input[j-1]=temp;
		}
	
return input;
}
	
	public static void main(String[] args) {
		int array[]={7,4,9,13,75,0,1};
		int array1[]=sorted(array);
		for(int i:array1)
		System.out.print(i+"  ");

	}

}
