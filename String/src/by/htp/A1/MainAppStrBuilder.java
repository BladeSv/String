package by.htp.A1;

import java.util.Scanner;

public class MainAppStrBuilder {

	static String  MainString="    a qwertui  asdsdf oopilhjll  o  klmyio dddd jjj  ";

	static String Simvol="H";
	static int index=4;
	
	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string to be changed");
//		MainString=sc.nextLine();
//		System.out.println("Enter simvol");
//		Simvol=sc.nextLine();
//		System.out.println("Enter position");
//		index=Integer.parseInt(sc.nextLine());
		
		
		doChange(MainString, Simvol, index);		
		
	}
	
	public static void doChange(String MainString,String Simvol, int index) {
		
		StringBuilder str = new StringBuilder(MainString);
		StringBuilder result = new StringBuilder();		
		int count=1;
		
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			result.append(' ');
			count=1;
		}else {
			if(count==index) {
				result.append(Simvol);	
				count++;
			}else {
				result.append(str.charAt(i));
				count++;
			}
			
			
		}
		
		
	}

		

			
			
			
		
		
		System.out.println(result);

		
}
}
