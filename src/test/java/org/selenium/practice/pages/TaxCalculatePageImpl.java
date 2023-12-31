package org.selenium.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.practice.controller.WebDriverController;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class TaxCalculatePageImpl implements TaxCalculatorPage{

    WebDriver driver;

    public TaxCalculatePageImpl (WebDriverController driver ){

        this.driver = driver.getDriver();
    }
    public TaxCalculatePageImpl(WebDriver driver){

        this.driver= driver;
    }

    @Override
    public void calculate(double income) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test")));

        String incomeString = Double.toString(income);
        driver.findElement(By.id("test")).sendKeys(incomeString);
        driver.findElement(By.className("css-189e9pj-MuiButtonBase-root-MuiButton-root")).click();

    }

    @Override
    public String readErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-1pxa9xg-MuiAlert-message")));

        String errorMessage = driver.findElement(By.className("css-1pxa9xg-MuiAlert-message")).getText();

        return errorMessage;
    }

    @Override
    public String readSummaryReportTaxToBePaid() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/span")));

        String actualTax = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/span")).getText();

        return actualTax;
    }

    @Override
    public boolean CheckSummaryReportStatus() {
        driver.findElement(By.id("test")).sendKeys(Keys.chord(Keys.BACK_SPACE));
// driver.findElement(By.id("test")).sendKeys(new CharSequence[]{Keys.DELETE});
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // gave just 2 seconds to disappear once start deleting.
        boolean reportStatusVisible = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/span")).isDisplayed();

        // But isDisplayed() become ture.
        return reportStatusVisible;// ture=visible
    }

    @Override
    public int getTimeToOpenTheCalculator() {
        Instant begin = Instant.now();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://24.199.68.169:3000/"));

        Instant done = Instant.now();
        int timeTaken = (int) Duration.between(begin, done).toMillis();

        return timeTaken;
    }
}
