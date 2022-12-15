package com.krafttech.step_definitions;

import com.krafttech.pages.ProfilePage;
import com.krafttech.utulities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Task_Step_Defs {
    ProfilePage profilePage=new ProfilePage();

    @Then("User should see profile options and username")
    public void user_should_see_profile_options_and_username(List<String> profileOptionsAndUserName) {

        List<String> actualOptionsAndUserName= BrowserUtils.getElementsText(profilePage.profileOptionsAndUserName_loc);
        System.out.println("actualOptions.size() = " + actualOptionsAndUserName.size());
        System.out.println("actualOptionsAndUserName = " + actualOptionsAndUserName);
        System.out.println("profileOptionsAndUserName = " + profileOptionsAndUserName);

        Assert.assertEquals("Verify the name", profileOptionsAndUserName, actualOptionsAndUserName);

    }
    @When("User should go to {string} modul")
    public void user_should_go_to_modul(String tabName) {
        profilePage.profileTabs(tabName);

    }
    @When("User should input information and click Add Experience Button")
    public void user_should_input_information_and_click_add_experience_button() {
        profilePage.jobTitle.clear();
        profilePage.jobTitle.sendKeys("QA Tester");
        profilePage.companyexperience.sendKeys("Amazon");
        profilePage.locationExperience.sendKeys("Los Angeles");
        profilePage.startYear.sendKeys("10.10.2020");
        profilePage.endYear.sendKeys("10.10.2022");
        profilePage.jobDescription.sendKeys("TestNG, Postman, Cucumber, Selenium");
        profilePage.addExperienceBtn.click();

        BrowserUtils.waitFor(3);

    }
    @Then("User should see Overview module")
    public void user_should_see_overview_module() {
        String expectedTitle="Profile Details";
        String actualTitle=profilePage.profileDetails_loc.getText();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);

    }


}
