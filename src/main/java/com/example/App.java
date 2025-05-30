package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win64\\chromedriver.exe");

        System.out.println("Проверка работы Selenium...");
        testSelenium();

        System.out.println("\nПолучение IP-адреса...");
        Task2.getIPAddress();

        System.out.println("\nПолучение прогноза погоды...");
        Task3.getWeatherForecast();
    }

    public static void testSelenium() {
        WebDriver webDriver = new ChromeDriver();
        try {
            webDriver.get("https://www.calculator.net/password-generator.html");
            System.out.println("Успешно загружена страница: " + webDriver.getTitle());
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Ошибка:");
            System.out.println(e.toString());
        } finally {
            webDriver.quit();
        }
    }
}