package service;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	public String readString(String text) {
		sc.nextLine();
		System.out.println(text);
		return sc.nextLine();
	}
	
	public Integer readInteger(String text) {
		System.out.println(text);
		return sc.nextInt();
	}
	
	public Double readDouble(String text) {
		System.out.println(text);
		return sc.nextDouble();
	}
}
