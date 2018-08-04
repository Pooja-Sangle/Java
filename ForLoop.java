import java.util.Scanner;
public class ForLoop{
 
  public static void main(String args[])
  {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a string");
     String a=input.nextLine();
     char b[]=a.toCharArray();
     int sz=a.length();
     if(sz==0)
     System.out.println("No string entered");
     else
     {
       for(char temps:b)
       {
         System.out.print(Character.toUpperCase(temps));
       }
     }
  }

}
