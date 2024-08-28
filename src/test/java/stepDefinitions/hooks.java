package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("*************************************");
			System.out.println("Set up entries in Netbanking database");
	}
	
	@After 
	public void tearDown()
	{
		System.out.println("clear the entries");
		System.out.println("*************************************");
	
	}
	
	
	@Before("@MortgageBanking")
	public void mortgageSetup()
	{
		System.out.println("*************************************");
		System.out.println("Set up entries in Mortgage database");
	}


}
