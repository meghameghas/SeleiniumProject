package selenium;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class seleniumsecond {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\chrome-win64\\chrome-win64\\chrome.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://vinothqaacademy.com/");
        Actions act=new Actions(driver);
        By by_ele_demosite=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite=driver.findElement(by_ele_demosite);
        
        By by_ele_present=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present=driver.findElement(by_ele_present);
     
        By by_le_iframe=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='iFrames']");
        WebElement ele_iframe=driver.findElement(by_le_iframe);
        act.moveToElement(ele_demosite).moveToElement(ele_present).moveToElement(ele_iframe).click().build().perform();
        
        By by_ele_main=By.xpath("//div[@id='main']");
        WebElement ele_main=driver.findElement(by_ele_main);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)",ele_main);
        
        By by_ele_frame=By.name("registeruser");
        WebElement ele_frame=driver.findElement(by_ele_frame);
        driver.switchTo().frame(ele_frame);
        
    
        By by_ele_fname=By.id("vfb-5");
        WebElement ele_fname=driver.findElement(by_ele_fname);
        ele_fname.sendKeys("Megha");
        
        By by_ele_lname=By.id("vfb-7");
        WebElement ele_lname=driver.findElement(by_ele_lname);
        ele_lname.sendKeys("S");

        By by_ele_gend1=By.xpath("//input[@id='vfb-7']");
        WebElement ele_gend1=driver.findElement(by_ele_gend1);
        js.executeScript("arguments[0].click()", ele_gend1);
        
        By by_ele_gend2=By.xpath("//input[@id='vfb-31-2']");
        WebElement ele_gend2=driver.findElement(by_ele_gend2);
        js.executeScript("arguments[0].click()", ele_gend2);
        
        By by_ele_gend3=By.xpath("//input[@id='vfb-31-3']");
        WebElement ele_gend3=driver.findElement(by_ele_gend3);
        ele_gend3.click();js.executeScript("arguments[0].click()", ele_gend3);
        
        By by_ele_checkbox=By.xpath("//li[@id='item-vfb-20']//input[@type='checkbox']");
        List<WebElement> ele_checkbox=driver.findElements(by_ele_checkbox);
       
        for(WebElement i:ele_checkbox) {
        	String value1=i.getAttribute("value");
        	if(value1.equalsIgnoreCase("java")||value1.equalsIgnoreCase("devops")) {
        		js.executeScript("arguments[0].click()",i);
        	}
        	else {
        		if(i.isSelected()) {
        			js.executeScript("arguments[0].click()",i);
        		}
        	}
        }
        By by_ele_address=By.xpath("//input[@id='vfb-13-address']");
        WebElement ele_address=driver.findElement(by_ele_address);
        ele_address.sendKeys("Mandya");
        
        By by_ele_address0=By.xpath("//input[@id='vfb-13-address-2']");
        WebElement ele_address0=driver.findElement(by_ele_address0);
        ele_address0.sendKeys("Mandya");
        
        By by_ele_address1=By.xpath("//input[@id='vfb-13-city']");
        WebElement ele_address1=driver.findElement(by_ele_address1);
        ele_address1.sendKeys("pandavapura");
        
        By by_ele_address2=By.xpath("//input[@id='vfb-13-state']");
        WebElement ele_address2=driver.findElement(by_ele_address2);
        ele_address2.sendKeys("pandavapura");
        
        By by_ele_pincode=By.xpath("//input[@id='vfb-13-zip']");
        WebElement ele_pincode=driver.findElement(by_ele_pincode);
        ele_pincode.sendKeys("571435");
        
        By by_ele_email=By.xpath("//input[@id='vfb-14']");
        WebElement ele_email=driver.findElement(by_ele_email);
        ele_email.sendKeys("jhdichdius@gmail.com");
        
        By by_ele_date=By.xpath("//input[@id='vfb-18']");
        WebElement ele_date=driver.findElement(by_ele_date);
        ele_date.sendKeys("02/03/2025");
        
        By by_ele_ph=By.xpath("//input[@id='vfb-19']");
        WebElement ele_ph=driver.findElement(by_ele_ph);
        ele_ph.sendKeys("6546559816");
        
        By by_ele_query=By.xpath("//textarea[@id='vfb-23']");
        WebElement ele_query=driver.findElement(by_ele_query);
        ele_query.sendKeys("jdhfsbiufhejfhiu iuhfjdoiferhf ohefiuehiuh");
        
        By by_ele_veri=By.xpath("//input[@id='vfb-3']");
        WebElement ele_veri=driver.findElement(by_ele_veri);
        ele_veri.sendKeys("33");
        
        By by_ele_submit=By.xpath("//input[@id='vfb-4']");
        WebElement ele_submit=driver.findElement(by_ele_submit);
        js.executeScript("arguments[0].click()",ele_submit);
        
        driver.switchTo().defaultContent();
        driver.navigate().back();
        
        //Alert and Popup
        By by_ele_demosite2=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite2=driver.findElement(by_ele_demosite2);
        
        By by_ele_present2=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present2=driver.findElement(by_ele_present2);
        WebElement ele_alertmenue=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Alert and Popup']"));
        act.moveToElement(ele_demosite2).moveToElement(ele_present2).moveToElement(ele_alertmenue).click().build().perform();
        
        WebElement ele_alert1=driver.findElement(By.xpath("//button[@name='alertbox']"));
        ele_alert1.click();
        Alert a=driver.switchTo().alert();
        Thread.sleep(1000);
        a.accept();
        Thread.sleep(1000);
        WebElement ele_alert2=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
        ele_alert2.click();
        Thread.sleep(1000);
        a.dismiss();
        Thread.sleep(1000);
        WebElement ele_alert3=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
        ele_alert3.click();
        Thread.sleep(1000);
        a.sendKeys("yes");
        a.accept();
        Thread.sleep(1000);
        
        //dropdown
        
        driver.navigate().back();
        By by_ele_demosite3=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite3=driver.findElement(by_ele_demosite3);
        
        By by_ele_present3=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present3=driver.findElement(by_ele_present3);
        WebElement ele_drop=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='DropDown']"));
        act.moveToElement(ele_demosite3).moveToElement(ele_present3).moveToElement(ele_drop).click().build().perform();
        
        WebElement ele_drop1=driver.findElement(By.id("select2-simpleDropdown-container"));
        ele_drop1.click();
        
        //Mouse Event
         
        driver.navigate().back();
        By by_ele_demosite4=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite4=driver.findElement(by_ele_demosite4);
        
        By by_ele_present4=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present4=driver.findElement(by_ele_present4);
        WebElement ele_mouse=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Mouse Event']"));
        act.moveToElement(ele_demosite4).moveToElement(ele_present4).moveToElement(ele_mouse).click().build().perform();
        
        WebElement ele_source=driver.findElement(By.xpath("//div[@id='droppableElement']"));
        WebElement ele_target=driver.findElement(By.xpath("//div[@id='draggableElement']"));
        act.dragAndDrop(ele_target,ele_source).build().perform();
        WebElement ele_dble_click=driver.findElement(By.id("dblclick"));
        act.doubleClick(ele_dble_click).build().perform();
        WebElement ele_right_click=driver.findElement(By.id("rightclick"));
        act.contextClick(ele_right_click).build().perform();
        
        driver.navigate().back();
        By by_ele_demosite5=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite5=driver.findElement(by_ele_demosite5);
        
        //Multiple window
        
        By by_ele_present5=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present5=driver.findElement(by_ele_present5);
        WebElement ele_multiple=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Multiple Windows']"));
        act.moveToElement(ele_demosite5).moveToElement(ele_present5).moveToElement(ele_multiple).click().build().perform();
        
        WebElement ele_nbw=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-d5cad06 elementor-widget elementor-widget-html']//button[@id='button1']"));
        ele_nbw.click();
        
        WebElement ele_nbm=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-d94c712 elementor-widget elementor-widget-html']//button[@id='button1']"));
        ele_nbm.click();
        
        WebElement ele_nbt=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-f5f0e8d elementor-widget elementor-widget-html']//button[@id='button1']"));
        ele_nbt.click();
        Thread.sleep(1000);
        
        //Wait
        
        String p_window=driver.getWindowHandle();
        Set<String> c_window=driver.getWindowHandles();
        for (String handle : c_window) {
            if (!handle.equals(c_window)) {
                driver.switchTo().window(handle);
            }
        }
        driver.switchTo().window(p_window);
        driver.navigate().back();
        By by_ele_demosite6=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]");
        WebElement ele_demosite6=driver.findElement(by_ele_demosite6);
        
        By by_ele_present6=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]");
        WebElement ele_present6=driver.findElement(by_ele_present6);
        WebElement ele_wait=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Wait WebElement']"));
        act.moveToElement(ele_demosite6).moveToElement(ele_present6).moveToElement(ele_wait).click().build().perform();
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10)) 
                .pollingEvery(Duration.ofMillis(500)) 
                .ignoring(NoSuchElementException.class);

            try {
                WebElement displayButton = fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='displayButton']")));
                displayButton.click();
                System.out.println("Display Button clicked successfully using Fluent Wait!");
            } catch (Exception e) {
                System.out.println("Failed to click Display Button using Fluent Wait: " + e.getMessage());
            }
	    
	}
}