import java.util.Scanner;
public class CommandLine{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string");
  String a=sc.nextLine();
  char[] b=a.toCharArray();
  int sz=a.length(); 
  int c=1;
  for(int i=0;i<sz;i++)
{
     if(b[i]==' ')
     c=c+1; 
}
    if(sz!=0)
   System.out.println("The string is "+a+ " and no of words "+c);
     else
   System.out.println("No string input given");
}
}
