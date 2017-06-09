import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
			a = a % 2;	
		if (a == 0) {
			System.out.println("Even ");
		} else {
			System.out.println("Not Even ");
		} 
		}
}