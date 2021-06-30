package com.implementation;

import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;

public class BandmixTestImpl {

    private final By loginBtn = By.xpath("//*[@id=\"sign-in\"]");
    private final By emailHolder = By.xpath("//*[@id=\"login-email\"]");
    private final By passwordHolder = By.xpath("//*[@id=\"login-password\"]");
    private final By signInBtn = By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/fieldset/div[2]/input");


    private final By profile = By.xpath("/html/body/div[2]/div[2]/div/ul/li[3]/a");
    private final By overMusicianName = By.xpath("//*[@id=\"screename\"]");
    private final By overContactName = By.xpath("//*[@id=\"contact_name\"]");
    private final By genderBtn = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[5]/ul/li[2]/div");
    private final By monthDropDown = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[6]/div");
    private final By selectedMonth = By.xpath("/html/body/div[5]/div/div/ul/li[3]/a");
    private final By setDay = By.xpath("//*[@id=\"birthdate_d\"]");
    private final By setYear = By.xpath("//*[@id=\"birthdate_y\"]");
    private final By stateDropDown = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[8]/div/span[2]");
    private final By setState = By.xpath("/html/body/div[5]/div/div/ul/li[40]/a");
    private final By setCity = By.xpath("//*[@id=\"city\"]");
    private final By setZipCode = By.xpath("//*[@id=\"zip\"]");
    private final By setAddress = By.xpath("//*[@id=\"address\"]");
    private final By setPhoneNumber = By.xpath("//*[@id=\"phone\"]");
    private final By studioOrMusician = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[14]/ul/li[2]/div/span");
    private final By experienceDropDown = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[15]/div");
    private final By setExperienceYear = By.xpath("/html/body/div[5]/div/div/ul/li[4]/a");
    private final By commitmentLevel = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[1]/dd[16]/ul/li[3]/div/span");
    private final By setInstrument = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[1]/li[22]/div/span");
    private final By setInstrument2 = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[1]/li[30]/div/span");
    private final By setInstrument3 = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[1]/li[2]/label");
    private final By setMusicType = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[2]/li[19]/div/span");
    private final By setMusicType2 = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[2]/li[20]/div/span");
    private final By setMusicType3 = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/ul[2]/li[24]/label");
    private final By setGigs = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[2]/dd[4]/ul/li[3]/label/div/span");
    private final By practise = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[2]/dd[5]/ul/li[2]/label/div");
    private final By gigsForWeek = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[2]/dd[6]/ul/li[3]/label/div/span");
    private final By available = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/dl[2]/dd[7]/ul/li[3]/label/div");
    private final By submit = By.xpath("/html/body/div[2]/div[4]/div/section/div[2]/form/fieldset/p[5]/input");
    private final By updateProfileConfirm = By.xpath("//h2[contains(text(),'Your information has been successfully updated')]");

    private final By videos = By.xpath("/html/body/div[2]/div[2]/div/ul/li[6]/a");
    private final By title = By.xpath("//*[@id=\"title\"]");
    private final By youtubeUrl = By.xpath("//*[@id=\"url\"]");
    private final By displayBtn = By.xpath("//*[@id=\"account\"]/div/form/dl/dd[3]/ul/li[1]/div/span");
    private final By submitBtn = By.xpath("//*[@id=\"account\"]/div/form/p/input");
    private final By edit = By.xpath("//span[contains(text(),'Edit')]");
    private final By update = By.xpath("//*[@id=\"account\"]/div[1]/form/p/input[2]");
    private final By delete = By.xpath("//span[contains(text(),'Delete')]");
    private final By confirm = By.xpath("//a[contains(text(),'Confirm')]");

    private final By calendar = By.xpath("//a[@href='/account/calendar/']");
    private final By eventYear = By.xpath("//input[@id='event_year']");
    private final By eventMonth = By.xpath("//input[@id='event_month']");
    private final By eventDay = By.xpath("//input[@id='event_day']");
    private final By eventHour = By.xpath("//input[@id='event_hour']");
    private final By eventMinutes = By.xpath("//input[@id='event_minute']");
    private final By eventTitle = By.xpath("//input[@id='title']");
    private final By eventDescription = By.xpath("//textarea[@id='description']");
    private final By eventSubmitBtn = By.xpath("//input[@value='Submit']");
    private final By editEvent = By.xpath("//span[@class='edit']");
    private final By updateEventBtn = By.xpath("//input[@value='Update']");
    private final By deleteEvent = By.xpath("//span[contains(text(),'Delete')]");
    private final By confirmDeleteEventBtn = By.xpath("//a[contains(text(),'Confirm')]");
    private final By createEventConfirm = By.xpath("//h2[contains(text(),'Calendar event successfully created')]");
    private final By removeEventConfirm = By.xpath("//h2[contains(text(),'Calendar event successfully removed')]");
    private final By updateEventConfirm = By.xpath("//h2[contains(text(),'Calendar event successfully modified')]");

    WebDriver element;


    public BandmixTestImpl(WebDriver element) {
        this.element = element;
    }

    private void textAssert(By pathText, String pathResults) {
        Assert.assertEquals(element.findElement(pathText).getAttribute("value"), pathResults);
    }

    private boolean isElementPresent(WebDriver driver, final By locator) {
        List<WebElement> elemnts = driver.findElements(locator);
        return elemnts.size() == 1 && elemnts.get(0).isDisplayed();
    }

    public void loginUser(String email, String password) throws InterruptedException {
        element.findElement(loginBtn).click();
        Thread.sleep(1000);
        element.findElement(emailHolder).sendKeys(email);
        textAssert(emailHolder, email);
        Thread.sleep(1000);
        element.findElement(passwordHolder).sendKeys(password);
        textAssert(passwordHolder, password);
        Thread.sleep(1000);
        element.findElement(signInBtn).click();
        Thread.sleep(3000);
    }

