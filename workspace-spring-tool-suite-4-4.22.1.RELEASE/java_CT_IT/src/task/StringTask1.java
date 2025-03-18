package task;
import java.util.Scanner;
public class StringTask1 {
   public static void main(String args[]) {
	   String name;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scan.nextLine();
	   System.out.println("enter the character");
	   char[] ch = {'a','e','i','o','u'} ;
	   int n=0;
	   char[] arr = str.toCharArray();
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<ch.length;j++) {
		   if(arr[i]==ch[j])
			   n++;
		   }
		   
	   }
	   
	   
	   System.out.println(n);
   }
}
