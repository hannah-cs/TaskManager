public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        Task task1 = new Task("Create classes", "Create classes and interfaces for task manager", "High", "In Progress", 001);
        Task task2 = new Task("Test code", "Ensure code works as expected", "Medium", "Not started", 002);
        Task task3 = new Task("Push to GitHub", "Push code to GitHub and create pull request for teammate to review", "Low", "Not started", 003);

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        task1.markComplete();
        task2.markInProgress();

        taskList.viewTasks();
    }
}