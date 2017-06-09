import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 2;
		int x = scanner.nextInt();
		boolean a = true;
		while (i*i<=x) {
			if (x % i == 0) {
				a = false;
				break; 
			}
			i = i + 1;	
		}
		if (a == true) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}