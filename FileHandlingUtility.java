import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandlingUtility {

    /**
     * Method to write to a file
     * @param fileName The name of the file to write to
     * @param content The content to write to the file
     */
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    /**
     * Method to read from a file
     * @param fileName The name of the file to read from
     */
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    /**
     * Method to modify a file by appending content
     * @param fileName The name of the file to modify
     * @param content The content to append to the file
     */
    public static void modifyFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.append(content);
            System.out.println("Successfully modified the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Writing to a file
        writeFile(fileName, "This is the original content of the file.\n");

        // Reading from the file
        System.out.println("Reading from the file:");
        readFile(fileName);

        // Modifying the file by appending new content
        modifyFile(fileName, "This is the appended content.\n");

        // Reading from the file again to see the modifications
        System.out.println("Reading from the file after modification:");
        readFile(fileName);
    }
}
