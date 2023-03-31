import java.util.*;
public class P12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int d=n;
		int a=n;
		int c=0;
		int q=0;
		while(n!=0)
		{
			int r=n%10;
			while(d!=0)
			{
				int w=d%10;
				if(r==w)
					c++;
				d=d/10;
			}
			
			if(c>=1)
			{
				q++;
				System.out.println("The frequency of "+" "+q+"th digit is "+c);
			}
			c=0;
			n=n/10;
			d=a;
		}

	}

}
