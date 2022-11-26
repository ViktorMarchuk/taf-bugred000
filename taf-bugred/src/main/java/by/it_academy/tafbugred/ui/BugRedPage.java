package by.it_academy.tafbugred.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.charset.StandardCharsets;


public class BugRedPage extends BasePage{
    private WebDriver driver;
    public final String URL = "http://users.bugred.ru/";
    public final String NAME = "имя";
    public final String PASSWORD = "Пароль";
    public final String EMAIL = "Email";
    public final String BUTTON_REGISTER = "Зарегистрироваться";
    public final String REGISTER = "Регистрация";

    private String xPathButtonEnter = "//a[@href='/user/login/index.html']";
    private String xPathName = "//form[@action='/user/register/index.html']/table/tbody/tr[1]/td[1]";
    private String xPathEmail = "//form[@action='/user/register/index.html']/table/tbody/tr[2]/td[1]";
    private String xPathPassword = "//form[@action='/user/register/index.html']/table/tbody/tr[3]/td[1]";
    private String xPathNameButtonRegister = "//form[@action='/user/register/index.html']/table/tbody/tr[4]/td[2]/input";
    private String xPathRegister = "//div[@class='col-md-6'][2]/h2";

    public BugRedPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        driver.navigate().to(url);
    }

    public void clickButtonEnter(){
        By buttonEnter = new By.ByXPath(xPathButtonEnter);
        WebElement buttonEnterElement = driver.findElement(buttonEnter);
        buttonEnterElement.click();
    }

    public String getTextName(){
        By name = new By.ByXPath(xPathName);
        WebElement nameElement = driver.findElement(name);
        return nameElement.getText();
    }

    public String getTextEmail(){
        By eMail = new By.ByXPath(xPathEmail);
        WebElement eMailElement = driver.findElement(eMail);
        return eMailElement.getText();
    }

    public String getTextPassword(){
        By password = new By.ByXPath(xPathPassword);
        WebElement passwordElement = driver.findElement(password);
        return passwordElement.getText();
    }

    public String getTextNameButtonRegister(){
        By nameButtonRegister = new By.ByXPath(xPathNameButtonRegister);
        WebElement nameButtonRegisterElement = driver.findElement(nameButtonRegister);
        return nameButtonRegisterElement.getText();
    }

    public String getTextRegister(){
        By register = new By.ByXPath(xPathRegister);
        WebElement registerElement = driver.findElement(register);
        return registerElement.getText();
    }
}

