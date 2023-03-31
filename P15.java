import java.util.*;
public class P15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int p[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int j=0;
		for(int k=0;k<n;k++)
		{
			if((k!=0))
			{
				p[k]=a[j];
				j++;
			}
			else
			{
				p[k]=a[n-1];
			}
			
		}
		for(int u=0;u<n;u++)
			System.out.println(p[u]);

	}

}
