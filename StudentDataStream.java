import java.io.*;
import java.util.Scanner;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Store Student Details");
            System.out.println("2. Retrieve Student Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    storeStudentDetails(scanner);
                    break;
                case 2:
                    retrieveStudentDetails();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Store student details in a binary file
    private static void storeStudentDetails(Scanner scanner) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter GPA: ");
            float gpa = scanner.nextFloat();

            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeFloat(gpa);

            System.out.println("Student details stored successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Retrieve and display student details
    private static void retrieveStudentDetails() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("\nStored Student Details:");
            while (dis.available() > 0) { // Check if data is available
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                float gpa = dis.readFloat();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No student records found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
