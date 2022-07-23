package lecture25.homeWork;

public class Coder extends Worker{
    protected Coder(String name) {
        super(Task.Status.IN_PROGRESS, name);
    }

    @Override
    protected String getDetails(Task task) {
        return " задача id: " + task.getId() + " описание: " +task.getDescription();
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription()
        );

    }

}
