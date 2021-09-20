/**
 *
 */


public class ProveLoop {



    public static void main(String args[]) {
    	//define constants
    	final int N = 10;  //loop around ten times

    	//declare variables
    	int x;

    	//intitialise loop counter variable
    	x=0;

    	//{P AND N-n}
    	assert(x>=0 && x<=N): "Error: Loop cannot be established";

    	while(x!=N){

    		//{P AND B}. Note: if execution of program gets to here, this will always be true.
    		assert((x>=0 && x<=N) && x!= N): "Error: loop body cannot execute";
    		System.out.println("Iteration " + x + " of " + N);

    		x = x+1;	//try setting n = n-1 to see what happens

    		assert(x>=0 && x<=N): "Error: Loop invariant no longer true";

    	}//end while

    	System.out.println("x = " + x);
    }//end main


}//end class