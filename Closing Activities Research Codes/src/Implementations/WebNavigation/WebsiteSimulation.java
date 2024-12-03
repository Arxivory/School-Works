package Implementations.WebNavigation;

public class WebsiteSimulation {
    public static void main(String[] args) {
        WebsiteList chrome = new WebsiteList();
        chrome.addWebsite("GitHub", "https://github.com/");
        chrome.addWebsite("LeetCode", "https://leetcode.com/");
        chrome.addWebsite("GeeksforGeeks", "https://www.geeksforgeeks.org/");

        chrome.displayWebsitesForwards();
        chrome.displayWebsitesBackwards();
    }
}
