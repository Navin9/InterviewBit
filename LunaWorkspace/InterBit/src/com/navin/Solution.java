package com.navin;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		int[] a={4,1,2,1};
		int [] b={3,1,1,2};
		int[] x=solution(a,b);
		System.out.println(x[0]+"  "+x[1]);
	}
	 static int[] solution(int []a,int []b)
	{
		int maxOfA=0,maxOfB=0,c,d,sumA=0,sumB=0,diff=999999,finalSumA=0,finalSumB=0,max=0;
		 Arrays.sort(a);	 Arrays.sort(b);	int	minOfA=a[0]; maxOfA=a[a.length-1];		 maxOfB=b[b.length-1];
		 System.out.println(maxOfA);
		 	 max=minOfA;
		 if(maxOfB>maxOfA)
		 {	max =maxOfB+1;	 }
		 for(d=max;d>-1;d--)
		 { sumA=0;
			 for(int i=0;i<a.length;i++)
			 {	 if(a[i]>d)
				 sumA+=3;
				 else
				 sumA+=2;
			 }
			 sumB=0;
			 for(int i=0;i<b.length;i++)
			 {
				 if(b[i]>d)
					 sumB+=3;
				 else
					 sumB+=2;
			 }
			 System.out.println("Sum A="+sumA +" Sum of B="+sumB+" for D - " +d);
		  if(diff>Math.abs(sumA-sumB))
		  {
			  System.out.println("diff -> "+diff);
			  diff=Math.abs(sumA-sumB);
			  System.out.println("diff -> "+diff);
			  finalSumA=sumA;
			  finalSumB=sumB;
		  }
		 }
		 int[] x={finalSumA,finalSumB};
		 
		 //		int x= Arrays
		 
		 
		
		return x;
		
	}
}
