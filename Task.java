public class Task implements Taskable {
    String title;
    String description;
    String priority;
    String status;

    @Override
    public void markInProgress() {
        this.status = "In Progress";
    }

    @Override
    public void markComplete() {
        this.status = "Completed";
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public Task(String title, String description, String priority, String status, int id) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Title: " + this.title
                + "\nDescription: " + this.description
                + "\nPriority: " + this.priority
                + "\nStatus: " + this.status;
    }
}
