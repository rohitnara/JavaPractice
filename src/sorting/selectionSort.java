package sorting;

public class selectionSort {
	static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	static void SelectionSort(int a[]){
		int n=a.length;
		int min,k;
		for(int i=0;i<n;i++){
			min=Integer.MAX_VALUE;
			k=i;
			for(int j=i;j<n;j++){
				if(a[j]<min){
					min=a[j];
					k=j;
				}
			}
			if(k!=i){
			int t=a[i];
			a[i]=a[k];
			a[k]=t;
			}
		}
		print(a);
	}

	public static void main(String[] args) {
		int a[]={5,1,3,2,4,15,8,-1,-5,-13};
		int b[]={5,4,3,2,1,-1};
		SelectionSort(b);

	}

}
