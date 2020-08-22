package simplePrograms;

import java.util.Scanner;

public class Prg4 {
	
	static char arr[] = new char[100];
	static int freq[] = new int[125];
	public static void find()
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				if(arr[i]==arr[j])
				{
					arr[j]='#';
					arr[i]='#';
				}
			if(arr[i]!='#')
				System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0;i<125;i++)
			if(freq[i]>1)
			{
				char c=(char) i;
				System.out.println(c+":"+freq[i]);
			}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
			freq[arr[i]]++;
		}
		find();
	}
}
