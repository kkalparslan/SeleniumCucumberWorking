package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utulities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Dashboard_Step_Defs {
    DashboardPage dashboardPage=new DashboardPage();

    @Then("The user name should be {string}")
    public void the_user_name_should_be(String expectedName) {
        String actualName=dashboardPage.getUserName();
//        System.out.println("actualName = " + actualName);
//        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals("Verify the name is match", expectedName, actualName);
    }

    @When("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String tabName) {
        dashboardPage.navigateToTab(tabName);
    }

    @Then("The user should be able to see home name as {string}")
    public void the_user_should_be_able_to_see_home_name_as(String expectedHomeName) {
        String actualHomeName = dashboardPage.getHomeName(expectedHomeName);
//        System.out.println("actualHomeName = " + actualHomeName);
//        System.out.println("expectedHomeName = " + expectedHomeName);
        Assert.assertEquals("Verify that home name is displayed", expectedHomeName, actualHomeName);
    }
}
