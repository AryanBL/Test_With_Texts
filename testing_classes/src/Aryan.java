import java.util.Scanner;
public class Aryan {
    public static void main(String[] args){
        System.out.println("what is your name ?");
        sayYourName();
    }
    public static void sayYourName(){
        int a=1;
        System.out.println(5+7+"is the result");
        String name1="aryan";
        String name2="aryan";
        name2="nori";
        Scanner in=new Scanner(System.in);
        String name=in.next();
        int [] c= new int[5];
        System.out.println(name1);
        System.out.println(name2);
        String [] d=new String[2];
        d[0]="This is a string";
        readInput();

    }
    public static void readInput(){
        Scanner scanner= new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number : ");
        a=scanner.nextInt();
        System.out.print("Enter the second number : ");
        b=scanner.nextInt();
        c=a+b;
        System.out.println("the result is :"+c);
    }

}
