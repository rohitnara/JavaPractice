package sorting;

public class QuickSort {
	static int partition(int a[],int low,int high){
		int l=low;
		int r=high;
		int pivot=a[l];
		while(l<r){
			while(a[l]<=pivot&&l<r)
				l++;
			while(a[r]>pivot)
				r--;
			if(l<r){
				int t=a[l];
				a[l]=a[r];
				a[r]=t;
			}
		}
		int k=a[low];
		a[low]=a[r];
		a[r]=k;
		return r;
	}
	static void quickSort(int a[],int l,int r){
		if(l<r){
			int p=partition(a,l,r);
			quickSort(a,l,p-1);
			quickSort(a,p+1,r);
		}
	}
	static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]={5,1,3,2,4,15,8,-1,-5,5,-1};
		int n=a.length;
		quickSort(a,0,n-1);
		print(a);

	}

}
