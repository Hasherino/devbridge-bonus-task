package devbridgetask;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "file_with_strings.txt";

        TxtFileProcessor.filterStrings(fileName);
    }
}