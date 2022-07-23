package lecture25.homeWork;

public class Designer extends Worker{
    protected Designer( String name) {
        super(Task.Status.ASSEMBLING_REQUIREMENTS, name);
    }

    @Override
    protected String getDetails(Task task) {
        return "задача ID " + task.getId() + " описание: " + task.getDescription();
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(task.getId(), Task.Status.READY_TO_GO,
                task.getDescription());
    }



}
