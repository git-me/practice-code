package codechef;

public class BubbleSort {

	static int [] sort(int a[],int n){
			int temp; int swaps=0;
			long time1=System.nanoTime();
		for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length-1-i; j++) {
						if(a[j]>a[j+1]){
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
							swaps++;
						}
				}
			}	
		long time2=System.nanoTime();
		System.out.println("total swaps"+" "+swaps+" ");
		return a;
		
		
	}
	
	
	public static void main(String[] args) {
		int a[]={8,7,6,5,4,3,2,1};
		int n=a.length;
		int b[]=new int[n];
		b=sort(a,n);
		System.out.println("sorted array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" {"+" "+b[i]+" "+"}");
		}
				
	}

}
