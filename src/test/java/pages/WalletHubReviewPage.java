package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class WalletHubReviewPage {
    WebDriver driver;
    Actions actions;

    public WalletHubReviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
        actions = new Actions(driver);
    }

    @FindBy (className = "wh-rating-notes")
    WebElement ratingStars;

    @FindBy (xpath = "//*[@id='reviewform']/div[1]/div/div")
    WebElement policyDropdown;

    @FindBy(xpath = "//*[@id='reviewform']/div[1]/div/ul/li[2]/a")
    WebElement attHealth;

    @FindBy(id = "review-content")
    WebElement reviewText;

    @FindBy(xpath = ".//*[@class='submit']/input")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@id='review']/div[1]/h1")
    WebElement success;


    public String hoverStars(int star) {
        actions.moveToElement(ratingStars).perform();
        String classAtt = driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a["+star+"]")).getAttribute("class");
        WebElement stars = driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a["+star+"]"));
        actions.moveToElement(stars).build().perform();
        System.out.println("Selected "+star+" star.");
        actions.moveToElement(stars).click().build().perform();
        System.out.println("Clicked "+star+" star.");
        return classAtt;
    }

    public void selectPolicy()   {
        policyDropdown.click();
        System.out.println("Clicked on dropdown");
        attHealth.click();
        System.out.println("Selected Health");
    }

    public void selectStars(int star) {
        driver.findElement(By.xpath("//*[@id='overallRating']/a["+star+"]")).click();
        System.out.println("Gave "+star+" rating.");
    }

    public void setReviewText(String review){
        reviewText.sendKeys(review);
        System.out.println("Entered review");
    }

    public void clickSubmit(){
        submitBtn.click();
        System.out.println("Clicked on Submit button");
    }

    public String verifySuccess(){
        System.out.println(success.getText());
        if ((success.getText().contains("has been posted"))==true) {
            return "true";
        }
        else
            return "false";
    }

}
