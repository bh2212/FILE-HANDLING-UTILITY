# FILE-HANDLING-UTILITY

COMPANY: CODTECH IT SOLUTIONS

NAME: BHUVANESHWARI.K

INTERN ID: CT12LUW

DOMAIN: JAVA PROGRAMMING

DURATION: 8 WEEKS

MENTOR: NEELA SANTOSH

##DESCRIPTION OF TASK: The file handling utility task has been successfully runned in the eclipse software platform. 

### Explanation:

1. **writeFile** method:
   - This method writes the provided content to a file.
   - `BufferedWriter` and `FileWriter` are used to write the content.
   - The `try-with-resources` statement ensures that the writer is closed after the operation.
   - If an error occurs during the writing process, an exception is caught and an error message is printed.

2. **readFile** method:
   - This method reads the content of a file and prints it to the console.
   - `BufferedReader` and `FileReader` are used to read the file content line by line.
   - The `try-with-resources` statement ensures that the reader is closed after the operation.
   - If an error occurs during the reading process, an exception is caught and an error message is printed.

3. **modifyFile** method:
   - This method appends new content to the existing file.
   - The `FileWriter` constructor is called with a second argument `true` to enable appending mode.
   - If an error occurs during the modification process, an exception is caught and an error message is printed.

4. **main** method:
   - The main method demonstrates the usage of the `writeFile`, `readFile`, and `modifyFile` methods.
   - It writes initial content to a file, reads and prints the content, appends new content, and reads and prints the modified content.

### How to Run:

1. Save the code in a file named `FileHandlingUtility.java`.
2. Open a terminal and navigate to the directory containing the file.
3. Compile the program using the following command:
   
   javac FileHandlingUtility.java
   
4. Run the compiled program using the following command:
   
   java FileHandlingUtility
   
5. The program will create a file named `example.txt`, write initial content to it, read and print the content, append additional content, and read and print the modified content. The expected output will be displayed in the terminal.

   ### Output:

Successfully wrote to the file.
Reading from the file:
This is the original content of the file.
Successfully modified the file.
Reading from the file after modification:
This is the original content of the file.
This is the appended content.
