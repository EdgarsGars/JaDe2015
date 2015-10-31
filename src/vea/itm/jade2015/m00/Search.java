package vea.itm.jade2015.m00;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		//call binarySearch
		return 0;
	} 
	

	public static int binarySearch(int x, int[] a) {
		// TODO finish implementation of binary search method
		
		int mid = a.length / 2;
		if (x < a[mid]) {
			return binarySearch(x, a /*not a but left half of a */);
		} else if (x > a[mid]) {
			return binarySearch(x, a /*not a but right half of a */);
		} else {
			return mid; // because x == a[mid], i.e. we found it!
		}

	}
}
