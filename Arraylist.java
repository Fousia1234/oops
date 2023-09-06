import java.util.ArrayList;
import java.util.Scanner;

public class StringListOperations {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add String");
            System.out.println("2. Remove String");
            System.out.println("3. Display Strings");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add: ");
                    String strToAdd = scanner.nextLine();
                    stringList.add(strToAdd);
                    System.out.println("String added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the index of the string to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (indexToRemove >= 0 && indexToRemove < stringList.size()) {
                        String removedString = stringList.remove(indexToRemove);
                        System.out.println("Removed: " + removedString);
                    } else {
                        System.out.println("Invalid index. No string removed.");
                    }
                    break;
                case 3:
                    System.out.println("List of Strings:");
                    for (int i = 0; i < stringList.size(); i++) {
                        System.out.println(i + ": " + stringList.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    break;
            }
        }
    }
}
