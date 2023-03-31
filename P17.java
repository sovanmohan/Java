import java.util.*;
public class P17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n2];
		int c[]=new int[n+n2];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
			System.out.println(c[i]);
		}
		for(int i=n,j=0;i<n2;i++,j++)
		{
			c[i]=b[j];
			System.out.println(c[i]);
		}

	}

}
