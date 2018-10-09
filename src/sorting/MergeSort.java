package sorting;

public class MergeSort {
	public static void merge(int a[],int l,int m,int r){
		int i=0,j=0,k=l;
		int p=m-l+1;
		int q=r-m;
		int b[]=new int[p];
		int c[]=new int[q];
		for(int y=0;y<p;y++){
			b[y]=a[y+l];
		}
		for(int y=0;y<q;y++){
			c[y]=a[m+1+y];
		}
		while(i<p&&j<q){
			if(b[i]<c[j]){
				a[k]=b[i];
				i++;
				k++;
			}
			else if(b[i]>c[j]){
				a[k]=c[j];
				j++;
				k++;
			}
			else{
				a[k]=b[i];
				k++;
				i++;
				a[k]=c[j];
				k++;
				j++;
			}
		}
		while(i<p){
			a[k]=b[i];
			i++;
			k++;
		}
		while(j<q){
			a[k]=c[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int a[],int l,int r){
		if(l<r){
			int mid=l+(r-l)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
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
		mergeSort(a,0,n-1);
		print(a);

	}

}
