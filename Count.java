
public class Count {

	public Count() {
		// TODO Auto-generated constructor stub
	}

	public int[] doSort(int A[]) {
int n = A.length;
int C[] = new int[32767];
int B[] = new int[n+1];
int a[] = new int[n+1];
		for(int i=0;i<A.length;i++)
			a[i+1]=A[i];
		
		for(int i=1;i<a.length;i++) {
			C[i]=0;
		}
		for(int i=1;i<a.length;i++) {
			C[a[i]]++;
		}
		for(int i=2;i<a.length;i++) {
			C[i]+=C[i-1];
		}
		for(int i=n;i>0;i--) {
			B[C[a[i]]]=a[i];
			C[a[i]]--;
		}
		
		return B;
	}
}
