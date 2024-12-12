import java.util.Scanner;
class arithmaticOp{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of A : ");
	int a=sc.nextInt();
	System.out.println("Enter value of B : ");
	int b=sc.nextInt();
	System.out.println("Numbers are : A = "+a+", B = "+b);
	int add = a+b;
	System.out.println("Addition = "+ add);
	int sub = a-b;
	System.out.println("Substraction = "+sub);
	int mul = a*b;
	System.out.println("Multiplication = "+mul);
	int div = a/b;
	System.out.println("Division = "+div);
	int mod = a%b;
	System.out.println("Modulous = "+mod);

}
}
