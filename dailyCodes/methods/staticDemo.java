import java.util.*;
class staticDemo{
		static void add(int a , int b){
			int ans = a+b;
			System.out.println("addition = "+ans);
		}
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter int values");
			int a = sc.nextInt();
			int b = sc.nextInt();
			add(a,b);
		}
}
