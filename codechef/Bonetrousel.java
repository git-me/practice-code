package codechef;

public class Bonetrousel {

	// Java code here
	// O(n*k) solution for finding
	// maximum sum of a subarray
	// of size k

	/*
	 * @link{https://www.hackerrank.com/challenges/bonetrousle/problem}
	 */

	static int[] arryFill(int b) {
		int a[] = new int[b];
		System.out.println("k" + b);
		for (int i = 1; i < a.length + 1; i++) {
			System.out.println("i" + i);
			a[i - 1] = i;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		return a;

	}

	static void maxSum(int n, int b, int k) {
		// Initialize result

		int max_sum = Integer.MIN_VALUE;
		int[] finalarr = new int[k];
		int arr[] = arryFill(b);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[i] after function call" + " " + arr[i]);
		}

		// Consider all blocks starting with i.
		for (int i = 0; i < k - b + 1; i++) {
			int current_sum = 0;
			int arry[] = new int[b];
			for (int j = 0; j < b; j++) {
				current_sum = current_sum + arr[i + j];
				arry[j] = arr[i + j];
				// String s=String.format("arr[%d+%d]", i,j);
				// System.out.println(s+" "+arr[i+j]+" ");
			}
			// Update result if required.
			max_sum = Math.max(current_sum, max_sum);

			if (max_sum == n) {
				for (int j = 0; j < arry.length; j++) {
					finalarr[j] = arry[j];
				}
			}
		}
		for (int i = 0; i < finalarr.length; i++) {
			System.out.println(finalarr[i]);
		}

		for (int i = 0; i < finalarr.length; i++) {
			System.out.println("gg" + finalarr[i]);
		}

	}

	// Driver code
	public static void main(String[] args) {

		int k = 3;
		int n = 14;
		int b = 8;
		maxSum(n, b, k);

	}
}
