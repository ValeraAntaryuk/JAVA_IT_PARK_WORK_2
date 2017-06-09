import java.util.Scanner;
class Program{
	static void showLess(int a[],int number){
		int n = a.length;
		for (int i = 0; i < n;i++){
			if (number < a[i]){
				System.out.println(a[i]);
			}
		}
	}
	public static void main (String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = scanner.nextInt();
	int a[] = {6,2,8,10,8,6};
	showLess (a,number);
	}	
}