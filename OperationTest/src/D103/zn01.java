package D103;
import java.io.*;
import java.util.*;
import java.lang.*;

public class zn01 {
   public static void main (String[] args)
   {
	   System.out.print("������ַ����ж�����:");
	   Scanner cin=new Scanner(System.in);
	   int number=cin.nextInt();// number�����洢�ַ�����ĸ���
	   String temp="easy";
	   int j,k;
	   for(int i=0;i<number;i++)
	   {
		   Scanner input=new Scanner(System.in);
		   String[] s=new String[number];
		   s[i]=input.nextLine();
		   for( j=0,k=0;j<s[i].length()&&k<temp.length();j++)
		   {
			   if(s[i].charAt(j)==temp.charAt(k))
				   k++;
		   }
		   if(k==temp.length())
			   System.out.println("easy");
		   else 
			   System.out.println("difficult");
	   }
   }
}
