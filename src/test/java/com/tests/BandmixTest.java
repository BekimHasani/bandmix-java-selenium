package com.tests;

import com.implementation.BandmixTestImpl;
import com.OpenBrowser;
import org.testng.annotations.Test;

import javax.swing.*;


public class BandmixTest extends OpenBrowser {

    private String email="bekimhasanni@gmail.com";
    private String password="testtet123";
    private String musicianName = "DjFilani";
    private String contactName = "Filan Fisteku";
    private String birthDay = "21";
    private String birthYear = "1994";
    private String city = "Brooklyn";
    private String zip = "11201";
    private String address = "Hillside Avenue";
    private String phone = "0043 2321 122";
    private String musicName = "Levitating";
    private String musicUrl = "http://www.youtube.com/watch?v=TUVcZfQe-Kw";
    private String updatedName = "Levitating Featuring DaBaby";
    private String year = "2022";
    private String month = "05";
    private String day = "21";
    private String hour = "20";
    private String minutes = "00";
    private String title = "New Song Release";
    private String description = "The very new song is going to be released in a big event, in front of 100000 peoples, it is going to be awesome";
    private String updatedYear = "2022";
    private String updatedMonth = "05";
    private String updateDay = "21";
    private String updatedHour = "20";
    private String updatedMinutes = "00";
    private String updatedTitle = "New Song Release";

    BandmixTestImpl login;

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        login = new BandmixTestImpl(element);
        login.loginUser(email, password);

    }

    @Test(priority = 2)
    public void profileUpdate() throws InterruptedException {
        loginTest();
        login.updateBasicInfo(musicianName,contactName, birthDay,
                birthYear, city, zip, address, phone);

    }

    @Test(priority = 3)
    public void setVideos() throws InterruptedException {
        loginTest();
        login.setVideos(musicName, musicUrl, updatedName);
    }

    @Test(priority = 4)
    public void updateVideos() throws InterruptedException {
        loginTest();
        login.updateVideos(updatedName);
    }

    @Test(priority = 5)
    public void setEvent() throws InterruptedException {
        loginTest();
        login.setEvent(year, month, day, hour, minutes, title, description);
    }

    @Test(priority = 6)
    public void updateEvent() throws InterruptedException {
        loginTest();
        login.updateEvent(updatedYear, updatedMonth, updateDay, updatedHour, updatedMinutes, updatedTitle, description);
    }



}
