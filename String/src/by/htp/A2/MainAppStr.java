package by.htp.A2;

public class MainAppStr {
	static String  MainString="    a qwertui  asdsdf oopilhjll  o  klmyio dddd jjj  ";

	//static String Simvol="H";
	//static int index=4;
	
	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string to be changed");
//		MainString=sc.nextLine();
//		System.out.println("Enter simvol");
//		Simvol=sc.nextLine();
//		System.out.println("Enter position");
//		index=Integer.parseInt(sc.nextLine());
		
		
		doChange(MainString);		
		
	}
	
	public static void doChange(String MainString) {
		String str=MainString;
		System.out.println();
		String result="";
		//String[] words=str.split(" ");
		char[] ch = (str.toLowerCase()).toCharArray();
		for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]-1);
			
			
		}
		
		System.out.println(result);

		
		
		
		
	}
	
}
