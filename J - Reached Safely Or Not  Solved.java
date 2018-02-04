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
	    for (int i=0;i<T ;i++ ){
	        int x=0,y=0;
	        int M = scanner.nextInt();
	        int N = scanner.nextInt();
	        int Rx = scanner.nextInt();
	        int Ry = scanner.nextInt();
	        int len = scanner.nextInt();
	        String dir = scanner.next();
	        for(int j=0;j<len;j++){
	            char direction = dir.charAt(j);
	            if(direction=='D'){
	                y--;
	            }else if(direction=='U'){
	                y++;
	            }else if(direction=='R'){
	                x++;
	            }else if(direction=='L'){
	                x--;
	            }
	        }
	        if(x<0||y<0||x>M||x>N){
	            System.out.println("Case "+(i+1)+": DANGER");
	        }else if(x==Rx&&y==Ry){
	            System.out.println("Case "+(i+1)+": REACHED");
	        }else{
	            System.out.println("Case "+(i+1)+": SOMEWHERE");
	        }
	    } 
	}
}
