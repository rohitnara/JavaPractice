package sorting;

public class InsertionSort {
	static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	static void insertionSort(int a[]){
		int n=a.length;
		int i,j,k;
		for(i=1;i<n;i++){
			int key=a[i];
			for(j=i-1;j>=0;j--){
				if(a[j]<key){
					for(k=i-1;k>=j+1;k--){
						a[k+1]=a[k];
					}
					break;
					
				}
				
			}
			if(j==-1){
				for(k=i-1;k>=j+1;k--){
					a[k+1]=a[k];
				}
			}
			a[j+1]=key;
		}
		print(a);
	}
	public static void main(String[] args) {
		int a[]={5,1,3,2,4,15,8,-1,-5};
		int b[]={-1,0,1,2,3};
		int c[]={3,2,1,0,-1};
		int d[]={-11};
		insertionSort(a);
		System.out.println();
		insertionSort(b);
		System.out.println();
		insertionSort(c);
		System.out.println();
		insertionSort(d);

	}

}
