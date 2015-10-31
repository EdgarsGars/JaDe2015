package vea.itm.jade2015.m00;

public class Test {

	public static int search(int x, int[] a) {
		return binarySearchInRange(x, a, 0, a.length);
	}

	private static int binarySearchInRange(int x, int[] a, int first, int max) {
		if (first >= max) {
			return -1; // range has dwindled to nothingness
		}

		int mid = (first + max) / 2;
		if (x < a[mid]) {
			return binarySearchInRange(x, a, first, mid);
		} else if (x > a[mid]) {
			return binarySearchInRange(x, a, mid + 1, max);
		} else {
			// x == a[mid]... we found it, but check if it's the first
			if (mid > 0 && x == a[mid - 1]) {
				// not the first! search lower half
				return binarySearchInRange(x, a, first, mid);
			} else {
				return mid; // it's the first
			}
		}
	}

}
