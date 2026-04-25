package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass
{
//	 WebDriver driver;
    @Test
    public void verify_account_registration() {
        
    	logger.info("******striting TC001_AccountRegistrationTest  *****"); 
    	
    	try {	
		HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        logger.info("Clicked on Register link"); 
        
        
        hp.clickRegister();
        logger.info("Providing customer details...."); 
        
        AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
        
        regpage.setFirstName(randomString1().toUpperCase());
        regpage.setLastName(randomString1().toUpperCase());
        regpage.setEmail(randomString1() + "@gmail.com");       //randomly generated the email
        regpage.setPhone(randomAlphaNumeric());
        
        String password=randomAlphaNumeric();
        
        regpage.setPassword(password);
        regpage.setConfirmPassword(password);
        
        regpage.setPrivacypolicy();
        regpage.clickContinue() ;
    }
    
    
    	catch(Exception e)
    	{
    		logger.error("Test failed...");
//    		logger.debug("Debug logs..");
    		Assert.fail();
    	}
    }
}
    
    

