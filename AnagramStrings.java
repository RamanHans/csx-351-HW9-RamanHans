package hans;
import java.util.*;
public class AnagramStrings
{
	public static void main( String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two strings ");
		String str,str1;
		str=s.nextLine();
		str1=s.nextLine();
		char ca1[]=str.toCharArray();
		char ca2 []=str1.toCharArray();
		int l=str1.length();
		int flag=0 ;
		if(str.length()!=str1.length())
			{System.out.println("Strings are not Anagrams");}
		else {
			{    flag =0;
			for(int i=0;i<l;i++)
				for(int j=0;j<l;j++)
				{
					if(ca1[i]==ca2[j])
						flag++;
				}
			}
			
		}
		if(flag!=l )
			System.out.println("Strings are not anagrams");
		else System.out.println("Strings are anagrams");
	}
	
}
	