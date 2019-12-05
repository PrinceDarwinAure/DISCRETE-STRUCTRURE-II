package projectdiscrete;
import java.util.*;
import java.math.*;

public class SN extends Index {
	public static BigInteger Sterlingloop(long N,long R){
		
		long Temp1 = R;
		long RLast = R;
		BigInteger Factorial = new BigInteger("1");
		BigInteger LastProcess = new BigInteger("0");
		BigInteger FinalProcess = new BigInteger("0");
		BigInteger CompareFinal = new BigInteger("0");
		BigInteger Oliburboard = new BigInteger("-1");
		for(int Sub = 0;Sub<R;Sub++){
			
			FinalProcess=FinalProcess.add(SterlingSol(N,R,Sub,Temp1));
			
			Temp1--;
		}
		
		System.out.println("The Sum of All Processed Numbers Is: "+FinalProcess);
		//For R!
		for(int i = 1;i<=RLast;i++){
					
			Factorial = Factorial.multiply(BigInteger.valueOf(i));
					
		}
		System.out.println("The Factorial of "+R+" is "+Factorial);
		LastProcess=FinalProcess.divide(Factorial);
		if (LastProcess.compareTo(CompareFinal) < 0){			
			LastProcess = LastProcess.multiply(Oliburboard);
			return LastProcess;
		}
		else{
			return LastProcess;
			
		}
	}
	

	public static BigInteger SterlingSol(long N, long R,long Sub,long Temp1){
		long NN = N;
		//Substituting Variables
		long T1 = Sub; 
		//For Combination Substitutes
		long N2 = R;
		long R2 = 0;
		
		//For PowerMultiplier Substitutes
		long T2 = R;
		long J = 0;
		long sub1 = T2 - Sub;
		
		//forPowerMultiplierFormulas
		int PWResult = 1;
		int Multiplier = -1;
		BigInteger Finalized = new BigInteger("0");
		
		//for Combination Formulas
		BigInteger NRResult = new BigInteger("1");
		BigInteger RResult = new BigInteger("1");
		BigInteger NMRResult = new BigInteger("1");
		BigInteger FResult;
		long C = N2 - Sub;
		BigInteger DResult;
		
		//forPowerMultiplierFormulas2
		BigInteger PWResult2 = new BigInteger("1");
		
		//CompiledFormulas
		BigInteger Final = new BigInteger("0");
		BigInteger Final2 = new BigInteger("0");
		BigInteger VFinal = new BigInteger("0");
		
		System.out.println("                                      ");
		System.out.println("               --Results--            ");
			
				//for(-1)^J
				for(;T1<=R;T1++){
			
					PWResult *= Multiplier;
			
				}
				
				System.out.println("The Value For (-1)^i is: "+ PWResult);
			
				//For Combination Structure
				// for n!
				for(long i = 1;i<=N2;i++){
					
					NRResult = NRResult.multiply(BigInteger.valueOf(i));
					
				};
				
				//for r!
				for(long i = 1;i<=Sub;i++){
					
					RResult = RResult.multiply(BigInteger.valueOf(i));
					
				}
				
				//for (n-r)!
				for(long i=1 ; i<=C ; i++ ){
					
					NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
					
				}
				
				
				//for r!(n-r)!
				DResult = RResult.multiply(NMRResult);

				//for n!/r!(n-r)!
				FResult = NRResult.divide(DResult);
				
				
				
				//For (R-i)^N
				while(N != 0){
					
					PWResult2 = PWResult2.multiply(BigInteger.valueOf(sub1));
					
					N--;
					
				}
				
				
				//multiplying (-1)^i * (J Choose i) * (J - i)^n
				Final = FResult.multiply(BigInteger.valueOf(PWResult));
				Final2 = Final.multiply(PWResult2);
				
				//checking
				System.out.println(N2+"C"+Sub+" is: "+FResult);
				System.out.println(T2+" - "+Sub+" = "+ sub1 );
				System.out.println("("+ sub1 +")^" +NN+" is: "+PWResult2);
				System.out.println("For "+Sub+" loop is: "+Final2);
				return Final2;
	}	

	public static void exit(){
		
		
		Scanner In = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("------------------------------------");
		System.out.println("           --End of Program--       ");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Do you want to continue? "); int choice = In.nextInt();


		
		if (choice == 1){
			
			main(null);
			
		}
		else{
			
			System.out.println("Thank You");
			
		}

	}
	
	public static void Sterling() {
		Scanner In = new Scanner(System.in);		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		System.out.println("      --Sterling Number Of Second Case--              ");
		System.out.print("Please Enter A Number For n Value: ");long N = In.nextLong();
		System.out.print("Please Enter Another Number For r Value: ");long R = In.nextLong();
		
		if(R < 0 || N < 0 ){
			
			System.out.println("The 'n' value and 'r' value should not be negative ");
			exit();
			
		}
		
		else if(R > N){ 
			
			System.out.println("                                   ");
			System.out.println("The 'r' Value Should Be Less Than Or Equal To 'n' Value");
			exit();
			
		}
		
		else if(R > N){ 
			
			System.out.println("                                   ");
			System.out.println("The 'r' value should be less than or equal to n value");
			exit();
			
		}
		
		else if(R > 500 || N > 500){
			
			System.out.println("The Limit Has Exceeded Number Should Be Less Than 500");
			exit();
			
		}

		else{
			
			System.out.println("                                   ");
			System.out.println("------------------------------------");
			System.out.println("The Sterling of "+N+" and "+R+" is: "+Sterlingloop(N, R));
			exit();
			
		}
		

	}

}