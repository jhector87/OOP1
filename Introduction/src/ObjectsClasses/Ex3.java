package ObjectsClasses;

public class Ex3 {


    public static void main(String[] args) {
        String hello = "Hello, World";
        String holle = hello.replace("e", "%");
        holle.replace("o", "e");
        holle.replace("%", "o");

        System.out.println(holle);
    }
}
