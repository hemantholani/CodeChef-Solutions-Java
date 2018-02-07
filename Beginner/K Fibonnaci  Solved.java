/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long ans[] = new long[n+1];
		for (int i=1; i<=n ; i++ ){
		    if(i<=k){
		        ans[i]=1;
		    }else if(i>k){
		        for(int j=1;j<=k;j++){
		            ans[i] = ans[i] + ans[i-j];
		            ans[i] = ans[i]%1000000007;
		        }
		    }
		}
		System.out.println((int)ans[n]);
	}
}
