import java.util.*;
class Num{
	int a[]=new int[5];
	int r[]=new int[5];
	Num()
	{
		int a1[]= {};
		a1=a;
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		int a2[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a2[i]=sc.nextInt();
			a[i]=a2[i];
		}
	}
	void reverse()
	{
		 r=new int[5];
		for(int j=0,t=4;j<5;j++,t--)
			r[j]=a[t];
	}
	void get()
	{
		for(int j=0;j<5;j++)
			System.out.println(r[j]);
	}
}
public class P20 {

	public static void main(String[] args) {
		Num n=new Num();
		n.set();
		n.reverse();
		n.get();

	}

}
