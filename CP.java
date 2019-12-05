package projectdiscrete;
import java.util.*;

public class CP extends Index {
	
	public static void exit(){
		
		Index main = new Index();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("------------------------------------");
		
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Do you want to continue? "); int choice = In.nextInt();


		
		if (choice == 1){
			
			main.main(null);
			
		}
		
		else if(choice == 2 ){
			
			System.out.println("Thank You!");
			
		}
		
		else{
			
			System.out.println("Invalid Input");
			exit();
		}

	}

	public static void display1(){
		
		Scanner In = new Scanner(System.in);
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		
		System.out.println(" --Permutations and Combinations--  ");
		System.out.println("1 = Permutation Without Repetition");
		System.out.println("2 = Permutation With Repetition");
		System.out.println("3 = Combination without Repetition");
		System.out.println("4 = Combination with Repetition");
		System.out.println("                                     ");
		System.out.print("Please Choose a Number: "); int Menu = In.nextInt();
		
		
		PWOR choice = new PWOR();
		PWR choice2 = new PWR();
		CWOR choice3 = new CWOR();
		CWP choice4 = new CWP();
		
		if (Menu == 1){
			
			choice.WOREP();
			exit();
			
		}
		
		else if (Menu == 2){
			
			choice2.WREP();
			exit();
			
		}
		
		else if (Menu == 3){
			
			choice3.WOREP();
			exit();
			
		}
		
		else if (Menu == 4){
			
			choice4.WREP();
			exit();
			
		}
		
		else{
			
			System.out.println("Invalid Input");
			exit();
			
		}
	}
		
}
	
	
