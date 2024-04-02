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
			
	By sizeXS = By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
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
    By inputFirstName = By.xpath("//*[@id=\"HNCA8QJ\"]");
  
    By inputLastName = By.xpath("//*[@id=\"E9NAGN3\"]");
    By inputCompanyName = By.xpath("//*[@id=\"PNYEQS0\"]");
    By inputStreetaddress = By.xpath("//*[@id=\"SAIIT4O\"]");
    By inputCity = By.xpath("//*[@id=\"RR4D67Q\"]");
    By drpdownState = By.xpath("//*[@id=\"DPY57VK\"]");
    By inputZipCode = By.xpath("//*[@id=\"D9U33HA\"]");
    By drpdownCountry = By.xpath("//*[@id=\"XDLROQO\"]");
    By inputPhoneNumber = By.xpath("//*[@id=\"FEULS0D\"]");
    By ShippingMtdTable = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[2]/span/span");
    By ShippingFixed = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input");
    By nextBtn = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span");
    By placeOrderBtn = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
    By signUpFirstName = By.xpath("//*[@id=\"firstname\"]");
    By signUpLastName = By.xpath("//*[@id=\"lastname\"]");
    By signEmail = By.xpath("//*[@id=\"email_address\"]");
    By signPassword = By.xpath("//*[@id=\"password\"]");
    By signConfirmPassword = By.xpath("//*[@id=\"password-confirmation\"]");
    By createAnAccountBtn = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
    
    public void LaunchBrowser()
    {
    	
    //WebDriver driver = new ChromeDriver();
    driver.get("https://magento.softwaretestingboard.com/");
    driver.manage().window().maximize();
    
   
    }
    public void navigateToShopPage()
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    	//WebElement btn  = driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div/div[3]/div[1]/a/span/span[1]"));
    	//By shopButtonLocator = By.xpath("//*[@id='maincontent']/div[3]/div/div[3]/div[1]/a/span/span[1]");
    	//String shopYogabutton = "body.cms-home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.columns:nth-child(4) div.column.main div.widget.block.block-static-block:nth-child(6) div.blocks-promo:nth-child(1) a.block-promo.home-main span.content.bg-white:nth-child(2) > span.action.more.button";
    	By shopButtonLocator = By.xpath("//span[contains(text(),'Shop New Yoga')]");
    	WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(shopButtonLocator));
    	btn.click();
    	
    	
    }
    
    
    public void selectCategory()
    {
    	 //JavascriptExecutor js = (JavascriptExecutor) driver;
    	 
    	//WebElement nsj = driver.findElement(NeveStudioJacket);
    	//js.executeScript("arguments[0].scrollIntoView();", NeveStudioJacket);
    	WebElement nsj = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(NeveStudioJacket));
    	
        nsj.click();
    	
        	
    		
    }
    public void productDetails() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
    	
    	WebElement size = driver.findElement(sizeL);
    	size.click();
    	WebElement color = driver.findElement(clrBlue);
    	color.click();
    	WebElement quantity = driver.findElement(QtyText);
    	quantity.clear();
    	quantity.sendKeys("10");
    	
    	
    	WebElement cartbutton = (WebElement)wait.until(ExpectedConditions.presenceOfElementLocated(addToCartBtn)); 
    	//WebElement cartbutton = driver.findElement(addToCartBtn);
    	cartbutton.click();
    	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);   
    }
    
    public void proceedToCart() throws InterruptedException
    
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
    	//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    	Thread.sleep(3000);
    	//WebElement icon = driver.findElement(cartIcon);
    	WebElement icon =
    		    new WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(
    		    ExpectedConditions.presenceOfElementLocated(cartIcon));
    	//WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
    	icon.click();
    	 
    }
    public void proceedTocheckOut()
    {
    	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
    WebElement btn = driver.findElement(proceedToCartBtn);
    btn.click();
    }
    public void shippingAddress()
    {
    	
    	WebElement email = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(inputEmail)); 
    			//driver.findElement(inputEmail);
    	email.sendKeys("manitest@yopmail.com");
    	WebElement firstname = driver.findElement(inputFirstName);
    	firstname.sendKeys("mani");
    	WebElement lastname = driver.findElement(inputLastName);
    	lastname.sendKeys("testing");
    	WebElement company = driver.findElement(inputCompanyName);
    	company.sendKeys("TSPL");
    	WebElement streetaddress = driver.findElement(inputStreetaddress);
    	streetaddress.sendKeys("sea drive");
    	WebElement city = driver.findElement(inputCity);
    	city.sendKeys("california");
    	WebElement state = driver.findElement(drpdownState);
    	Select dropdown = new Select(state);
    	dropdown.selectByVisibleText("California");
    	WebElement country = driver.findElement(drpdownCountry);
    	Select dropdowncountry = new Select(country);
    	dropdowncountry.selectByVisibleText("United State");
    	
    }
    
}
