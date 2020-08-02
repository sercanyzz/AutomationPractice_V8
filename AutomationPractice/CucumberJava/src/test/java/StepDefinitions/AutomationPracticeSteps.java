package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPracticeSteps 
{
	WebDriver driver=null;

	@Given("Open Chrome Browser")
	public void open_Chrome_Browser() throws InterruptedException 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");	
		driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);		
		Thread.sleep(2000);		
		driver.manage().window().maximize();
	}

	@And("Open Automation Practice page")
	public void open_Automation_Practice_page() throws InterruptedException 
	{
		driver.navigate().to("http://automationpractice.com/");		
		Thread.sleep(2000);
	}

	@When("Sign Up")
	public void sign_Up() throws InterruptedException 
	{
		Random random = new Random();
		int x = random.nextInt(100000);  //rastgele sayý üretir.

		WebElement signIn = driver.findElement(By.className("login"));
		highLight(signIn, driver);

		signIn.click();	
		Thread.sleep(2000);
		driver.findElement(By.id("email_create")).sendKeys("abc"+x+"@hotmail.com");	 //rastgele mail üretilir.
		Thread.sleep(1500);
		WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
		highLight(createAccount, driver);
		Thread.sleep(1000);
		createAccount.click();
		Thread.sleep(1000);
		driver.findElement(By.id("customer_firstname")).sendKeys("test");	
		Thread.sleep(1500);
		driver.findElement(By.id("customer_lastname")).sendKeys("deneme");	
		Thread.sleep(1500);
		driver.findElement(By.id("passwd")).sendKeys("testdeneme1234");	
		Thread.sleep(1500);
		driver.findElement(By.id("address1")).sendKeys("Acýbadem");	
		Thread.sleep(1500);
		driver.findElement(By.id("city")).sendKeys("Ýstanbul");	
		Thread.sleep(1500);
		driver.findElement(By.id("id_state")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//option[contains(text(),'Alabama')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("postcode")).sendKeys("12345");	
		Thread.sleep(1500);
		driver.findElement(By.id("phone_mobile")).sendKeys("5334264434");	
		Thread.sleep(1500);

		WebElement regiSter = driver.findElement(By.id("submitAccount"));
		highLight(regiSter, driver);
		Thread.sleep(1000);
		regiSter.click();

		Thread.sleep(1500);
		WebElement logo = driver.findElement(By.id("header_logo"));
		highLight(logo, driver);
		Thread.sleep(1000);
		driver.findElement(By.id("header_logo")).click();  //anasayfaya gidilir.
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.xpath("//span[contains(text(),'test deneme')]"));  //kullanýcý oluþtuðu kontrol edilir.
		highLight(account, driver);				
		Actions action = new Actions(driver);
		action.moveToElement(account).build().perform();		

		Thread.sleep(1500);
	}

	@And("Add products to the cart")
	public void add_products_to_the_cart() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement dresSes = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));			
		highLight(dresSes, driver);				
		Thread.sleep(1000);
		dresSes.click();
		//		Actions action = new Actions(driver);
		//		action.moveToElement(dresSes).build().perform();
		Thread.sleep(2000);
		WebElement summerDresses = driver.findElement(By.xpath("//div[@id='categories_block_left']//li[3]//a[1]"));  
		highLight(summerDresses, driver);				
		Thread.sleep(1000);
		summerDresses.click();

		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1500);
		WebElement produCt = driver.findElement(By.xpath("//li[1]//div[1]//div[2]//h5[1]//a[1]"));  
		highLight(produCt, driver);	
		Thread.sleep(1000);
		//		action.moveToElement(produCt).build().perform();	
		produCt.click();

		Thread.sleep(2000);
		WebElement addToChart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));  
		highLight(addToChart, driver);				
		Thread.sleep(2000);
		addToChart.click();

		Thread.sleep(2500);
		WebElement close_bTn = driver.findElement(By.xpath("//span[@class='cross']"));  		
		highLight(close_bTn, driver);				
		Thread.sleep(1000);
		close_bTn.click();

		//Anasayfaya Dön
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-750)");
		Thread.sleep(1500);
		WebElement logo2 = driver.findElement(By.id("header_logo"));
		highLight(logo2, driver);				
		Thread.sleep(1500);
		logo2.click();		

		//Search Summer
		Thread.sleep(1500);
		WebElement searchBar = driver.findElement(By.id("search_query_top"));  
		highLight(searchBar, driver);				
		Thread.sleep(1500);
		searchBar.sendKeys("Summer");
		Thread.sleep(1500);
		WebElement searchBtn = driver.findElement(By.xpath("(//button[@type='submit'])"));  
		highLight(searchBtn, driver);				
		Thread.sleep(1500);
		searchBtn.click();		
		//		searchBar.sendKeys(Keys.ENTER);		

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(1500);
		WebElement produCt2 = driver.findElement(By.xpath("//li[3]//div[1]//div[2]//h5[1]//a[1]"));  
		highLight(produCt2, driver);	
		Thread.sleep(1000);		
		//		action.moveToElement(produCt2).build().perform();			
		produCt2.click();

		Thread.sleep(1500);
		WebElement addToChart2 = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));  
		highLight(addToChart2, driver);				
		Thread.sleep(1500);
		addToChart2.click();

		Thread.sleep(2500);
		WebElement close_bTn2 = driver.findElement(By.xpath("//span[@class='cross']"));  		
		highLight(close_bTn2, driver);				
		Thread.sleep(1000);
		close_bTn2.click();

		//Anasayfaya Dön
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-750)");
		Thread.sleep(1500);
		WebElement logo3 = driver.findElement(By.id("header_logo"));
		highLight(logo3, driver);				
		Thread.sleep(1500);
		logo3.click();

		//CART'TAN ÜRÜN BÝLGÝLERÝ KONTROLÜ
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-750)");
		Thread.sleep(1500);
		WebElement caRt = driver.findElement(By.xpath("//b[contains(text(),'Cart')]"));  
		highLight(caRt, driver);	
		Thread.sleep(1000);
		//		action.moveToElement(caRt).build().perform();	
		caRt.click();

		//		Thread.sleep(2000);
		//		WebElement checkOut = driver.findElement(By.xpath("//span[contains(text(),'Check out')]"));  
		//		highLight(checkOut, driver);				
		//		Thread.sleep(1500);
		//		checkOut.click();

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1500);
		WebElement product1 = driver.findElement(By.linkText("Printed Summer Dress"));  
		highLight(product1, driver);	
		Thread.sleep(1000);
		//		String text = product1.getAttribute("linkText");
		String productName1 = product1.getText();

		Thread.sleep(1500);
		WebElement product2 = driver.findElement(By.linkText("Printed Chiffon Dress"));  
		highLight(product2, driver);	
		Thread.sleep(1000);
		String productName2 = product2.getText();

		Thread.sleep(1500);
		WebElement price1 = driver.findElement(By.xpath("//tr[1]//td[6]//span[1]"));  
		highLight(price1, driver);	
		Thread.sleep(1000);

		Thread.sleep(1500);
		WebElement price2 = driver.findElement(By.xpath("//tr[2]//td[6]//span[1]"));  
		highLight(price2, driver);	
		Thread.sleep(1000);

		//		Thread.sleep(1500);
		//		WebElement count1 = driver.findElement(By.xpath("//tr[@id='product_5_19_0_355419']//input[2]"));  
		//		highLight(count1, driver);	
		//		Thread.sleep(1000);
		//		String productCount1 = count1.getAttribute("value");
		//		
		//		Thread.sleep(1500);
		//		WebElement count2 = driver.findElement(By.xpath("//tr[@id='product_7_34_0_355419']//input[2]"));  
		//		highLight(count2, driver);	
		//		Thread.sleep(1000);
		//		String productCount2 = count2.getAttribute("value");

		if(product1.isDisplayed() && product2.isDisplayed())
		{
			Thread.sleep(2000);			
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1500);
			WebElement proceedToCheckout = driver.findElement(By.xpath("//div[@id='center_column']//p//a//span"));  
			highLight(proceedToCheckout, driver);				
			Thread.sleep(1500);
			proceedToCheckout.click();
		}		

		Thread.sleep(2000);
	}

	@And("Proceed to checkout")
	public void proceed_to_checkout() throws InterruptedException 
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(1500);
		WebElement proceedToCheckout = driver.findElement(By.xpath("//button[@name='processAddress']"));  
		highLight(proceedToCheckout, driver);	
		Thread.sleep(1000);
		proceedToCheckout.click();

		Thread.sleep(2000);
		WebElement agreeMent = driver.findElement(By.xpath("//input[@id='cgv']"));  
		highLight(agreeMent, driver);	
		Thread.sleep(1000);
		agreeMent.click();

		Thread.sleep(1500);
		WebElement proceedToCheckout2 = driver.findElement(By.xpath("//form[@id='form']//p//button//span"));  
		highLight(proceedToCheckout2, driver);	
		Thread.sleep(1000);
		proceedToCheckout2.click();

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(1500);
		WebElement payByBank = driver.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]"));  
		highLight(payByBank, driver);	
		Thread.sleep(1000);
		payByBank.click();

		Thread.sleep(2000);
		WebElement conFirm = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));  
		highLight(conFirm, driver);	
		Thread.sleep(1500);
		conFirm.click();
	}

	@Then("Order history and details")
	public void order_history_and_details() throws InterruptedException 
	{
		Thread.sleep(2500);
		WebElement acCount = driver.findElement(By.xpath("//span[contains(text(),'test deneme')]"));  
		highLight(acCount, driver);	
		Thread.sleep(1500);
		acCount.click();		

		Thread.sleep(2000);
		WebElement orderHistory = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]"));  
		highLight(orderHistory, driver);	
		Thread.sleep(1500);
		orderHistory.click();	

		Thread.sleep(1500);
		WebElement deTails = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]/span"));  
		highLight(deTails, driver);	
		Thread.sleep(1000);
		deTails.click();		

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1500);
		WebElement producT1 = driver.findElement(By.xpath("//label[contains(text(),'Printed Summer Dress - Color : Yellow, Size : S')]"));  
		highLight(producT1, driver);	
		Thread.sleep(1000);
		producT1.click();	

		Thread.sleep(1500);
		WebElement producT2 = driver.findElement(By.xpath("//label[contains(text(),'Printed Chiffon Dress - Color : Yellow, Size : S')]"));  
		highLight(producT2, driver);	
		Thread.sleep(1000);
		producT2.click();	

//		driver.quit();
	}

	//Functions
	public static void highLight(WebElement element, WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; background: yellow; border: 2px dashed red;");  //dashed instead of solid
		Thread.sleep(500);
		//js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		//Thread.sleep(500);	      
	}
}