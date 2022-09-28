package devbridgetask;

import java.io.*;
import java.util.*;

public class TxtFileProcessor {
    public static void filterStrings(String fileName) {
        List<String> allStrings = new ArrayList<String>();

        try {
            allStrings = getStringsFromFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            return;
        }

        Iterator<String> it = allStrings.iterator();
        while (it.hasNext()) {
            String line = it.next();
            char[] chArr = line.toCharArray();

            for (int i = 0; i < chArr.length - 1; i++) {
                if (Character.isDigit(chArr[i]) && Character.isDigit(chArr[i + 1])) {
                    if (Character.getNumericValue(chArr[i]) != 0) {
                        System.out.println(line);
                        break;
                    }
                }
            }
        }
    }

    private static List<String> getStringsFromFile(String fileName) throws FileNotFoundException {
        List<String> strings = new ArrayList<String>();

        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext()) {
            String line = sc.nextLine();
            
            strings.add(line);
        }

        return strings;
    }
}