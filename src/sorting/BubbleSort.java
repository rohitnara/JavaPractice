package sorting;

public class BubbleSort {
	static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	static void bubbleSort(int a[]){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		print(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,1,3,2,4,15,8,-1,-5};
		bubbleSort(a);

	}

}
