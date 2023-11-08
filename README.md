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

## Screenshots

![To-Do List Overview](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/b8918f12-2b3d-414f-b92d-848c6111f67b)

Firstly tasks.txt is empty

![empty tasks txt](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/8088d787-83c4-43e8-bd78-f1818549b383)

Add task

![To-Do List Add task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/b5e9ab4e-5386-4ba3-be95-7cffeaeeb87c)

Now we can see that task is uploaded to tasks.text file

![tasks txt added task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/1396fa42-dc6d-477e-8930-1f995b214a79)

Mark task as completed

![To-Do List Mark task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/11da6343-7eb1-428c-8902-5271a5d8abeb)

![tasks txt complete task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/d48c743e-7afa-4574-91c1-b5aa36245c24)

And delete task

![To-Do List Delete task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/9305b9b5-c526-412f-b645-109d2f0f3489)

![tasks txt delete task](https://github.com/hiuseinlesho/To-Do-List/assets/133807047/a6c487ca-fa23-4fd9-ab4c-426a4974f7b8)




