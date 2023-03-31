import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int r=0;
		 for (int i = 63%32; i >= 0; i--) {
	            int k = n >> i;
	            if ((k & 1) > 0)
	            {
	                c++;
	            }
	            else
	            {
	                continue;
	            }
	        }
		 //System.out.println(c);
		 if(c%2==1)
			 System.out.println("T parity of Binary word is 1");
		 else
			 System.out.println("T parity of Binary word is 0");

	}

}
