import java.util.*;
public class P10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int b1=sc.nextInt();
		int c=0;
		int e=0;
		while(a!=0)
		{
			int d=a%10;
			e=e+(int)(Math.pow(b1,c))*d;
			c++;
			a=a/10;
		}
		System.out.println(e);

	}

}
