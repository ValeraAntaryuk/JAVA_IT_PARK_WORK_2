import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = 13;
		System.out.print("Enter number:");
		int a = scanner.nextInt();
		if (a == number) {
			System.out.println("Victory");
		} else if (a > number) {
			System.out.println("Bigger");
		} else  if (a < number) {
			System.out.println("Small"); 
		}
		System.out.print("Enter number:");
        a = scanner.nextInt();
		if (a == number) {
			System.out.println("Victory");
		} else if (a > number) {
			System.out.println("Bigger");
		} else  if (a < number) {
			System.out.println("Small"); 
		}
		System.out.print("Enter number:");
		a = scanner.nextInt();
		if (a == number) {
			System.out.println("Victory");
		} else {
			System.out.println("Game over");
		} 
				
	}
	}
	