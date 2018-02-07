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
		int T = scanner.nextInt();
		for (int i=0;i<T ;i++ ){
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    int d = scanner.nextInt();
		    if((a==b && c==d)||(a==c&&b==d)||(a==d&&b==c)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		} 
	}
}
