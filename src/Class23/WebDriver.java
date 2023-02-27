package Class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void openURL(){
        System.out.println("Opening a URL");

    }
    public void testLoginPage(){
        System.out.println("Checking if login page works");
    }

    public void closeBrowser(){
        System.out.println("CLosing the Browser");

    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page inn Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening the Safari Browser");
    }

    @Override
    public void openURL() {
        super.openURL();
        System.out.println("Opening the URL");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing Login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("CLosing the Browser");

    }
}
class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("Opening the FireFox Browser");
    }

    @Override
    public void openURL() {
        super.openURL();
        System.out.println("Opening the URL in FirFox");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page in Firefox ");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("Closing the Browser");
    }
}
