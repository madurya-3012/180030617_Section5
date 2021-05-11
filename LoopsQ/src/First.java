import java.util.*;
public class First {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		    int a =sa.nextInt();
		    if(a>0) {
		      System.out.println("Positive");
		    }
		    else if(a==0) {
		      System.out.println("Zero");
		    }
		    else {
		      System.out.println("Negative");
		    }
	 sa.close();
	}
}
