package Class12;

public class TesterBMW {
    public static void main(String[] args) {
        CarTesters bmw=new CarTesters();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Gray";
        bmw.applyBrake();
        bmw.moveForward();

        CarTesters audi=new CarTesters();
        audi.model="E=tron";
        audi.make="Audi";
        audi.year=2022;
        audi.color="black";
        audi.moveForward();
    }
}

