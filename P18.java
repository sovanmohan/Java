import java.util.*;
public class P18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuffer s = new StringBuffer();
		for(int i=0;i<n;i++) {
			s.append(sc.next()+" ");
		}
		String l = s.toString();
		String arr[] = l.split(" ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
}
}
