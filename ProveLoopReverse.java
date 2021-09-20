/**
 * @(#)ProveLoopReverse.java
 *
 *
 * @author
 * @version 1.00 2018/10/25
 */


public class ProveLoopReverse {

    public static void main(String args[]) {

    	final int N = 10;

    	int x;

    	x=N;

    	while(x != 0){
    		x = x-1;
    		System.out.println("Iteration " + x + " of " + N);
    		System.out.println("t = " + (N-(N-x)));


    	}//edn while

    	System.out.println("x = " + x);


    }//end main method


}//edn class