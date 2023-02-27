package Class23;

public class Task1 {

    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new HP()};
        for (Computer c:computers) {
            c.playVideo();
            c.browseInternet();
        }
    }
}
    class Computer{
        int RAM;
        int Storage;
        String OS;
        void playVideo(){
            System.out.println("Video is playing");
        }
        void browseInternet(){
            System.out.println("Browse the internet");
        }
    }

    class Apple extends Computer{
        @Override
        void playVideo() {
            System.out.println("Playing the V on quicktime player");
        }
        @Override
        void browseInternet() {
            System.out.println("Browsing the Internet using Safari");
        }

        void editVideos(){
            System.out.println("Editing on Imovies");
        }

        void installApp(){
            System.out.println("Installing the app from App Store");
        }
    }
    class HP extends Computer{
        @Override
        void browseInternet() {
            System.out.println("Browsing using Chrome");
        }
        void PlayVideo(){
            System.out.println("Playing the video using VLC player");
        }
    }

