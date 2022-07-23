package lecture25.homeWork;

public class Task {
    private final int id;
    private final Status status;
    private final String description;

    public Task(int id, Status status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    enum Status{
    ASSEMBLING_REQUIREMENTS,
    READY_TO_GO,
    IN_PROGRESS,
    READY_FOR_TESTING,
    DONE
}
}

