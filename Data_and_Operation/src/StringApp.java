public class StringApp {
    public static void main(String[] args) {

        //Character vs  String
        System.out.println("Hello World");  //String
        //System.out.println('Hello World');  //''는 특수한 data type. character형 == 한 글자를 표현하는 data type
        System.out.println('H');    //Character
        System.out.println("H");    //String형. 이거 가능

        // New Line
        System.out.println("Hello" +
                "World");   //Hello World
        System.out.println("Hello \nWorld");    //\n은 new line. Hello (enter) World

        // escape
        System.out.println("Hello \"World\"");  //Hello "World"
    }
}
