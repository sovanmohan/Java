import java.util.*;
public class F {
	int fact(int x)
	{
		if(x==1||x==0)
			return 1;
		else
		{
			System.out.println(x*fact(x-1));
			return x*fact(x-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		F f=new F();
		int x=sc.nextInt();
		int r=f.fact(x);
		System.out.println("Factorial of a number "+r);

	}

}
