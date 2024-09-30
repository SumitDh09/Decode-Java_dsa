package TaskManagementSystem;

import java.util.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Interface for task operations
interface TaskOperations {
    void markAsComplete();
    void assignTo(User user);
}


// Abstract class for common task properties
abstract class AbstractTask implements TaskOperations {
    private String id;
    private String title;
    private String description;
    private Date dueDate;
    private boolean isComplete;
    private User assignedUser;

    public AbstractTask(String title, String description, Date dueDate) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    public boolean isComplete() { return isComplete; }
    public User getAssignedUser() { return assignedUser; }

    @Override
    public void markAsComplete() {
        this.isComplete = true;
    }

    @Override
    public void assignTo(User user) {
        this.assignedUser = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", isComplete=" + isComplete +
                ", assignedUser=" + (assignedUser != null ? assignedUser.getName() : "Unassigned") +
                '}';
    }
}

// Concrete task class
class Task extends AbstractTask {
    private String category;

    public Task(String title, String description, Date dueDate, String category) {
        super(title, description, dueDate);
        this.category = category;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return super.toString() + ", category='" + category + '\'';
    }
}

class User {
    private String id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class TaskManager {
    private List<Task> tasks;
    private List<User> users;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public Task getTaskById(String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User getUserById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Create users
        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Bob", "bob@example.com");
        taskManager.addUser(user1);
        taskManager.addUser(user2);

        // Create tasks
        Task task1 = new Task("Implement login", "Create login functionality", new Date(), "Development");
        Task task2 = new Task("Design homepage", "Create homepage mockup", new Date(), "Design");
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Assign tasks
        task1.assignTo(user1);
        task2.assignTo(user2);

        // Mark task as complete
        task1.markAsComplete();

        // Print all tasks
        System.out.println("All Tasks:");
        taskManager.getAllTasks().forEach(System.out::println);

        // Print all users
        System.out.println("\nAll Users:");
        taskManager.getAllUsers().forEach(System.out::println);
    }
}