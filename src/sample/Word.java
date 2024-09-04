package sample;
import java.util.Scanner;
public class Word 
{
	public static void main(String[] args) 
	{
		Alpha();
	}
	public static void Alpha()
    {
       Scanner s=new Scanner(System.in);
       char A=s.next().charAt(0);
       char B=s.next().charAt(0);
       for(char a=A;a<=B;a++)
       {
    	  if(a<B) 
    	  {
    		  System.out.print(a+",");
    	  }
    	  else if(a==B)
    	  {
    		  System.out.print(a+".");
    	  }
       }
    }
}