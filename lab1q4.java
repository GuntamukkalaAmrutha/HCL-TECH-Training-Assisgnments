import java.util.Arrays;
public class lab1q4 {
public static void ain(String[]args)
{
	int a[]= {1,2,3,4,5};
	System.out.println("The original Array is...");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+ " ");
	}
	System.out.println();
	int b[]=copyOf(a);
	System.out.println("The copy of oroginal Array is:....");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]+ " ");
	}
}
public static int[] copyOf(int[]array)
{
	int b[]=Arrays.copyOf(array,array.length);
	return b;
}
}
