package simplePrograms;

import java.util.Scanner;

public class Prg3 {

	public static void sort(String s)
	{
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j].length()>arr[j+1].length() || (arr[j].length()==arr[j+1].length() && arr[j].compareTo(arr[j+1])>1))
				{
					String t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
		for(String a:arr)
			System.out.print(a+" ");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		sort(s);
	}
}
