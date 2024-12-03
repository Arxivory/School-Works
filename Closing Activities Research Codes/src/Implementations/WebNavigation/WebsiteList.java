package Implementations.WebNavigation;
/*
    Author: Vince Aivan P. Rumalay
    Section: BSCS2A
    Institution: Centro Escolar University
    Date Created: November 29 - December 3, 2023
*/
public class WebsiteList {
    Website head;
    Website tail;

    public WebsiteList() {
    }

    public void addWebsite(String websiteName, String url) {
        Website newWebsite = new Website(websiteName, url);
        if (head == null) {
            head = newWebsite;
        } else {
            Website traverser = head;
            while (traverser.next != null) {
                traverser = traverser.next;
            }
            traverser.next = newWebsite;
            tail = newWebsite;
            traverser.next.prev = traverser;
        }
    }

    public void displayWebsitesForwards() {
        System.out.println("[Your Visited Websites from: " + head.websiteName + " to " + tail.websiteName + "]");
        Website traverser = head;
        while (traverser != null) {
            System.out.println("Website Name: " + traverser.websiteName);
            System.out.println("Website URL: " + traverser.url);
            System.out.println();
            traverser = traverser.next;
        }
    }

    public void displayWebsitesBackwards() {
        System.out.println("[Your Visited Websites from: " + tail.websiteName + " to " + head.websiteName + "]");
        Website traverser = tail;
        while (traverser != null) {
            System.out.println("Website Name: " + traverser.websiteName);
            System.out.println("Website URL: " + traverser.url);
            System.out.println();
            traverser = traverser.prev;
        }
    }
}

class Website {
    String websiteName;
    String url;
    Website next;
    Website prev;
    public Website() {}
    public Website(String websiteName, String url) {
        this.websiteName = websiteName;
        this.url = url;
        next = prev = null;
    }
}