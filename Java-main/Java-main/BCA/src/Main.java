
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.next();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println(name+" has been saved as name");
        System.out.println(age+" has been saved as age");

    }
}