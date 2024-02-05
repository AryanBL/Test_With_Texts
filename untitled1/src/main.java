import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Aryan.age();
        Aryan.printHi();
        Scanner scanner = new Scanner(System.in);
        System.out.println(args[0]);
        System.out.println("what is your name ? :");
        String name =scanner.nextLine();
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food ? :");
        String food=scanner.nextLine();

        System.out.println();
        System.out.println("Hello "+name);
        System.out.println("your age is "+age);
        System.out.println("Your favorite food is "+food);
    }
}
