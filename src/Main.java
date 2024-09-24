import Classes.TasksManager;
import Classes.Priority;
import Classes.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Task> tasks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        TasksManager tm = new TasksManager(tasks);

        int res = 0;
        while (res != 6) {
            System.out.println("""
                    1. Load Tasks
                    2. Write Tasks
                    3. Show Tasks (in priority order)
                    4. Add new task
                    5. Mark task as completed
                    6. Salir
                    """);
            res = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer después de nextInt()
            
            switch (res) {
                case 1:
                    tm.readFile();
                    System.out.println("File read successfully");
                    break;
                case 2:
                    tm.writeFile();
                    System.out.println("Info written successfully");
                    break;
                case 3:
                    tm.sortTasks();
                    tm.showTasks();
                    break;
                case 4:
                    System.out.println("Write the task title");
                    String title = sc.nextLine();
                    
                    System.out.println("Write the task description");
                    String desc = sc.nextLine();
                    
                    System.out.println("Write the task priority (1 = LOW, 2 = MID, 3 = HIGH)");
                    int priorityInput = sc.nextInt();
                    sc.nextLine();
                    
                    Priority priority = switch (priorityInput) {
                        case 1 -> Priority.LOW;
                        case 2 -> Priority.MID;
                        case 3 -> Priority.HIGH;
                        default -> throw new IllegalArgumentException("Invalid priority level");
                    };
                    
                    tm.addTask(title, desc, priority);
                    System.out.println("Task added successfully");
                    break;
                    
                case 5:
                    System.out.println("Write the task title");
                    String completedTitle = sc.nextLine();
                    tm.deleteCompletedTask(completedTitle);
                    System.out.println("Task marked as completed");
                    break;
                    
                case 6:
                    System.out.println("Bye.......");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
        sc.close();
    }

    public static void bubbleSort(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position: " + i + " Value: " + array[i]);
        }
    }
}
