package projectdiscrete;
import java.math.*;
import java.util.Scanner;

public class PWR extends CP {
	
	public static BigInteger PWRepetition(long N, long R){
		
		BigInteger PResult = new BigInteger("1");
		while(R != 0){
			
			PResult = PResult.multiply(BigInteger.valueOf(N)) ;
			System.out.println(PResult);
			R --;
			
		}
		System.out.println("             --Result--                   ");
		System.out.println("                                          ");
		return PResult;
	}
	
	public static void exit(){
		
		Index main = new Index();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("------------------------------------");
		System.out.println("           --End of Program--       ");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Do you want to continue? "); int choice = In.nextInt();


		
		if (choice == 1){
			
			main.main(null);
			
		}
		else{
			
			System.out.println("Thank You");
			
		}

	}
	public static void WREP(){
		
		Scanner In = new Scanner(System.in);
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		System.out.println("      --Permutation with Repetitions--              ");
		
		System.out.print("Please Enter A Number For n Value: ");long N = In.nextLong();
		System.out.print("Please Enter Another Number For r Value: ");long R = In.nextLong();
		
		if(R < 0 || N < 0 ){
			
			System.out.println("The 'n' value and 'r' value should not be negative ");
			exit();
			
		}
		
		else if(R > 500 || N > 500){
			
			System.out.println("The Limit Has Exceeded, Number Should Be Less Than 500");
			exit();
			
		}
		
		else{
			
			System.out.println("                                   ");

			System.out.println("------------------------------------");
			
			System.out.println(" "+ N +"P"+ R +" with repetition is "+PWRepetition(N, R));
			exit();
			
		}	
		
	}
}
