package by.htp.A2;



public class MainAppStr {
	static String  MainString="1 1 1 zzz";

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
		String num="";
		char[] ms =(str.toCharArray());


		for(int i=0;i<ms.length;i++) {
		if(Character.isAlphabetic(ms[i])) {
			if((i+1)<(ms.length)) {
				if(Character.isAlphabetic(ms[i+1]) ){
				
				result=result+String.format("%-3s",ms[i]);
				num=num+String.format("%-3s",((String.valueOf(ms[i]).toLowerCase()).charAt(0))-'a'+1);
				
			}}else {
				result=result+ms[i];
				num=num+(((String.valueOf(ms[i]).toLowerCase()).charAt(0))-'a'+1);
			}
		}else {
			result=result+ms[i];
			num=num+" ";
			
		}	
		
			
		}
		
		System.out.println(result);
		System.out.println(num);
		


			
			
		}
		
		
		
		
		
		
	}
	

