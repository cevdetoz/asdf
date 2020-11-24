package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

      String actualResult=  driver.getTitle();
String expectedResult="google";
if(actualResult.equals(expectedResult)){
    System.out.println("Page title testi Pass");
}else{
    System.out.println("Page title testi Failed");
    System.out.println("Actual page title: "+actualResult);
}
driver.get("https://www.youtube.com/");
String actualResult2=driver.getCurrentUrl();
String expectedResult2="http://www.youtube.com/";
if(actualResult2.equals(expectedResult2)){
    System.out.println("Page url testi : PASS");
}else{
    System.out.println("Page url testi :FAILED");
    System.out.println("Expect Page Test : "+actualResult2);
}
driver.close();

    }
}
