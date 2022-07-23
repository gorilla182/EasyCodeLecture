package lecture25.homeWork;


public abstract class Worker {
    private final Task.Status status;
    private final String name;


    protected Worker(Task.Status status, String name) {
        this.status = status;
        this.name = name;
    }

    public void doTask(Task task) {
        System.out.println(getClass().getSimpleName() + " " + name + " делает задачу " + getDetails(task));
    }

    protected abstract String getDetails(Task task);

    public Task.Status getTaskStatus (){
        return status;
    }
    protected abstract Task getTaskWhenDone(Task task);
}

