import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                return; // Exit the loop after deletion
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }
}
