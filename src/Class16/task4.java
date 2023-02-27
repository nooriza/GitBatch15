package Class16;

public class task4 {
    public static void main(String[] args) {
        /*
        Crate a method that will say Hello
        in different language based on the country that will be passed when
        method is executed

        return type: String void
        name =sayHello
        Parameter=>String CountryName

         */
        task4 task4 = new task4();
        System.out.println(task4.sayHello("Italy"));
    }
    String sayHello(String countryName) {
        switch (countryName){
            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "Chine":
                return "Ni Hao";
            default:
                return "Country not supported";
        }
    }
}
