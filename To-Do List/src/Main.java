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

    public static void main(String[] args) {
        System.out.println(TITLE);

        Scanner scanner = new Scanner(System.in);

        List<String> statusType = List.of("completed", "uncompleted");
        List<Task> list = new ArrayList<>();

        System.out.println(MENU);
        System.out.print(MESSAGE);
        int n = Integer.parseInt(scanner.nextLine());

        while (n != 5) {

            switch (n) {
                case 1:

                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();

                    Task task = new Task(description, statusType.get(1));
                    list.add(task);

                    System.out.println("\nTask added: " + description + "\n");
                    break;
                case 2:

                    System.out.print("Enter task number to mark as completed: ");
                    int indexToMark = Integer.parseInt(scanner.nextLine()) - 1;

                    list.get(indexToMark).setStatus(statusType.get(0));

                    System.out.println("\nTask marked as completed: " + list.get(indexToMark).getDescription() + "\n");
                    break;
                case 3:

                    System.out.print("Enter task number to delete: ");
                    int indexToDelete = Integer.parseInt(scanner.nextLine()) - 1;

                    Task deletedTask = list.get(indexToDelete);

                    list.remove(indexToDelete);

                    System.out.println("\nDeleted task: " + deletedTask.getDescription() + "\n");
                    break;
                case 4:
                    System.out.println();

                    printList(list);
                    break;
                case 5:

                    n = 5;
                    continue;
            }

            if (n < 1 || n > 5) {
                System.out.println("\nInvalid input!");
                System.out.print("Try again: ");
                n = Integer.parseInt(scanner.nextLine());
                continue;
            }

            System.out.println(MENU);
            System.out.print(MESSAGE);
            n = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("\nGoodbye!");

    }

    private static void printList(List<Task> list) {

        System.out.println("Below is list of all your tasks:");

        for (Task task : list) {

            System.out.println(task);
        }

        System.out.println();

    }

}
