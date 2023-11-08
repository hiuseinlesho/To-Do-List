import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String TITLE = "To-Do List Application\n";
    public static final String MENU = "1. Add Task\n"
            + "2. Mark Task as Completed\n"
            + "3. Delete Task\n"
            + "4. Display List\n"
            + "5. Exit\n";
    public static final String MESSAGE = "Enter your choice: ";
    private static final String FILENAME = "tasks.txt";

    public static void main(String[] args) {
        System.out.println(TITLE);

        Scanner scanner = new Scanner(System.in);

        List<String> statusType = List.of("completed", "uncompleted");
        List<Task> tasks = loadTasksFromFile();
        System.out.println();

        System.out.println(MENU);
        System.out.print(MESSAGE);
        int n = Integer.parseInt(scanner.nextLine());

        while (n != 5) {

            boolean isInRange = true;

            switch (n) {
                case 1:

                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();

                    Task task = new Task(description, statusType.get(1));
                    tasks.add(task);

                    System.out.println("\nTask added: " + description + "\n");
                    break;
                case 2:

                    System.out.print("Enter task number to mark as completed: ");
                    int indexToMark = Integer.parseInt(scanner.nextLine()) - 1;

                    isInRange = checkIndex(indexToMark, tasks.size());

                    if (isInRange == false) {
                        while (isInRange != true) {
                            indexToMark = tryAgain(scanner) - 1;

                            isInRange = checkIndex(indexToMark, tasks.size());
                        }
                    }

                    tasks.get(indexToMark).setStatus(statusType.get(0));

                    System.out.println("\nTask marked as completed: " + tasks.get(indexToMark).getDescription() + "\n");
                    break;
                case 3:

                    System.out.print("Enter task number to delete: ");
                    int indexToDelete = Integer.parseInt(scanner.nextLine()) - 1;

                    isInRange = checkIndex(indexToDelete, tasks.size());

                    if (isInRange == false) {
                        while (isInRange != true) {
                            indexToDelete = tryAgain(scanner) - 1;

                            isInRange = checkIndex(indexToDelete, tasks.size());
                        }
                    }

                    Task deletedTask = tasks.get(indexToDelete);

                    tasks.remove(indexToDelete);

                    System.out.println("\nDeleted task: " + deletedTask.getDescription() + "\n");
                    break;
                case 4:
                    System.out.println();

                    if (tasks.isEmpty()) {
                        System.out.println("List is empty!");
                        n = tryAgain(scanner);
                        continue;
                    }

                    printList(tasks);
                    break;
                case 5:

                    n = 5;
                    continue;
            }

            if (n < 1 || n > 5) {
                n = tryAgain(scanner);
                continue;
            }

            System.out.println(MENU);
            System.out.print(MESSAGE);
            n = Integer.parseInt(scanner.nextLine());

        }

        System.out.println();
        saveTasksToFile(tasks);
        System.out.println("Goodbye!");

    }

    private static int tryAgain(Scanner scanner) {
        System.out.println("\nInvalid input!");
        System.out.print("Try again: ");
        int n = Integer.parseInt(scanner.nextLine());
        return n;
    }


    private static boolean checkIndex(int index, int size) {

        if (index < 0 || index > size) {

            return false;
        }

        return true;
    }

    private static void printList(List<Task> tasks) {

        System.out.println("Below is list of all your tasks:");

        for (int i = 0; i < tasks.size() ; i++) {
            System.out.printf("%d %s\n", i + 1, tasks.get(i));
        }

        System.out.println();

    }

    private static List<Task> loadTasksFromFile() {
        List<Task> tasks = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line = reader.readLine();

            if (line == null) {
                return tasks;
            }

            while (line != null) {
                String[] tokens = line.split(" - ");

                String description = tokens[0];
                String status = tokens[1];

                Task task = new Task(description, status);
                tasks.add(task);

                line = reader.readLine();
            }
            System.out.println("Tasks loaded from " + FILENAME);
        } catch (IOException e) {
            System.out.println("Error loading tasks from file: " + e.getMessage());
        }
        return tasks;
    }

    private static void saveTasksToFile(List<Task> tasks) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Task task : tasks) {
                writer.println(task);
            }
            System.out.println("Tasks saved to " + FILENAME);
        } catch (IOException e) {
            System.out.println("Error saving tasks to file: " + e.getMessage());
        }
    }

}
