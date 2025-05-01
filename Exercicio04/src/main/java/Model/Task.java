package Model;

public class Task {
    private int id;
    private String description;
    private int userId;

    public Task() {
    }

    public Task(int id, String description, int userId) {
        this.id = id;
        this.description = description;
        this.userId = userId;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
