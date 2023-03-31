import java.util.*;
public class P7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String dob=sc.next();
		String n2[] = dob.split("/");
		String n1[]= new String[4];
		String r="";
		for(int i=0;i<2;i++)
		{
			n1[i]=n.charAt(i)+"";
		}
		for(int i=2,j=0;i<4;i++,j++)
		{
			n1[i]=n2[1].charAt(j)+"";
		}
		for(int w=0;w<4;w++)
			System.out.print(n1[w]);
	}

}
