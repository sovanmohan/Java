import java.util.*;
public class P14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c;
		int c2=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			c=0;
			for(int k=1;k<=a[j];k++)
			{
				if(a[j]%k==0)
					c++;
			}
			if(c==2)
				c2++;
		}
		System.out.println("Number of prime numbers in an array "+c2);

	}

}
