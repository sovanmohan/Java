import java.util.*;
public class Output {
	void bubble_sort()
	{
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int swap=0;
		 for(int i=0;i<n;i++)
			 a[i]=sc.nextInt();
		 int swapped;
		 for(int j=0;j<n;j++)
		 {
			 swapped=0;
			 for(int k=0;k<n-j-1;k++)
			 {
				 if(a[k]>a[k+1])
				 {
					 swap=a[k];
					 a[k]=a[k+1];
					 a[k+1]=swap;
					 swapped=1;
				 }
				 if(swapped==0)
					 break;
			 }
			 
		 }
		 for(int r=0;r<n;r++)
			 System.out.println(a[r]);
		 
		
	}

	public static void main(String[] args) {
		Output t=new Output();
		t.bubble_sort();

	}

}
