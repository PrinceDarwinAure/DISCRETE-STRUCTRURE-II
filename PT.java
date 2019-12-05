package projectdiscrete;
import java.math.*;
import java.util.Scanner;

public class PT extends Index{
	
	public static void Pascalloop(long N){
		
		// to loop the Combination Process
		for(int U = 0;U <= N;U++){
			int Sub = U;
			System.out.print(" "+Pascal(N,Sub) +"  ");
			
		}
		 
	}
	
	public static BigInteger Pascal(long N, long Sub){
		BigInteger NRResult = new BigInteger("1");
		BigInteger RResult = new BigInteger("1");
		BigInteger NMRResult = new BigInteger("1");
		BigInteger FResult;
		long c = N - Sub;
		BigInteger DResult;
		
		// for n!
		for(long i = 1;i<=N;i++){
			
			NRResult = NRResult.multiply(BigInteger.valueOf(i));
			
		}

		
		//for r!
		for(long i = 1;i<=Sub;i++){
			
			RResult = RResult.multiply(BigInteger.valueOf(i));
			
		}
		
		
		//for (n-r)!
		for(long i=1 ; i<=c ; i++ ){
			
			NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
			
		}
		
		
		//for r!(n-r)!
		DResult = RResult.multiply(NMRResult);
		
		//for n!/r!(n-r)!
		FResult = NRResult.divide(DResult);
		
		return FResult;
	
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
	
	public static void Pascal(){
		
		Scanner In = new Scanner(System.in);
		
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		System.out.println("      --Pascal Triangle Row Generator--              ");
		System.out.print("Please Enter A Number For n Value: ");long N = In.nextLong();
		
		if( N < 0 ){
			
			System.out.println("The 'n' value and 'r' value should not be negative ");
			exit();
			
		}
		
		else if(N > 500){
			
			System.out.println("The Limit Has Exceeded Number Should Be Less Than 500");
			exit();
			
		}
		
		else{
			
			System.out.println("                                   ");
			System.out.println("------------------------------------");
			System.out.println("The Row "+ N + " is: ");
			Pascalloop(N);
			exit();
			
		}
	}
}