    public void updateBasicInfo(String musicianName, String contactName, String birthDay, String birthYear,
                                String city, String zipCode, String address, String phone) throws InterruptedException {
        element.findElement(profile).click();
        Thread.sleep(1000);
        element.findElement(overMusicianName).clear();
        element.findElement(overMusicianName).sendKeys(musicianName);
        textAssert(overMusicianName, musicianName);
        element.findElement(overContactName).clear();
        element.findElement(overContactName).sendKeys(contactName);
        textAssert(overContactName, contactName);
        element.findElement(genderBtn).click();
        element.findElement(monthDropDown).click();
        element.findElement(selectedMonth).click();
        element.findElement(setDay).clear();
        element.findElement(setDay).sendKeys(birthDay);
        textAssert(setDay, birthDay);
        element.findElement(setYear).clear();
        element.findElement(setYear).sendKeys(birthYear);
        textAssert(setYear, birthYear);
        element.findElement(stateDropDown).click();
        element.findElement(setState).click();
        element.findElement(setCity).clear();
        element.findElement(setCity).sendKeys(city);
        textAssert(setCity, city);
        element.findElement(setZipCode).clear();
        element.findElement(setZipCode).sendKeys(zipCode);
        textAssert(setZipCode, zipCode);
        element.findElement(setAddress).clear();
        element.findElement(setAddress).sendKeys(address);
        textAssert(setAddress, address);
        element.findElement(setPhoneNumber).clear();
        element.findElement(setPhoneNumber).sendKeys(phone);
        textAssert(setPhoneNumber, phone);
        element.findElement(studioOrMusician).click();
        element.findElement(experienceDropDown).click();
        element.findElement(setExperienceYear).click();
        element.findElement(commitmentLevel).click();
        element.findElement(setInstrument).click();
        element.findElement(setInstrument2).click();
        element.findElement(setInstrument3).click();
        element.findElement(setMusicType).click();
        element.findElement(setMusicType2).click();
        element.findElement(setMusicType3).click();
        element.findElement(setGigs).click();
        element.findElement(practise).click();
        element.findElement(gigsForWeek).click();
        element.findElement(available).click();
        element.findElement(submit).click();
        isElementPresent(element, updateProfileConfirm);
    }

    public void setVideos(String name, String url, String updatedName) throws InterruptedException {
        element.findElement(videos).click();
        element.findElement(title).sendKeys(name);
        textAssert(title, name);
        element.findElement(youtubeUrl).sendKeys(url);
        textAssert(youtubeUrl, url);
        element.findElement(displayBtn).click();
        element.findElement(submitBtn).click();
    }

    public void updateVideos(String updatedName) throws InterruptedException {
        element.findElement(videos).click();
        element.findElement(edit).click();
        element.findElement(title).clear();
        element.findElement(title).sendKeys(updatedName);
        textAssert(title, updatedName);
        element.findElement(update).click();
        Thread.sleep(1000);
        element.findElement(delete).click();
        Thread.sleep(1000);
        element.findElement(confirm).click();
    }


    public void setEvent(String year, String month, String day, String hour,
                         String minutes, String title, String description) throws InterruptedException {
        element.findElement(calendar).click();
        element.findElement(eventYear).clear();
        element.findElement(eventYear).sendKeys(year);
        textAssert(eventYear, year);
        element.findElement(eventMonth).clear();
        element.findElement(eventMonth).sendKeys(month);
        textAssert(eventMonth, month);
        element.findElement(eventDay).clear();
        element.findElement(eventDay).sendKeys(day);
        textAssert(eventDay, day);
        element.findElement(eventHour).clear();
        element.findElement(eventHour).sendKeys(hour);
        textAssert(eventHour, hour);
        element.findElement(eventMinutes).clear();
        element.findElement(eventMinutes).sendKeys(minutes);
        textAssert(eventMinutes, minutes);
        element.findElement(eventTitle).sendKeys(title);
        textAssert(eventTitle, title);
        element.findElement(eventDescription).sendKeys(description);
        textAssert(eventDescription, description);
        element.findElement(eventSubmitBtn).click();
        Thread.sleep(1000);
        isElementPresent(element, createEventConfirm);

    }

    public void updateEvent(String year, String month, String day, String hour,
                            String minutes, String title, String description) throws InterruptedException {
        element.findElement(calendar).click();
        element.findElement(editEvent).click();
        element.findElement(eventYear).clear();
        element.findElement(eventYear).sendKeys(year);
        textAssert(eventYear, year);
        element.findElement(eventMonth).clear();
        element.findElement(eventMonth).sendKeys(month);
        textAssert(eventMonth, month);
        element.findElement(eventDay).clear();
        element.findElement(eventDay).sendKeys(day);
        textAssert(eventDay, day);
        element.findElement(eventHour).clear();
        element.findElement(eventHour).sendKeys(hour);
        textAssert(eventHour, hour);
        element.findElement(eventMinutes).clear();
        element.findElement(eventMinutes).sendKeys(minutes);
        textAssert(eventMinutes, minutes);
        element.findElement(eventTitle).clear();
        element.findElement(eventTitle).sendKeys(title);
        textAssert(eventTitle, title);
        element.findElement(eventDescription).clear();
        element.findElement(eventDescription).sendKeys(description);
        textAssert(eventDescription, description);
        Thread.sleep(1000);
        element.findElement(updateEventBtn).click();
        isElementPresent(element, updateEventConfirm);
        Thread.sleep(3000);
        element.findElement(deleteEvent).click();
        element.findElement(confirmDeleteEventBtn).click();
        isElementPresent(element, removeEventConfirm);

    }
}
