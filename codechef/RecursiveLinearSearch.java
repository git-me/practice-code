package codechef;

/*
 * linear search using recurssion and for loop method.
 */

public class RecursiveLinearSearch {

				static int  search(int a[],int l,int r,int x){
					
					for (int i = 0; i < a.length; i++) {
						if(a[i]==x)
							return i;
						
					}
					return -1;
					
					
//					if(r<l) 
//						return -1;
//					if(a[l]==x){
//						return l;
//					
//					}
//						return search(a, l+1, r, x);
//						
					
				
					
				}
					
	
	
	
	public static void main(String[] args) {
		int a[]={3,1,4,2,5,6,2,3};
		int r=a.length-1;
		int x=4;
					int result=search(a,0,r,x);
					if(result>0)
						System.out.println("found at index"+" "+result+" ");
					else{
						System.out.println("not found");
					}

	}

}
