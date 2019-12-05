package projectdiscrete;
import java.util.Scanner;
import java.math.*;

public class PWOR extends CP{

	public static BigInteger Permutation(long N,long R){
		BigInteger NRResult = new BigInteger("1");
		BigInteger NMRResult = new BigInteger("1");
		BigInteger FResult = new BigInteger("0");
		long L = N - R;
		
		System.out.println("         --Results--                          ");
		
		// for n!
		for(long i = 1;i<=N;i++){
			
			NRResult = NRResult.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                   ");
		System.out.println("The Factorial of "+ N + " is " + NRResult);
		
		//for (n-r)!
		for(long i=1 ; i<=L ; i++ ){
			
			NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
		}
		System.out.println("                                   ");
		System.out.println("The N - R factoral is "+ NMRResult);
		System.out.println("                                   ");
		
		FResult = NRResult.divide(NMRResult);
		return FResult;
	
	}
	
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
		else{
			
			System.out.println("Thank You");
		}

	}
	public static void WOREP(){

		
		Scanner In = new Scanner(System.in);
		
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		System.out.println("--Permutations without Repetitions--              ");
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
		
		else if(R > N){ 
			System.out.println("                                   ");
			System.out.println("The 'r' Value Should Be Less Than Or Equal To 'n' Value");
			exit();
		}

		else{
			System.out.println("                                   ");

			System.out.println("------------------------------------");
			
			System.out.println(" "+ N +"P"+R+" is "+Permutation(N, R));
			exit();
		}
		
	}
}
