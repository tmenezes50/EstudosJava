package arquivos;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class ReadSenquentialFile {
    private static ObjectInput input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }


    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccountNumber(), record.getFirstName(), record.getLastName(), record.getBalance());
            }
        } catch (EOFException endOfFileEofException) {
            System.out.printf("\nNo more records\n");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Invalid object type. Terminating.");
        } catch (IOException ioException) {
            System.out.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile() {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}   
