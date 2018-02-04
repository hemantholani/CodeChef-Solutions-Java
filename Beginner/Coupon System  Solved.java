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
		Scanner scanner= new Scanner(System.in);
	    int T = scanner.nextInt();
	    for (int i=0; i<T; i++){
	        int n = scanner.nextInt();
	        int c1=0,c2=0,c3=0,x1=0,x2=0,x3=0;
	        for(int j=0;j<n;j++){
	            int c = scanner.nextInt();
	            int l = scanner.nextInt();
	            int x = scanner.nextInt();
	            if(l==1){
	                if(x>x1){
	                    x1=x;
	                    c1=c;
	                }else if(x==x1){
	                    if(c<c1){
	                        c1=c;
	                    }
	                }
	            }else if(l==2){
	                if(x>x2){
	                    x2=x;
	                    c2=c;
	                }else if(x==x2){
	                    if(c<c2){
	                        c2=c;
	                    }
	                }
	            }else  if(l==3){
	                if(x>x3){
	                    x3=x;
	                    c3=c;
	                }else if(x==x3){
	                    if(c<c3){
	                        c3=c;
	                    }
	                }
	            }
	        }
	        System.out.println(x1 +" " +c1);
	        System.out.println(x2 +" " +c2);
	        System.out.println(x3 +" " +c3);
	    } 
	}
}
