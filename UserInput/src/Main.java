import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("What's is your name");
	 String name = sc.nextLine();
	 
	 System.out.println("What's is your age");
	 int age = sc.nextInt();
	 
	 System.out.println("Hello "+name);
	 System.out.println("You're "+age+" years old");
	    
            
	}

}
