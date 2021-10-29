import java.util.Scanner;

public class FromCons {
    static String saidString;
    static int saidInt;


    public static String fromConsString(){
        Scanner scan = new Scanner(System.in);
        saidString = scan.nextLine();
        return saidString;
    }
    public static int fromConsInt(){
        Scanner scan = new Scanner(System.in);
        saidInt = scan.nextInt();
        return saidInt;
    }
}
