package lesson10.Part1;

public class Document {
    static String dokument;

    public static void dokumentBlok (String dokument) {

        String [] array = dokument.split("-");
        for (int i = 0; i < array.length; i++) {
            try {
                int printInt = Integer.parseInt(array[i].trim());
                System.out.print(printInt);
            }
            catch (NumberFormatException nfe) {
            }
        }
    }

    public static void dokumentLittReplacement (String dokument) {
        System.out.println("");
        String [] array = dokument.split("-");
        for (int i = 0; i < array.length; i++) {
            try {
                int printInt = Integer.parseInt(array[i].trim());
            }
            catch (NumberFormatException nfe) {
                int lineLrngh = array[i].length();
                if(lineLrngh == 3) {
                    String printLine = array[i];
                    array[i] = printLine.replace(printLine, "***");

                }
            }
        }
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + "-");
        }
        System.out.print(array[array.length - 1]);
    }

    public static void allLetters (String dokument) {
        System.out.println("");
        String [] array = dokument.split("-");
        for (int j = 0; j < array.length; j++) {
            boolean trueLetter = false;
            char[] chars = (array[j].toCharArray());
            for (int s = 0; s < chars.length; s++) {
                try {
                    int k = Integer.parseInt(String.valueOf(chars[s]));
                } catch (NumberFormatException e) {

                    String string = (String.valueOf(chars[s])).toLowerCase();
                    System.out.print(string);
                    trueLetter = true;
                }

            }
            if(trueLetter && j != array.length-1 ) {
                System.out.print("/");
            }
        }
    }

    public static void findLitterPrintUP (String dokument) {
        String litterPrintUp = dokument.replaceAll("[0-9-]+", "/").toUpperCase();
        System.out.println("\n" + litterPrintUp);
    }

    public static void findLittersPrint (String dokument, String findLitters) {
        System.out.println("В документе " + findLitters + ": " + dokument.toLowerCase().contains(findLitters.toLowerCase()));

    }

    public static void startfind (String dokument, String startFinDok) {
        boolean start;
        start = dokument.startsWith(startFinDok);
        System.out.println("Начинается ли документ с " + startFinDok + ": " + start);
    }

    public static void finishfind (String dokument, String finishFindDok) {
        boolean finish;
        finish = dokument.endsWith(finishFindDok);
        System.out.println("Заканчивается ли документ с " + finishFindDok + ": " + finish);
    }

}
