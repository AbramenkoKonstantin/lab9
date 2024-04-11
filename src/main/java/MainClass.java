import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainClass {

    //Mail.ru
    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosta\\IdeaProjects\\lab9\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://account.mail.ru/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        driver.findElement(By.xpath("//*[@class='resplash-btn resplash-btn_outlined-themed resplash-btn_mailbox-big ejf-iekc__1jdtl7f']")).isDisplayed();


        driver.quit();
    }

    //Habr.com
    @Test
    public void SecondTest() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosta\\IdeaProjects\\lab9\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://habr.com/ru/all/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@class='tm-svg-img tm-header-user-menu__icon tm-header-user-menu__icon_search tm-header-user-menu__icon_dark']")).click();
        driver.findElement(By.xpath("//*[@class='tm-input-text-decorated__input']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//*[@class='tm-svg-img tm-svg-icon']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Что такое Selenium?")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals("28 сен 2012 в 16:14", driver.findElement(By.xpath("//*[@title='2012-09-28, 16:14']")).getText());
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@href='/ru/articles/' and @class='footer-menu__item-link router-link-active']")).click();

        driver.quit();
    }

}
