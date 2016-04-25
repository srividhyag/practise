package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class HomePage 
{
	WebDriver driver;
	
	By BrowseCoupons=By.linkText("Coupons");
	By ProductDeals=By.linkText("Product Deals");

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
			}


	public boolean verifyHomePageTitle(String htitle)
	{
		String hptitle = driver.getTitle();
		return hptitle.equals(htitle);
    }

	//select product deals from browse coupons list box
	public ProductDealsPage selectProductDeals()
	{
		try
		{
		driver.findElement(BrowseCoupons).click();
		driver.findElement(ProductDeals).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
		}
		return new ProductDealsPage(driver);
	}
}
