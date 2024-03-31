import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainClass {

    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosta\\IdeaProjects\\lab9\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://account.mail.ru/login?page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%3Futm_source%3Dportal%26utm_medium%3Dportal_navigation_under_search_exp%26utm_campaign%3De.mail.ru%26mt_sub5%3D14251%26mt_sub1%3Dmail.ru%26mt_click_id%3Dmt-jlsxn4-1711877173-548646412&allow_external=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Assert.assertEquals(driver.findElement(By.xpath("//*[@class='input-0-2-77']")), driver.switchTo().activeElement());
        driver.findElement(By.xpath("//*[@class='input-0-2-77']")).sendKeys("testforlab9");
        driver.findElement(By.xpath("//*[@class='inner-0-2-89 innerTextWrapper-0-2-90']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@class='input-0-2-77 withIcon-0-2-78']")).sendKeys("TestLab9Test");
        driver.findElement(By.xpath("//*[@class='inner-0-2-89 innerTextWrapper-0-2-90']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@class='ph-avatar-img svelte-dfhuqc']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals("Абраменко Константин", driver.findElement(By.xpath("//*[@class='ph-name svelte-1popff4']")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@data-testid='whiteline-account-exit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@class='resplash-btn resplash-btn_outlined-themed resplash-btn_mailbox-big mfflmpk__b85yax']")).isDisplayed();

        
        //driver.quit();
    }

    @Test
    public void SecondTest() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosta\\IdeaProjects\\lab9\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://habr.com/ru/search/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='tm-input-text-decorated__input']")), driver.switchTo().activeElement());
        driver.findElement(By.xpath("//*[@class='tm-input-text-decorated__input']")).sendKeys("professionaltester");
    }

}
