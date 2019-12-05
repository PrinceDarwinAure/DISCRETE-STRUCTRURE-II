package projectdiscrete;
import java.util.*;
import java.io.*;
public class Index {

	public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
	
		System.out.println("            --Menu--             ");
		System.out.println("1 = Combinations and Permutations");
		System.out.println("2 = Sterling Number Of Second Case");
		System.out.println("3 = Pascal's Triangle Row Generator");
		System.out.println("                                 ");
		System.out.print("Please choose a number: "); 
		try{
			int Menu = In.nextInt();
			
			CP choice = new CP();
			SN choice2 = new SN();
			PT choice3 = new PT();
			
			if (Menu == 1){
				
				choice.display1();	
				
			}
			
			else if(Menu == 2){
				
				choice2.Sterling();
				
			}
			
			else if(Menu == 3){
				
				choice3.Pascal();
				
				
			}
			
			else{
				System.out.println("  ");
				System.out.println("Invalid Input");
				main(null);
				
			}
		}catch(Exception e){
			
			System.out.println("          ");
			System.out.println("The Program only allow Numeric values!");
			main(null);
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
