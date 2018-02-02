import java.util.Scanner;

class reverseinput{
	
	public static void main(String[] args) {
		int input, output;
		stack<Integer> s = new stack<Integer> ();
		
		// Read the values and push them into stack
		System.out.println("Enter positive numbers : ");
		do{
			Scanner in = new Scanner(System.in);
			input = in.nextInt();
			s.push (input);
		}while(input > 0);
		System.out.println("The sequence in reverse is : ");
		Integer size = s.size();
		int param = Integer.parseInt(size.toString());
		
		// To remove the negative element
		param -= 1;
		s.pop();
		
		// To pop the entire stack
		while(param-- > 0){
			output = s.pop();
			System.out.println(" "+ output);
		
		}
	}
}
