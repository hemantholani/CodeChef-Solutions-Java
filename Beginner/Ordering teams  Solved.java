/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner scanner= new Scanner(System.in);
	    int T = scanner.nextInt();
	    for (int i=0; i<T; i++){
	        int a[]=new int[3],b[]=new int[3],c[]=new int[3];
	        for(int j=0;j<3;j++){
	             if(scanner.hasNextInt()){
	                    a[j]=scanner.nextInt(); 
	               }
	        }for(int j=0;j<3;j++){
	             if(scanner.hasNextInt()){
	                    b[j]=scanner.nextInt(); 
	               }
	        }for(int j=0;j<3;j++){
	             if(scanner.hasNextInt()){
	                    c[j]=scanner.nextInt(); 
	               }
	        }
	        if(check(a,b,c)||check(a,c,b)||check(b,a,c)||check(b,c,a)||check(c,a,b)||check(c,b,a)){
	           System.out.println("yes");
	        }else{
	            System.out.println("no");
	        }
	    } 
	}
	static Boolean check(int[] a, int[] b, int[] c)
    {
        if (a[0] >= b[0] && a[1] >= b[1] && a[2] >= b[2] && (a[0] > b[0] || a[1] > b[1] || a[2] > b[2]))
        {
            if (b[0] >= c[0] && b[1] >= c[1] && b[2] >= c[2] && (b[0] > c[0] || b[1] > c[1] || b[2] > c[2]))
            {
                return true;
            }
            else return false;
        }
        else return false;
    }
}

