import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
     String qwer,asdf="",zxcv="",mnb="";
      qwer=in.nextLine();
      int slength=qwer.length();
      for(int i=slength-1;i>=0;i--)
      {
        asdf=asdf+qwer.charAt(i);
      }
      zxcv=qwer;
      mnb=zxcv;
    if(qwer.charAt(0)=='A')
    {
      System.out.println("No");
      
    }
      else
      {
        System.out.println("Yes");
      }
      
    } 
}