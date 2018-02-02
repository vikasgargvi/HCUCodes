import java.util.Scanner;

public class reversestring 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Enter string: ");
    String inputString = scanner.nextLine();
	
	// Invalid String check
    if (inputString == null || inputString.length() == 0) 
    {
      System.out.println("Enter the valid string");
      return;
    }
    // Get reverse string and print
    String reverse = reverseString(inputString);
    System.out.printf(reverse+"\n");
  } 
  
  // Function to return reverse String word by word
  private static String reverseString(String inputString) 
   {
     String[] arrString = inputString.split("\\s+");
     stack<String> stack = new stack<String>();
     for(String input : arrString) 
     {
       stack.push(input);
     }
    String s = "";
    while( !stack.isEmpty()) 
    {
      s = s + stack.pop() + " ";
    }
  	return s;
  }
}
