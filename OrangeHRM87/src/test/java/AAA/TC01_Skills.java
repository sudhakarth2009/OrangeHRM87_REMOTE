package AAA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Skills {
	
	
	WebDriver driver;
	
	//Step1
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String SkillName="JAVA14",SKilldecsr="JAVA14 descr";
	
		//step1
		 @DataProvider(name = "Orange1")
		  public static Object[][] Test1() throws Exception {
		 
		        return new Object[][] { 
		        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","JAVA14","JAVA14 descr" },
		        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","JAVA15","JAVA15 descr" },
		        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","JAVA16","JAVA16 descr" }
		        	};
		  }
		 
	
	
  @Test(dataProvider="Orange1")//Step2 
  public void AddSkillsTest(String TestURL,String UserName,String Password,
		  String SkillName,String SKilldecsr)throws Exception 
  {
	  
	
	  TC01_Skills T1= new TC01_Skills();
	  
	  T1.OpenCHromeBrowser();
	  T1.OpenOrangeHRM(TestURL);
	  T1.Login(UserName,Password);
	  T1.AddSKills(SkillName,SKilldecsr);
	  T1.CloseBrowser();

	  
  }
  

  
  public void AddSKills(String SkillName1,String SKilldecsr1) throws Exception
  {
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_Qualifications")).click();
	  findElement(By.id("menu_admin_viewSkills")).click();
	  findElement(By.id("btnAdd")).click();
	  findElement(By.id("skill_name")).sendKeys(SkillName1);
	  findElement(By.id("skill_description")).sendKeys(SKilldecsr1);
	  findElement(By.id("btnSave")).click();
  }
  
  public void OpenCHromeBrowser() throws Exception
  {
	  	//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  public void OpenOrangeHRM(String TestURL1) throws Exception
  {
		//Open Orange HRM
		driver.get(TestURL1);
  }
  
  
  public void Login(String UserName1,String Password1) throws Exception
  {
		
		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
  }
  
  public void CloseBrowser() throws Exception
  {
	  driver.quit();
  }
  
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

  
  
}
