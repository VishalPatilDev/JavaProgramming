import java.util.Scanner;
class InputOutput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		System.out.println("Age = "+age);
		System.out.println("Name = "+name);
		System.out.println("Number = "+num);
	}
}
