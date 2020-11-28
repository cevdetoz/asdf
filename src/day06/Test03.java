package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {
    public static void main(String[] args) {
        /*1. “https://www.saucedemo.com” Adresine gidin
2. Username kutusuna “standard_user” yazdirin
3. Password kutusuna “secret_sauce” yazdirin
4. Login tusuna basin
5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
6. Add to Cart butonuna basin
7. Alisveris sepetine tiklayin
8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
9. Sayfayi kapatin*/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
        WebElement ilkurun=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String ilkurunidi=ilkurun.getText();
        ilkurun.click();
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepettekiUrun=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String sepettekiUrunIsmi=sepettekiUrun.getText();
        if (ilkurunidi.equals(sepettekiUrunIsmi)){
            System.out.println("alisveris sepeti testi PASS");
        } else {
            System.out.println("alisveris sepeti testi FAILED");
            System.out.println("Sectigim urun ile sepetteki urun ayni degil");
        }
        //9. Sayfayi kapatin
        driver.close();



    }
}
