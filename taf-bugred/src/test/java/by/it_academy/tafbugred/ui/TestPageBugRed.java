package by.it_academy.tafbugred.ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPageBugRed extends BaseTest{

    @Test
    void testActionWithName(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();
        Assert.assertEquals(stepPage.NAME, stepPage.getTextName());
    }

    @Test
    void testActionWithEmail(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();
        Assert.assertEquals(stepPage.EMAIL, stepPage.getTextEmail());
    }

    @Test
    void testActionWithPassword(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();
        Assert.assertEquals(stepPage.PASSWORD, stepPage.getTextPassword());

    }

    @Test
    void testActionWithNameButtonRegister(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();
        Assert.assertEquals(stepPage.BUTTON_REGISTER, stepPage.getTextNameButtonRegister());
    }

    @Test
    void testActionWithNameRegister(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();
        Assert.assertEquals(stepPage.REGISTER, stepPage.getTextRegister());
    }
}

