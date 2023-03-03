package com.Ecommerce.tests;

import com.ecom.pages.AdvantageLandingPage;
import com.newtours.pages.*;
import com.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EcommerceTest extends BaseTest {

    private String noOfPassengers;
    private String expectedPrice;

//    @BeforeTest
//    @Parameters({"noOfPassengers", "expectedPrice"})
//    public void setupParameters(String noOfPassengers, String expectedPrice){
//        this.noOfPassengers = noOfPassengers;
//        this.expectedPrice = expectedPrice;
//    }

    @Test
    public void createNewUser() {
        AdvantageLandingPage advantageLandingPage = new AdvantageLandingPage(driver);
        advantageLandingPage.goTo();
        advantageLandingPage.createNewUser();
    }

   }
