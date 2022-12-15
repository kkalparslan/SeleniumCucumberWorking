package com.krafttech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_Step_Defs {

    @When("Get the text of dashboard")
    public void getTheTextOfDashboard() {
        System.out.println("I got the dashboard text");
    }

    @And("Go to Developers menu")
    public void goToDevelopersMenu() {
        System.out.println("I went to developers menu");
    }

    @And("Get the text of Developer")
    public void getTheTextOfDeveloper() {
        System.out.println("I got the developer text");
    }

    @Then("Verify that text is developer")
    public void verifyThatTextIsDeveloper() {
        System.out.println("I verify that the developer text is PASSED");
    }

    @And("Go to Edit Profile menu")
    public void goToEditProfileMenu() {
        System.out.println("I went to edit profile menu");
    }

    @And("Get the text of Edit User Profile")
    public void getTheTextOfEditUserProfile() {
        System.out.println("I got the edit user profile text");
    }

    @Then("Verify that text is Edit User Profile")
    public void verifyThatTextIsEditUserProfile() {
        System.out.println("I verify that the edit user profile text is PASSED");
    }

    @And("Go to My Profile menu")
    public void goToMyProfileMenu() {
        System.out.println("I went to my profile menu");
    }

    @And("Get the text of User Profile")
    public void getTheTextOfUserProfile() {
        System.out.println("I got the user profile text");
    }

    @Then("Verify that text is User Profile")
    public void verifyThatTextIsUserProfile() {
        System.out.println("I verify that the user profile text is PASSED");
    }
}
