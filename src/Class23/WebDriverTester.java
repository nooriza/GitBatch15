package Class23;

public class WebDriverTester {
    public static void main(String[] args) {

        Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        Firefox firefox =new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLoginPage();
        firefox.closeBrowser();
    }
}
