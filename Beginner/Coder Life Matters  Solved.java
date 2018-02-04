/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner= new Scanner(System.in);
	    int T = scanner.nextInt();
	    for (int i=0;i<T ;i++ ){
	        int days[] = new int[30];
	        int count=0;
	        int upperCount=0;
	        for(int j=0;j<30;j++){
	            if(scanner.hasNextInt()){
	                days[j]=scanner.nextInt();
	                if(days[j]==1){
	                    count++;
	                }else{
	                    count=0;
	                }
	                if(count>5){
	                    upperCount++;
	                }
	            }
	        }
	        if(upperCount>0){
	            System.out.println("#coderlifematters");
	        }else{
	            System.out.println("#allcodersarefun");
	        }
	    } 
	}
}
