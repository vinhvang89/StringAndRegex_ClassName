import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ClassNameExample nameExample = new  ClassNameExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a classname");
        String name  = scanner.nextLine();
        nameExample.validate(name);
    }
}
