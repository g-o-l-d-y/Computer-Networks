package simplePrograms;

import java.util.*;
public class Prg1 {
	
	public static void findCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		findCount(s);
	}
}
