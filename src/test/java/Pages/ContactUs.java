package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class ContactUs extends AppDriver 
{
        public ContactUs()
        {
        	PageFactory.initElements(driver, this);
        }
        
        @FindBy (xpath = "//a[@class='external'][contains(text(),'Connect')]")  WebElement connect; 
        @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[8]/a")  WebElement connect1; 
        @FindBy (id = "name") WebElement name;
        @FindBy (id = "cemail") WebElement email;
        @FindBy (xpath = "//*[@id='commentForm']/div[1]/div/div[3]/input") WebElement mobnum;
        @FindBy (xpath = "//*[@id='commentForm']/div[2]/div/div/textarea") WebElement details;
        @FindBy (xpath = "//*[@id='commentForm']/div[3]/div/input")  WebElement submitbutton;
        @FindBy (xpath = "/html/body/h2")  WebElement msg;
        @FindBy (xpath = "//*[@id='active']")  WebElement home;
        public void opencontactpage() throws InterruptedException
        {
        	try
        	{
        	connect.click();
        	}
        	catch(Exception e)
        	{
        		try
        		{
        			connect1.click();
        		}
        		catch(Exception e2)
        		{
        			driver.navigate().to(config.getProperty("contact"));
        		}
        	}
        	Thread.sleep(3000);
        	List<WebElement> list = driver.findElements(By.tagName("iframe"));
        	driver.switchTo().frame(list.get(1));
        	Thread.sleep(1000);
        	System.out.println("Contact Us Page has been opened");
        	log.info("Contact Us Page has been opened");
        }
        
        
        public void EnterName(String cname) throws InterruptedException
        {
        	name.sendKeys(cname);
        	Thread.sleep(1000);
        	System.out.println("Name has been Entered" + " " + cname);
        	log.info("Name has been Entered");
        }
        public void EnterEmail(String cemail) throws InterruptedException
        {
        	email.sendKeys(cemail);
        	Thread.sleep(1000);
        	System.out.println("Email has been entered " + " " + cemail);
        	log.info("Email has been entered");
        }
        public void Entermobile(String mobilenumber) throws InterruptedException
        {
        	mobnum.sendKeys(mobilenumber);
        	Thread.sleep(1000);
        	System.out.println("Mobile Number has been entered " + " " + mobilenumber);
        	log.info("Mobile Number has been entered");
        }
        public void EnterDetail(String text) throws InterruptedException
        {
        	details.sendKeys(text);
        	Thread.sleep(1000);
        	System.out.println("details has been entered");
        	log.info("details has been entered");
        }
        public void clicksubmit()  throws InterruptedException
        {
        	submitbutton.click();
        	Thread.sleep(1000);
        	System.out.println("Submit button has been clicked");
        	log.info("Submit button has been clicked");
        }
        
        public void getmsg() throws InterruptedException
        {
        	System.out.println(msg.getText());
        	Thread.sleep(1000);
        }
        
        public void navigatehome()
        {
        	home.click();
        	System.out.println("Home page has been opened");
        	log.info("Home page has been opened");
        }
        }

