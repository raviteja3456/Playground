import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int a,b,c,d;
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      if(a>b)
      {
        d=a;
      }else
      {
        d=b;
      }
      if(d>c)
      {
        d=d;
      }
      else
      {
        d=c;
      }
      System.out.println(d);
    }
}