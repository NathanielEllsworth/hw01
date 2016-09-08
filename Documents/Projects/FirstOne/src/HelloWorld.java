import java.util.Scanner;

/**
 * Created by nathanielellsworth on 9/6/16.
 */
public class HelloWorld {

    public static void main(String[] args){

        {Scanner reader = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String n = reader.nextLine();
        System.out.println("You chose " +n);}

        {Scanner reader = new Scanner(System.in);
        System.out.println("Enter a age: ");
        String n = reader.nextLine();
        System.out.println("You chose " +n);}

        {Scanner reader = new Scanner(System.in);
        System.out.println("Enter an e-mail: ");
        String n = reader.nextLine();
        System.out.println("You chose " +n);}
    }
}
