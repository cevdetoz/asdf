package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {/*1. Bir class oluşturun: LocatorsIntro
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
 a. http://a.testaddressbook.com adresine gidiniz.
  b. Sign in butonuna basin
  //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
 c. email textbox,password textbox, and signin button elementlerini locate ediniz..
 d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
 i. Username : testtechproed@gmail.com
 ii. Password : Test1234!
 e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
 f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
 doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.*/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement emailTexbax= driver.findElement(By.id("session_email"));
        WebElement paswordtex= driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        emailTexbax.sendKeys("testtechproed@gmail.com");
        paswordtex.sendKeys("Test1234!");
        signInButonu.click();
        WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));
        if(kullaniciAdi.isDisplayed()){
            System.out.println("Kullanici adi:testtechproed@gmail.com PASS");
        }else{
            System.out.println("Kullanici adi:testtechproed@gmail.com FAILED ");
        }

WebElement adress=driver.findElement(By.linkText("Addresses"));
        if(adress.isDisplayed()){
            System.out.println("Adres linki gorundu testi PASS");
        }else{
            System.out.println("Adres linki gorundu testi FAILED");
        }
WebElement singOutText=driver.findElement(By.linkText("Sign out"));
        if(singOutText.isDisplayed()){
            System.out.println("sing out testi PASS");
        }else{
            System.out.println("sing out testi FAILED");
        }


        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada: "+linkListesi.size()+" tane link var");
    }
}
