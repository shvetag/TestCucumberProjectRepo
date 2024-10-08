package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("*************************************");
			System.out.println("Set up entries in Netbanking database.");
	}
	
	@After 
	public void tearDown()
	{
		System.out.println("clear the entries");
		System.out.println("*************************************");
		System.out.println("*************************************");
		//this line added by owner
		System.out.println("Below changes added through develop branch");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("develop branch changes done");
		
		System.out.println("Below changes added through develop branch of TCPS");
		System.out.println("*************************************");
		System.out.println("develop branch changes done");
		
	}
	
	
	@Before("@MortgageBanking")
	public void mortgageSetup()
	{
		System.out.println("*************************************");
		System.out.println("Set up entries in Mortgage database");
	}


}
