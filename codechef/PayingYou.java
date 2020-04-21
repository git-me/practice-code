package codechef;
/*
 *     	@link {https://www.codechef.com/problems/MARCHA1} 
 */

public class PayingYou {

	static int payucheck(int arry[], int m) {
		boolean flag = false;
		for (int i = 0; i < arry.length;) {
			int temp = m - arry[i];
			int result = binarysearch(arry, 0, arry.length - 1, temp);
			if (result > 0) {
				flag = true;
				
			}
			m = temp;
			i++;
		}
		if (!flag)
			return 1;
		return -1;

	}

	static int binarysearch(int[] arry, int l, int r, int x) {
		if (r >= l) {
			int mid = (l + (r - 1)) / 2;
			if (x == arry[mid]) {
				return mid;
			}
			if (x > arry[mid]) {
				binarysearch(arry, mid + 1, r, x);
			}
			binarysearch(arry, l, mid - 1, x);
		}
		return -1;

	}

	static int[] bubblesort(int arry[], int lengtharry) {
		int temp;
		for (int i = 0; i < arry.length; i++) {

			for (int j = 0; j < lengtharry - i - 1; j++) {
				if (arry[j] > arry[j + 1]) {
					temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
				}

			}

		}

		return arry;
	}

	public static void main(String[] args) {
		// int t= 3;
		int n = 3;
		int m = 23;
		int a[] = { 1, 2,100};
		int length = a.length;
		int bubblearr[] = bubblesort(a, length-1);
						int finalresult=payucheck(bubblearr, m);
						System.out.println(finalresult);
						if (finalresult>0)
							System.out.println("yes");
						else{
						System.out.println("no");
						
						}
		
		
	}

}
