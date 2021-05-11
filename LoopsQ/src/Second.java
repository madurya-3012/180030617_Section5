import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma;
		ma=sc.nextInt();
		if(ma%2==0)
		{
			System.out.println("Even");
			
		}
		else {
			System.out.println("Odd");
		}
	sc.close();
	}
}
