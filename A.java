
public class A {

	public static void main(String[] args) {
		int arr[]= {5,2,4,6,3,1};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			System.out.println(i+"iteration");
			System.out.print("{");
			for(int e=0;e<n;e++)
			{
				if(e==(n-1))
					System.out.print(arr[e]+"}");
				else
					System.out.print(+arr[e]+",");
			}
			System.out.println();
				
		}
		System.out.println("Final result of sorting is");
		System.out.print("{");
		for(int k=0;k<n;k++)
		{
			if(k==(n-1))
				System.out.print(arr[k]+"}");
			else
				System.out.print(+arr[k]+",");
		}

	}

}

