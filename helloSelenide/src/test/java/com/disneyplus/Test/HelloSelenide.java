package com.disneyplus.Test;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static org.testng.AssertJUnit.assertEquals;

public class HelloSelenide {

    @Test
    public void OnAir(){

        String plusTitle = "Disney+ | O melhor da Disney, Marvel, Pixar, Star Wars e National Geographic em um só lugar.";

        isChrome();
        open("https://www.disneyplus.com/pt-br");
        assertEquals(title(), plusTitle);
    }
}
