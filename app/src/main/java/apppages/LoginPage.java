package apppages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appbase.AppBase;


public class LoginPage extends AppBase {
	@FindBy(name="txtUsername")
	WebElement UserName;
	@FindBy(name="txtPassword")
	WebElement Password;
	@FindBy(name="Submit")
	WebElement Login;
	@FindBy(linkText="Forgot your password?")
	WebElement ForgotPassword;
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]")
	WebElement image;
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public boolean imagetest() {
		return image.isDisplayed();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public DashBoard logIn(String uname, String pwd) {
		UserName.sendKeys(uname);
		Password.sendKeys(pwd);
		Login.click();
		return new DashBoard();
		
	}
	}



