import java.util.*;
public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int c=0;
		n=sc.nextInt();
		 for (int i = 31; i >= 0; i--) {
	            int k = n >> i;
	            if ((k & 1) > 0)
	            {
	                System.out.print("1");
	                c++;
	            }
	            else
	            {
	                System.out.print("0");
	                c++;
	            }
	        }
		 System.out.println();
		 System.out.println(c);
	}

}
