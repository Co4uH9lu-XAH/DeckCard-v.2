public class PrisonerSays {

    public static void introductorySpeech() throws InterruptedException {
        String speech = "Здорово! Как звать?";
        char[] charArray = speech.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(100);
            System.out.print(chArray);
        }
        System.out.println("");
    }

    public static void letsPlay() throws InterruptedException {
        String play = "Давай играть, " + FromCons.saidString + ". Сколько карт тянешь?";
        char[] charArray = play.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(100);
            System.out.print(chArray);
        }
        System.out.println("");
    }
    public static void space () throws InterruptedException {
        String speech = "Давай все же назовешься подлинее.";
        char[] charArray = speech.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(100);
            System.out.print(chArray);
        }
        System.out.println("");
    }
    public static void twiceSpace () throws InterruptedException {
        String speech = "Пробел, так пробел.";
        char[] charArray = speech.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(100);
            System.out.print(chArray);
        }
        System.exit(0);
    }

    public static void noEnter() {
        System.out.println("A? Не слышу...");
    }

    public static void hitler() {
        System.out.println("Aаааааа!!! Охрана, у меня в камере Гитлер! Выпустите меня отсюда!!!!!");
    }

    public static void negativeNumber() {
        System.out.println("Шутить изволите? Так сколько карт?");
    }

    public static void twiceNegativeNumber() {
        System.out.println("Ну и не надо");
    }

    public static void zero() {
        System.out.println("Не хочешь, не надо. Я пошел.");
    }

    public static void moreThenDeck() {
        System.out.println("Столько нету. Их всего 36.");
    }

    public static void notNumber() {
        System.out.println("АллЁ! Число надо! Ты знаешь, что такое число?");
    }
    public static void twiceNotNumber() {
        System.out.println("А я предупреждал. Смерть тебе через тумба-юмбу.");
    }
}

