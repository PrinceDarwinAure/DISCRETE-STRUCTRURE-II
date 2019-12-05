package projectdiscrete;
import java.util.*;
import java.math.BigInteger;

public class CWP extends CP {
	
	public static BigInteger CWRepetition(long N,long R){
		
		long N1 = N + R -1;
		BigInteger N1Result = new BigInteger("1");
		long N2 = N - 1;
		BigInteger N2Result = new BigInteger("1");
		BigInteger RResult = new BigInteger("1");
		BigInteger FResult = new BigInteger("0");
		BigInteger FResult2 = new BigInteger("0");
		
	
		System.out.println("                                      ");
		System.out.println("               --Results--            ");
		
		
		// for (n+r-1)!
		for(long i = 1;i<=N1;i++){
	 
			N1Result = N1Result.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                     ");
		System.out.println("The Factorial of (n + r - 1) is: "+ N1Result);
		
		
		//for r!
		for(long i = 1;i<=R;i++){
			
			RResult = RResult.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                     ");
		System.out.println("The Factorial of r is: "+ RResult);
		
		
		//for (n - 1)
		for(long i = 1;i<=N2;i++){ 
			
			N2Result = N2Result.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("                                     ");
		System.out.println("The Factorial of (n - 1) is: "+ N2Result);
		System.out.println("                                     ");
		
		//for r!(n-1)!
		FResult = RResult.multiply(N2Result);
		System.out.println("The answer in r!(n-1)! is "+FResult);
		//for (n + r - 1)! / r!(n-1) 
		FResult2 = N1Result.divide(FResult);
		
		return FResult2;
		
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
		
		System.out.println("      --Combinations with Repetitions--              ");
		System.out.print("Please Enter A Number For n Value: ");long N = In.nextLong();
		System.out.print("Please Enter Another Number For r Value: ");long R = In.nextLong();
		
		if(R < 0 || N < 0 ){
			
			System.out.println("The 'n' value and 'r' value should not be negative ");
			exit();
			
		}
		
		else if(R > 500 || N > 500){
			
			System.out.println("The Limit Has Exceeded Number Should Be Less Than 500");
			exit();
			
		}
		
		else{
			
			System.out.println("                                   ");
			System.out.println("------------------------------------");
			System.out.println(" "+ N +"C"+ R +" with repetition is "+CWRepetition(N, R));
			exit();
			
		}
		
		
		
	}

}
