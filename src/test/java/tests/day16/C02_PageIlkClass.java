package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.security.Key;

public class C02_PageIlkClass {

    //POM'de farkli class'lara farkli sekilde ulasilmasi benimsenmistir
    // Driver class'i icin static yontemi kullaniyoruz
    // Page Class'lari icin ise obje uzerinden kullanilmasi tercih edilmistir
    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //arama kutusuna Nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        //arama sonuclarinin nutella icerdigini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(actualSonucStr.contains("Nutella"));

        Driver.closeDriver();
    }

    @Test(groups = {"miniRegression","smoke"})
    public void test02(){
        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // Java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);

        // sonucun Java icerdigini test edelim
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("Java"));

        Driver.closeDriver();


    }
}
