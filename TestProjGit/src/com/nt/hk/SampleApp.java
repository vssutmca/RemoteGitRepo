package com.nt.hk;

import java.util.Scanner;

public class SampleApp {

	public static void main(String[] args) {
		System.out.println("Uploading project to Git Repo");
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur desired frequency of love with java");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.println("I Love java");
		//close scanner
		sc.close();

	}

}
