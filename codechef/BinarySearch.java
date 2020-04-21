package codechef;

public class BinarySearch {

	static int search(int a[],int l,int r,int x){
		
		while(r>l){
		int mid=(l+(r-1))/2;
		if(a[mid]==x)
			return mid;
		if(a[mid]>x)
			return search(a,l,mid-1,x);
		return search(a,mid+1,r-1,x);
		}
			return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		   int l=0;
		   	int r=a.length;
		   	int x=4;
		   	int result=search(a,l,r,x);
		   	if (result>0)
		   		System.out.println("found at index"+":"+result);
		   			if (result<0)
		   				System.out.println("not found ");
	}

}
