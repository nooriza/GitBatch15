package Class14;

public class ReturnDemoTester {
    public static void main(String[] args) {
        ReturnDemo rd=new ReturnDemo();
        rd.method1();
        String str=rd.method1();
        System.out.println(str);
    }
    int method2(){
        return 20;
    }
}
