package by.htp.A1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainAppStr {
	
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
		String str=MainString;
		System.out.println();
		String result="";
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(words[i]=="") {
				result=result+" ";
			}else if(words[i].length()>=index) {
				char[] ch=words[i].toCharArray();
				
				ch[index-1]=Simvol.toCharArray()[0];
				result=result+new String(ch)+" ";
				
			}else { result=result+words[i]+" ";
				
			}
			
			
		}
		
		System.out.println(result);

		
		
		
		
	}
	
}
