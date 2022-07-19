package arquivos;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    
    private static Formatter output;

    public static void main(String[] args) {
        
        openFile();
        addRecords();
        closeFile();
        
    }

    public static void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");;
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opeing file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s\n%s\n? ", "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end scanner.");

        while (scanner.hasNext()) {
            try {
                output.format("%d %s %s %.2f\n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid scanner. Please try again.");
                scanner.nextLine();
            }

            System.out.println("? ");
        }
    }

    public static void closeFile() {
        if(output != null) {
            output.close();
        }
    }
}
