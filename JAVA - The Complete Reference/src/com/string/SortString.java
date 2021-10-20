package com.string;

public class SortString {
	static String arr[] = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid",
			"of", "their", "country" };

	public static void main(String[] args) {
		
		//Doesnot Ignore Case
		for(int i = 0; i <arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j].compareTo(arr[i]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		//Ignore Case
		for(int i = 0; i <arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j].compareToIgnoreCase(arr[i]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			
			System.out.println(arr[i]);
		}
	}

}
