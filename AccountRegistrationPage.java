package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
        
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//input[@id='input-firstname']")WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='input-password']")WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")WebElement txtConfirmpassword;
	
//	driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
	
	@FindBy(xpath="//input[@name='agree']")WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")WebElement btnContinue;
	
	
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String cnfpassword) {
		txtConfirmpassword.sendKeys(cnfpassword);
	}
	
	public void setPrivacypolicy() {
		chkdPolicy.click();
	}
	
//	public void clickContinue() {
//		btnContinue.click();
//		
//		//btncontinue.submit();
//	}

	public void clickContinue() {
		btnContinue.click();
		
			}
}






