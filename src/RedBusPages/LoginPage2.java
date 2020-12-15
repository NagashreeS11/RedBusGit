package RedBusPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	
	  WebDriver driver;
	    
	    @FindBy(id="i-icon-profile")
	    WebElement LoginIcon;
	    
	    @FindBy(id="signInLink")
	    WebElement LoginLink;
	    
	    @FindBy(id="mobileNoInp")
	    WebElement MobileNo;
	    
	    public LoginPage2(WebDriver driver) {
	        
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	    }
	    
	    public void LogintoApp(String MobileNoip) {
	        
	        LoginIcon.click();
	        LoginLink.click();
	        
	     //   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	        driver.switchTo().frame(0);
	        
	        MobileNo.sendKeys(MobileNoip);
	    }
	    


}
