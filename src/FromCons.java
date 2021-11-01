import java.util.Scanner;

public class FromCons {
    static String saidString;
    static int saidInt;


    public static void fromConsString() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        saidString = scan.nextLine();
        while (saidString.equals("")) {
            PrisonerSays.noEnter();
            saidString = scan.nextLine();
        }
        if (saidString.equalsIgnoreCase("гитлер")) {
            PrisonerSays.hitler();
            System.exit(0);

        } else if (saidString.equals(" ")){
            PrisonerSays.space();
            saidString = scan.nextLine();
            if (saidString.equals(" ")){
                PrisonerSays.twiceSpace();
            }
        }
    }

    public static void fromConsInt() {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextInt()) {
            PrisonerSays.notNumber();
            scan = new Scanner(System.in);
            if (!scan.hasNextInt()) {
                PrisonerSays.twiceNotNumber();
                System.exit(0);
            }
        } else if (scan.equals("")) {
                PrisonerSays.notNumber();
                scan = new Scanner(System.in);
                if (scan.equals("")) {
                    PrisonerSays.twiceNotNumber();
                    System.exit(0);
                } // На жмяканье Enter почему-то, не работает. Enter вообще не участвует в этой части программы.
                  // просто курсор вниз спускает. Наверное, не баг, а фича.
            } else {
                saidInt = scan.nextInt();
                if (saidInt == 0) {
                    PrisonerSays.zero();
                    System.exit(0);
                } else if (saidInt < 0) {
                    PrisonerSays.negativeNumber();
                    saidInt = scan.nextInt();
                    if (saidInt < 0) {
                        PrisonerSays.twiceNegativeNumber();
                        System.exit(0);
                    }
                } else if (saidInt > 36) {
                    PrisonerSays.moreThenDeck();
                    saidInt = scan.nextInt();
                    if (saidInt > 36) {
                        PrisonerSays.twiceNegativeNumber();
                        System.exit(0);
                    }
                }
            }
        }
    }

