import java.util.*;
public class P11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		StringBuffer s = new StringBuffer(sc.nextLine());
		String rev= "";
		s.append(" ");
		int l=s.length();
		for(int i=0,j=0;i<l;i=j+1)
		{
			j = s.indexOf(" ",i);
			rev = s.substring(i,j);
			StringBuffer w = new StringBuffer(rev);
			w.reverse();
			System.out.print(w+" ");
		}
	}
}
