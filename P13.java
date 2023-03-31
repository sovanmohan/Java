import java.util.*;
public class P13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		int q=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(a[j]==a[k])
					c++;
			}
			if(c>=1)
			{
				System.out.println("The frequency of "+q+"th index is "+c);
				q++;
				c=0;
			}
		}

	}

}
