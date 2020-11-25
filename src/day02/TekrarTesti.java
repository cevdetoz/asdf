package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        String actualYoutubeTitle=driver.getTitle();
        String expectedTitle="youtube";
        if(actualYoutubeTitle.equals(expectedTitle)){
            System.out.println("Youtube title testi Pass");
        }else{
            System.out.println("Youtube title testi  Faildet");
            System.out.println("Actuel title:"+actualYoutubeTitle);
            String actuelYoutubeUrl=driver.getCurrentUrl();
            String arananKelime="youtube";
            if(actuelYoutubeUrl.contains(arananKelime)){
                System.out.println("Url icerik testi PASS");
            }else{
                System.out.println("Url icerik testi Failed");
                System.out.println("Url "+arananKelime+" icermiyor");
            }
driver.navigate().to("https://www.amazon.com/");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
driver.manage().window().maximize();
String actuelAmazonTitle=driver.getTitle();
String arananAmazonKelime="Amazon";
if(actuelAmazonTitle.contains(arananAmazonKelime)){
    System.out.println("Amazon baslik testi PASS");
}else{
    System.out.println("Amazon baslik testi Failed");
    System.out.println("Title "+arananAmazonKelime+" icermiyor");
}
String actuelAmazonUrl=driver.getCurrentUrl();
String expectedAmazonUrl="https://www.amazon.com/";
if(actuelAmazonUrl.equals(expectedAmazonUrl)){
    System.out.println("Amazon url testi PASS");
}else{
    System.out.println("Amazon url testi FAILed");
    System.out.println("Actuel amazon url "+actuelAmazonUrl);
}

driver.close();

        }



    }
}
