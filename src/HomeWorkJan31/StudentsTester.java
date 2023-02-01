package HomeWorkJan31;

public class StudentsTester {
    public static void main(String[] args) {
        Students std=new Students("Zafar",80,90,100);
        Students std1=new Students("Sardar",80,75,100);
        Students std2=new Students("Hamid",99,70,77);
        Students std3=new Students("Aisha",80,70,90);
        Students std4=new Students("Badmash",60,50,55);
        std.callstud();
        std1.callstud();
        std2.callstud();
        std3.callstud();
        std4.callstud();
    }
}
