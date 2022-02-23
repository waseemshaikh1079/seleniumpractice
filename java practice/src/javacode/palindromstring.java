package javacode;

public class palindromstring {

	public static void main(String[] args) {
		String input="DAD";
		String output=" ";
		for(int i=input.length()-1;i>=0;i--) 
		{
			output=output+input.charAt(i);
			
		}
//System.out.println(output);
//		if(input.equals(output)){
//			System.out.println(input+ " palindrom string");
//		}
//		else {
//			System.out.println(input+ " not palindrom string");
		boolean palindrome=true;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=output.charAt(i)) {
				palindrome=false;	
			}
	}	
		if(palindrome) {
			System.out.println( " palindrom string");	
		}
		else {
			System.out.println(input+ " not palindrom string");
		}
	}
}

