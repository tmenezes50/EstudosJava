package arquivos;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CreateSequencialFile {
    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clientes.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s\n%s\n", "Enter number, first name, last name and balance: ", "Enter end-of-file indicator to end input");

        while (scanner.hasNext()) {
            try {
                Account record = new Account(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                output.writeObject(record);
            } catch (NoSuchElementException elementException) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }

            System.out.print("?");
        }


    }
    
    public static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
