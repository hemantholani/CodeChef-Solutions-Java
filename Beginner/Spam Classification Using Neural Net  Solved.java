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
	    for (int i =0;i<T ;i++ ){
	        int spam=0,non=0;
	        int ans = 0;
	        int N = scanner.nextInt();
	        int minX = scanner.nextInt();
	        int maxX = scanner.nextInt();
	        int w[] = new int[N],b[] = new int[N];
	        for(int j=0;j<N;j++){
	            w[j] = scanner.nextInt();
	            b[j] = scanner.nextInt();
	        }
	        for(int k=minX;k<=minX+2 && k<=maxX;k++){
	            ans=k;
	            for(int l=0;l<N;l++){
	                ans = w[l]*ans + b[l];
	            }
	            if(ans%2==0){
	                non++;
	            }else{
	                spam++;
	            }
	        }
	        if(non!=0 && spam!=0){
				int n=maxX-minX+1;
				if(n%2==0){
					non=spam=n/2;
				}else{
					if(non>spam){
						spam=n/2;
						non=(n/2)+1;
					}
					else{
						non=n/2;
						spam=(n/2)+1;
					}
				}
			}else{
				if(non==0){
					spam=maxX-minX+1;
				}else{
					non=maxX-minX+1;
				}
			}
	        System.out.println(non + " " + spam);
	    } 
	}
}
