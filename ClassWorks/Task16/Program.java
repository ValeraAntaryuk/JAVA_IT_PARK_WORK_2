import java.util.Scanner;
class Program{
	public static int searchMin(int a[]) {
		int n = a.length;
		int min = a[0];
		for (int i = 1; i < n; i++){
			if (a[i] < min){
				min = a[i];
			}
		}
		return min;
	}
	public static int searchMax(int a[]) {
		int n = a.length;
		int max = a[0];
		for (int i = 1;i < n; i++){
			if (a[i] > max){
				max = a[i];
			}
		}
		return max;
	}
	public static int searchNumber(int a[], int number) {
		int n = a.length;
		for (int i = 0; i < n; i++){
			if (a[i] == number) {
				return i;
			}
		}
		return -1;	
	}
	public static void swapNumbers(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}	
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		int a[] = {1,2,3,4,8,6};
		int myMin = searchMin(a);
		//System.out.println(myMin);
		int myMax = searchMax(a);
		//System.out.println(myMax);
		//System.out.println("Enter the number for search ");
		//int number = scanner.nextInt();
		//int myNumber = searchNumber(a,number);
		//System.out.println("Yor number position is " + myNumber);
		//System.out.println("Enter the two numbers for swap ");
		//int i = scanner.nextInt();
		//int j = scanner.nextInt();
		//swapNumbers(a,i,j);
		int i = searchNumber(a,myMin);
		System.out.println(i);
		int j = searchNumber(a,myMax);
		System.out.println(j);
		swapNumbers(a,i,j);
		System.out.println("Sorted array:");
		int n = a.length;
		for (int y = 0; y < n; y++){
			System.out.print(" " + a[y]);
		}
	}
}