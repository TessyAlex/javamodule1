package StateMachine;

import java.util.Scanner;

public class iFunction implements StateIface {
	
	BankDemo[] objarr= new BankDemo[2];
	Scanner sc= new Scanner(System.in);
	
	@Override
	public double amount() {
		int f=0;
		//while(f<3)
		//{
		System.out.println("Enter your amount");
		Scanner sc= new Scanner(System.in);
		double amt=sc.nextDouble();// amt= user input, 2000
		BankDemo deno= new BankDemo();
		double d= deno.denomination();
		BankDemo b1= new BankDemo();
		for(int k=0;k<objarr.length;k++)
		{
			if(d==objarr[k].value)
				int co= objarr[k].getdCount();
		}
		if(amt%d==0){
				double div=amt/d;
				if(div<b1.co) {
					
			}
		
		}	
		
	}
		

	@Override
	public double denomination() {
		System.out.println("The available denominations are:");	
		for(int i=0;i<objarr.length;i++)
		{
			System.out.println(objarr[i].value);
		}
		System.out.println("Enter your denominations");
		Scanner sc= new Scanner(System.in);
		int dnt= sc.nextInt();
		for(int j=0; j<objarr.length;j++)
		{
			if(dnt==objarr[j].value)
				return objarr[j].getValue();
			else
				System.out.println("denomination is not correct");
		}
		
		
	}

	@Override
	public double balance(double bln) {
		
		return 0;
	}

}
