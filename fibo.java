import java.util.Scanner;
import java.lang.String;
class fibo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = sc.nextInt();
		int a=0,b=1;
		for(int i=0;i<n;i++){
			System.out.print(a+" ");
			int sum = a+b;
			a=b;
			b=sum;
		}
	}
}
