package patterns_by_kunal;

public class pattern_8 {

	public static void main(String[] args) {
		// try to print this pattern
		/*
		     4 4 4 4 4 4 4
		     4 3 3 3 3 3 4
		     4 3 2 2 2 3 4
		     4 3 2 1 2 3 4
		     4 3 2 2 2 3 4
		     4 3 3 3 3 3 4
		     4 4 4 4 4 4 4  
		 */
		pattern8(4);

	}
	static void pattern8(int n) {
		int originalN=n;
		n=2*n;
		for(int row =0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				
				int atEveryIndex=originalN- Math.min(Math.min(row,col), Math.min(n-row,n-col));
				System.out.print(atEveryIndex+" ");
			}
			System.out.println();
		}
	}

}