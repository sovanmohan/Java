
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            if(((n>=-128)&&(n<=127))&&((n>=-32768)&&(n<=32767))&&((n>=(int)(Math.pow(-2,31))&&(n<=((int)Math.pow(2,31)-1))))&&((n>=(long)(Math.pow(-2,127))&&(n<=(long)(Math.pow(2,127)-1)))))
            {
                System.out.println(n+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                
            }
            else if(((n>=-32768)&&(n<=32767))&&((n>=(int)(Math.pow(-2,31))&&(n<=((int)Math.pow(2,31)-1))))&&((n>=(long)(Math.pow(-2,127))&&(n<=(long)(Math.pow(2,127)-1)))))
            {
                System.out.println(n+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(((n>=(int)(Math.pow(-2,31))&&(n<=((int)Math.pow(2,31)-1))))&&((n>=(long)(Math.pow(-2,127))&&(n<=(long)(Math.pow(2,127)-1)))))
            {
                System.out.println(n+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(((n>=(long)(Math.pow(-2,127))&&(n<=(long)(Math.pow(2,127)-1)))))
            {
                System.out.println(n+" can be fitted in:");
                System.out.println("* long");
            }
            else
            {
                System.out.println(n+" can't be fitted anywhere");
            }
        }
    }
}
