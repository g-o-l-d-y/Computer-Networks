package simplePrograms;

import java.util.Scanner;

public class Prg2 {

	public static void generatePIN(String s, int p)
	{
		String specialCharacters="@.,!=<>#$%";
		char f=s.charAt(0);
		char l=s.charAt(s.length()-1);
		int u=p%10;
		p=p%9;
		if(p==0)
			p=9;
		String PIN=String.valueOf(p)+f+l+specialCharacters.charAt(u-1);
		System.out.print(PIN);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int p=sc.nextInt();
		generatePIN(s,p);
	}
}
