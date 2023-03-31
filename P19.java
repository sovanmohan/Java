import java.util.*;
class Student{
	String n;
	int rn;
	int a;
	int e[]= new int[100];
	String w[]=new String[100];
	int q[]= new int[100];
	Student()
	{
		String name=n;
		int roll=rn;
		int age=a;
	}
	void set(int d)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int r1=sc.nextInt();
		int a1=sc.nextInt();
		n=s1;
		rn=r1;
		a=a1;
		e[d]=rn;
		w[d]=n;
		q[d]=a;
		
	}
	void get()
	{
		for(int i=0;i<e.length;i++)
			for(int j=0;j<e.length;j++ )
			{
				if(e[j]>e[j+1])
				{
					int k=e[j];String k1=w[j];int k2=q[j];
					e[j]=e[j+1];w[j]=w[j+1];q[j]=q[j+1];
					e[j+1]=e[j];w[j+1]=w[j];q[j+1]=q[j];
				}
					
			}
		for(int y=0;y<e.length;y++)
			System.out.println(w[y]+" "+e[y]+" "+q[y]);
	}
}
public class P19 {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		int r=0;
		int d=0;
		while(c!="n")
		{
			s.set(d);
			c=sc.next();
			d++;
			
		}
		s.get();

	}

}
