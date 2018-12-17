package finalPro;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String str;
		
		int choice;
		
		String capitalInput;
		
		String lowerCase;
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		menu();
		
		choice = input.nextInt();
		input.nextLine();
		
		System.out.println();
		
		while(choice != -1) {
			
			
			
			if(choice >0 || choice < 5) {
				
				
			System.out.println("Enter string");
				str = input.nextLine();
				
				
			switch(choice) {
			
			case 1:{
				
				wordCount(str);
				System.out.println();
				System.out.println("The number of words is" +wordCount(str));
				break;
			}
			
			case 2:{
				 capitalInput = UpperCase(str);
				
				
				System.out.println(capitalInput);
				break;
			}
			case 3:{
				
				String lower =  lowerCase(str);
				System.out.println(lower);
				break;
				
			}
			
			case 4:{
				
				
					backward(str);
					
					break;
				}
				
			}
			
			
			
			
			}else System.out.println("enter a valid input ");
			menu();
			choice = input.nextInt();
			input.nextLine();
			
		}input.close();
			
			
		
		}
	
	public static String lowerCase(String str) {
		return str.toLowerCase();
	}
	
	public static String UpperCase(String str) {
		return str.toUpperCase();
	}

	
	
	 public static int wordCount(String str)
	   {
	      StringTokenizer strTok = new StringTokenizer(str);
	      return strTok.countTokens();
	   }
	 
	 public static void backward(String str)
	   {
	      for (int i = str.length() - 1; i >= 0; i--)
	         System.out.print(str.charAt(i));
	      System.out.println();
	   }
	
	public static void menu() {
		System.out.println("Enter 1 to display the number of words in the string ");
		System.out.println("Enter 2 to display the string in all capital letters ");
		System.out.println("Enter 3 to display the string in all lower case letters ");
		System.out.println("Enter 4 to display the string in reverse order ");
		System.out.println("Enter -1 to exit ");
	
		
	}
	

}
