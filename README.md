# To-Do List Application with File I/O

This is a console-based To-Do List application implemented in Java. The application allows users to manage their tasks by adding, marking as completed, and deleting tasks. Additionally, the To-Do List supports file I/O, enabling users to save their tasks to a text file and load them back later.

## Features

- Add tasks to your to-do list.
- Mark tasks as completed.
- Delete tasks from your list.
- Save tasks to a text file.
- Load tasks from a text file.

## How to Use

1. Clone the repository to your local machine.
2. Compile the Java file: `javac TodoList.java`
3. Run the program: `java TodoList`
4. Follow the on-screen instructions to manage your to-do list.
5. Tasks will be automatically saved to `tasks.txt` when you exit the program and loaded back when you start the program.

## File I/O Details

- **Saving Tasks:**
  - Tasks are saved to the `tasks.txt` file in the same directory as the application.
  - When you choose to exit the application, tasks are automatically saved to the file.

- **Loading Tasks:**
  - Tasks are loaded from the `tasks.txt` file when you start the application.
  - If the file doesn't exist or there is an error loading tasks, the application will start with an empty to-do list.

## Example

To-Do List Application

Add Task
Mark Task as Completed
Delete Task
Exit
Enter your choice: 1
Enter task description: Complete coding assignment

Task added: Complete coding assignment

Add Task
Mark Task as Completed
Delete Task
Exit
Enter your choice: 4
Tasks saved to tasks.txt
Goodbye!

(Next time you run the application...)

To-Do List Application
Tasks loaded from tasks.txt

Complete coding assignment

Add Task

Mark Task as Completed

Delete Task

Exit
