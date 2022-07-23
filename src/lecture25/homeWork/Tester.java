package lecture25.homeWork;

public class Tester extends Worker{
    protected Tester(String name) {
        super(Task.Status.READY_FOR_TESTING, name);
    }

    @Override
    protected String getDetails(Task task) {
        return "задача id: " + task.getId() + " описание: " + task.getDescription();
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(task.getId(), Task.Status.DONE, task.getDescription());
    }


}
