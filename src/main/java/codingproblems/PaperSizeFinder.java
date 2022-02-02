package codingproblems;

public class PaperSizeFinder {
	
	/*
	 * Given the paper size of A0 paper (841 mm x 1189 mm), find length and breadth of AN. Where n > 0.
	 */

	public static void main(String[] args) {
		//int
		int length = 841;
		int breadth = 1189;
		int n=10;
		int[] paperSize =findPaperSize(n,length,breadth);
		System.out.println("Paper Size A"+n+" : "+paperSize[0]+" * "+paperSize[1]);
	}

	private static int[] findPaperSize(int n, int length, int breadth) {
		
		if(n==0) {
			int[] paperSize = new int[2];
			paperSize[0] = length;
			paperSize[1] = breadth;
			return  paperSize ;
		}
		else {
			if(n%2==0) {
				return findPaperSize(n-1, length/2, breadth);
			}
			else
				return findPaperSize(n-1, length, breadth/2);
		}
		
	}
}
