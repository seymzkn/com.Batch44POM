package tests.day17;

import org.testng.annotations.Test;
import sun.java2d.d3d.D3DRenderQueue;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        // eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        // Ornegin // HMCUrl yerineHMCurl yazarsak,
        // ConfigReader.gwetProperty() o key'i bulamaz
        // ve nullPointerException firlatir
    }
}
