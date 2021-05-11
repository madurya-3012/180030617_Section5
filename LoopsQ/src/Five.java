import java.util.*;
public class Five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma;
		ma=sc.nextInt();
		if((ma>=65 && ma <= 90) || (ma >= 97 && ma <= 122))
		    System.out.println(" Alphabet ");
		else if(ma>= 48 && ma <= 57)
            System.out.println(" Digit ");
        else 
            System.out.println(" Special Character ");
	sc.close();
	}
}
