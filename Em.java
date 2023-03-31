import java.util.*;
public class Em {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id[]=new int[6];
		 String n[]=new String[6];
		int d[]=new int[6];
		for(int i=0;i<6;i++)
		{
			System.out.println("Id");
			id[i]=sc.nextInt();
			System.out.println("Name");
			n[i]=sc.next();
			System.out.println("Login date");
			d[i]=sc.nextInt();
		}
		
		
		System.out.println("Id");
		for(int j=0;j<6;j++)
			System.out.println(id[j]);
		System.out.println("Name");
		for(int j=0;j<6;j++)
			System.out.println(n[j]);
		System.out.println("Login Date");
		for(int j=0;j<6;j++)
			System.out.println(d[j]);
		for(int w=0;w<5;w++)
			for(int y=0;y<(5-w);y++)
				if(d[y]>d[y+1])
				{
					int k=d[y];
					d[y]=d[y+1];
					d[y+1]=k;
					int r=id[y];
					id[y]=id[y+1];
					id[y+1]=r;
				}
		/**System.out.println("Id");
		for(int i=0;i<6;i++)
			System.out.println(id[i]);
		System.out.println("Date");
		for(int i=0;i<6;i++)
			System.out.println(d[i]);*/
		System.out.println("Id for 3 consecutive login date");
		int h=0;
		int a=0;
		int ad=0;
		for(int t=0;t<6;t++)
		{
			if(id[t]>=h)
			{
				h=id[t];
				if(h==id[t])
					a++;
				if(a==2)
				{
					ad=id[t];
					System.out.println(ad);
				}
			}
		}
		System.out.println("Id");
		for(int i=0;i<6;i++)
			System.out.println(id[i]);
		System.out.println("Id for non consecutive login dates");
		int c2=0;
		for(int w1=0;w1<6;w1++)
		{
			for(int w3=1;w3<6;w3++)
			{
				if(id[w1]==id[w3])
				{
					if(id[w3]!=ad)
					{
						c2++;
					}
				}
			}
			if(c2>1)
				System.out.println(id[w1]);
		}
				
		

	}

}
