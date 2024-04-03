package Pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.messages.types.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;





public class yogaPage {
	
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	
	By createAccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	By Signin = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	
	
	By shopYogaBtn = By.xpath("//span[text()='Shop New Yoga']");

	By NeveStudioJacket = By.xpath("//img[@alt='Neve Studio Dance Jacket']");
			
	
	By sizeXS = By.id("option-label-size-143-item-166");
	
	By sizeS = By.xpath("//*[@id=\"option-label-size-143-item-167\"]");
	
	By sizeM = By.xpath("//*[@id=\"option-label-size-143-item-168\"]");
	By sizeL = By.xpath("//*[@id=\"option-label-size-143-item-169\"]");

	By sizeXL = By.xpath("//*[@id=\"option-label-size-143-item-170\"]");
    By clrBlack = By.xpath("//*[@id=\"option-label-color-93-item-49\"]");
    By clrBlue = By.xpath("//*[@id=\"option-label-color-93-item-50\"]");
    By clrOrange = By.xpath("//*[@id=\"option-label-color-93-item-51\"]");
    By QtyText = By.xpath("//*[@id=\"qty\"]");
    By addToCartBtn = By.xpath("//*[@id=\"product-addtocart-button\"]");
    By cartIcon = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    By proceedToCartBtn = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
    By inputEmail = By.xpath("//*[@id=\"customer-email\"]");
    //By inputFirstName = By.xpath("//*[@id=\"K8VX9RS\"]");
    By inputFirstName = By.name("firstname");
      By inputLastName = By.xpath("//*[@id=\"V7QV1XE\"]");
    
      By inputCompanyName = By.xpath("//*[@id=\"WIG0PN2\"]");
    By inputStreetaddress = By.xpath("//*[@id=\"SAIIT4O\"]");
    By inputCity = By.xpath("//*[@id=\"RR4D67Q\"]");
    By drpdownState = By.xpath("//*[@id=\"DPY57VK\"]");
    By inputZipCode = By.xpath("//*[@id=\"D9U33HA\"]");
    By drpdownCountry = By.xpath("//*[@id=\"XDLROQO\"]");
    By inputPhoneNumber = By.xpath("//*[@id=\"FEULS0D\"]");
    By ShippingMtdTable = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[2]/span/span");
    By ShippingMtdFixed = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input");
    By nextBtn = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span");
    //By placeOrderBtn = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
    //By placeOrderBtn = By.className("checkout");
    By PlaceOrderBtn = By.xpath("//button[@title='Place Order']");
    By signUpFirstName = By.xpath("//*[@id=\"firstname\"]");
    By signUpLastName = By.xpath("//*[@id=\"lastname\"]");
    By signEmail = By.xpath("//*[@id=\"email_address\"]");
    By signPassword = By.xpath("//*[@id=\"password\"]");
    By signConfirmPassword = By.xpath("//*[@id=\"password-confirmation\"]");
    By createAnAccountBtn = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
    //By orderNumber = By.className("checkout-success");
  By orderNumber = By.xpath("//p[text()='Your order # is: ']");
  
  
    public void LaunchBrowser()
    {
    	
    
    driver.get("https://magento.softwaretestingboard.com/");
    driver.manage().window().maximize();
    
   
    }
    public void navigateToShopPage()
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    	
    	By shopButtonLocator = By.xpath("//span[contains(text(),'Shop New Yoga')]");
    	WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(shopButtonLocator));
    	btn.click();
    	
    	
    }
    
    
    public void selectCategory()
    {
    	
    	WebElement nsj = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(NeveStudioJacket));
    	
        nsj.click();
    	
        	
    		
    }
    public void productDetails() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    	WebElement size = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(sizeXS)); 
    	//WebElement size = driver.findElement(sizeXS);
    	size.click();
    	WebElement color = driver.findElement(clrBlue);
    	color.click();
    	WebElement quantity = driver.findElement(QtyText);
    	quantity.clear();
    	quantity.sendKeys("10");
    	
    	
    	WebElement cartbutton = (WebElement)wait.until(ExpectedConditions.presenceOfElementLocated(addToCartBtn)); 
    	
    	cartbutton.click();
    	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);   
    }
    
    public void proceedToCart() throws InterruptedException
    
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
    	
    	Thread.sleep(3000);
    	
    	WebElement icon =
    		    new WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(
    		    ExpectedConditions.presenceOfElementLocated(cartIcon));
    	
    	icon.click();
    	 
    }
    public void proceedTocheckOut()
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
    WebElement btn = driver.findElement(proceedToCartBtn);
    btn.click();
    }
    public void shippingAddress() throws InterruptedException
    {
    	
    	WebElement email = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(inputEmail)); 
    			//driver.findElement(inputEmail);
    	email.sendKeys("manitest@yopmail.com");
    	Thread.sleep(3000);
    	driver.findElement(By.name("firstname")).sendKeys("mani");
    
    	driver.findElement(By.name("lastname")).sendKeys("testing");
    	
    	driver.findElement(By.name("company")).sendKeys("TSPL");
    	
    	driver.findElement(By.name("street[0]")).sendKeys("sea drive");
    	
    	driver.findElement(By.name("city")).sendKeys("california");
    	
    	WebElement state = driver.findElement(By.name("region_id"));
    	Select dropdown = new Select(state);
    	dropdown.selectByVisibleText("California");
    	driver.findElement(By.name("postcode")).sendKeys("95112");
    	WebElement country = driver.findElement(By.name("country_id"));
    	Select dropdowncountry = new Select(country);
    	dropdowncountry.selectByVisibleText("United States");
    	driver.findElement(By.name("telephone")).sendKeys("9876543210");
    	WebElement rate = driver.findElement(ShippingMtdTable);
    	rate.click();
    	WebElement next = driver.findElement(nextBtn);
    	next.click();
    	
    }
    public void placeOrder() throws InterruptedException
    {
    //WebElement placeorder = driver.findElement(PlaceOrderBtn);
    	JavascriptExecutor js = (JavascriptExecutor) driver;

    	
    	js.executeScript("window.scrollBy(0, 1000)");

    	js.executeScript("window.scrollBy(0, -500)");
    	Thread.sleep(5000);
    WebElement placeorder = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderBtn)); 
    placeorder.click();
    
    }
    public void orderConfirmation()
    {
    	WebElement orderNumberElement = driver.findElement(orderNumber);
    	String orderNumber = orderNumberElement.getText();
    	System.out.println("Order number: " + orderNumber);
    	
    }
    
   
}
