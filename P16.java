import java.util.*;
public class P16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int  i=0;i<n;i++)
			a[i]=sc.nextInt();
		int r=0;
		System.out.println(a[0]);
		for(int i=0;i<n;)
		{
			for(int j=1;j<n;)
			{
				if(a[i]==a[j])
					j++;
				else
				{
				 r=a[j];
				break;
				}
			}
			
			System.out.println(r);
		}
	}

}
