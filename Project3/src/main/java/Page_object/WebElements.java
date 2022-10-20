package Page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebElements
{
	public WebElements(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	@FindBy(how = How.XPATH, using = "(//input[@type='text'])")
	private WebElement LocationTextField;
	 
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"basket\\\"]/div[1]/button/div/span[2]")
	private WebElement click_on_voucher;
	
	@FindBy(how = How.XPATH, using = "voucherId")
	private WebElement click_coupon_code;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement click_on_redeem;
	
	@FindBy(how = How.XPATH, using = "//button[@class='button button--green mb-10']")
	private WebElement click_on_OK;
	
	@FindBy(how = How.XPATH, using = "(//button[@class='button button--md button--green flex-1 font-semibold'])[2]")
	private WebElement click_on_pizza;
	
//	@FindBy(how = How.CSS, using = "//button[@class='button button--green mb-10']")
//	private WebElement click_onizza;
	
	
	
	
	public void Location(String location,String enter){
		LocationTextField.sendKeys(location);
		LocationTextField.sendKeys(Keys.ENTER);
	}

	public void voucher() {
		click_on_voucher.click();
	}
	
	public void click_code(String code) {
		click_coupon_code.sendKeys(code);
	}

	public void click_redeem() {
		click_on_redeem.click();
	}
	
	public void click_ok() {
		click_on_OK.click();
	}
	
	public void click_on_pizza() {
		click_on_pizza.click();
	}
	
}
