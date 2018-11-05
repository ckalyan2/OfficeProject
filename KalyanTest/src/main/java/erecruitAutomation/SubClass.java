package erecruitAutomation;

import java.util.concurrent.TimeUnit;

import erecruitAutomation.BaseClass;
import erecruitAutomation.CandidateCreation;

public class SubClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BaseClass BC = new BaseClass();
		CandidateCreation CC = new CandidateCreation();
		BC.LoginPage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//CC.FlightSearch();
		//CC.StudentDiscount();
		BC.AppLoin();
		BC.AddCandidatewithoutResume();
		//BC.AddCandidatewithResume();
		BC.CloseApp();
	}
}
