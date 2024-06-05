package com.krafttech.step_definitions;

import com.krafttech.utulities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
       // Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){  // after method kendisinden önceki scenario fail olsa bile çalışır..
                             // buradan hooks ile .feature file arasında bir bağlantı olmadığını anlıyoruz
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@db") //db=data base tag ı..feature da hangi senaryonuın db tag ı
                   // varsa orada bağlantıya geçecek burdaki before ve after meyhod
    public void setUpDb(){
        System.out.println("\tConnecting DB");
    }

    @After("@db")
    public void tearDownDb(){
        System.out.println("\tDisconnecting DB");
    }
}
