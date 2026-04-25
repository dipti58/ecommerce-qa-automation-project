package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {

     public  WebDriver driver;
	 public Logger logger;
     public Properties p;
     
    @BeforeClass
    @Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
    	//Loading config.properties file
    	FileReader file=new FileReader("./src//test//resources//config.properties");
    	p=new Properties();
    	p.load(file);
    	
    	logger=LogManager. getLogger(this.getClass());
    	
    	
    	
    	
    	switch(br.toLowerCase())
    	{
    	case "chrome": driver=new ChromeDriver(); break;
    	case "edge" : driver=new EdgeDriver();break;
    	case "firefox": driver=new FirefoxDriver();break;
    	default: System.out.println("Invalid browser name..");return;
    	}
    	
    	
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
	}
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    	
    }
    
    @SuppressWarnings("deprecation")
	public String randomString1() {
        return RandomStringUtils.randomAlphabetic(5);
    }
    
	@SuppressWarnings("deprecation")
	public String randomNumber() {
        return RandomStringUtils.randomNumeric(5);
    }
    
    @SuppressWarnings("deprecation")
	public String randomAlphaNumeric() {
        return RandomStringUtils.randomAlphanumeric(8);
    }

}
