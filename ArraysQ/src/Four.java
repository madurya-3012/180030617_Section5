import java.util.*;
public class Four {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a[]= {65,67,69,70,71};
	    int n=a.length;
	    
	    char c;
	    for(int i=0;i<n;i++)
	    {
	      int k=a[i];
	      c=(char)k;
	      System.out.println(k+"  "+c);
	    }
	   sc.close();
	  }
}
