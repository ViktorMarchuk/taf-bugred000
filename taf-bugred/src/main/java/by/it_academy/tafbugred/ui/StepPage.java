package by.it_academy.tafbugred.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class StepPage extends BugRedPage{

    public StepPage(WebDriver driver){
        super(driver);
    }

    public void ActionsWithPageTafBugRed(){
        openPage(URL);
        clickButtonEnter();

    }
}
