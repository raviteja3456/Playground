import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_2_numbers(n1, n2,n3);// Function call
	    System.out.print(gcd_of_2_numbers(n1, n2,n3));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int gcd_of_2_numbers(int num1, int num2,int num3)
	{
	    int min_element,a;
	    if(num1 > num2)
	    {
	        min_element = num1;
	    }
	    else{
	        min_element = num2;
         
	    }
      if(min_element>num3)
      {
	 a=min_element;
	    }
      else
      {
        a=num3;
      }
	    return a;
	}
}