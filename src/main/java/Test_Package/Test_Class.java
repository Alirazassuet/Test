package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.JOptionPane;

public class Test_Class {

    public static void main(String arg[]) {


        System.out.println("Test Pro");

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://one-patients-devtp13.avizia.com");
        driver.findElement(By.id("email")).sendKeys("blackwell-testing@yopmail.com");
        driver.findElement(By.name("password")).sendKeys("Avizia@2018");
        driver.findElement(By.id("signInButton")).click();
      //  driver.findElement(By.gettitle("Edit Your Personal Details")).isDisplayed();
//driver.getTitle('Edit Your Personal Details');

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div/div/h2/b")).isDisplayed();
        JOptionPane.showMessageDialog(null, "Automated test cases have been executed.");

        {
            try {
                driver.wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             driver.close();
        }
    }
}