import java.util.*;
public class R {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int p=sc.nextInt();
		int c=0;
		int k;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
			{
				if(c<=p)
				{
					if(a[j]<a[j+1])
					{
						k=a[j];
						a[j]=a[j+1];
						a[j+1]=k;
					}
				}
				else
				{
					if(a[j]>a[j+1])
					{
						k=a[j];
						a[j]=a[j+1];
						a[j+1]=k;
					}
				}
				c++;
			}
		for(int w=0;w<n;w++)
			System.out.println(a[w]);
		
		
				

	}

}
