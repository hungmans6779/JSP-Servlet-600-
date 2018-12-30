package com;

public class WhileTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	   int a=0;
	   int count=0;
	   do{
		 count++;
    	 a=(int)(Math.random()*6+1);  
    	 System.out.println("²Ä "+count+"¦¸ = "+a);
       }while( a>1 );
	}

}
