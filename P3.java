import java.util.*;
public class P3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[64];
		int n=sc.nextInt();
		int s=0;
		for(int e=0;e<64;e++)
		{
	            int k = n >> e;
	            if ((k & 1) > 0)
	            {
	                a[e]=k;
	            }
	            else
	            {
	                a[e]=k;
	            }
		}
		int i=sc.nextInt();
		int j=sc.nextInt();
		if(i<64 && j<64)
		{
			int k=a[i];
			a[i]=a[j];
			a[j]=k;
			
		}
		for(int r=0;r<64;r++)
		{
			s=s+((int)Math.pow(2, r)*a[r]);
		}
		System.out.println(s);
			

	}

}
