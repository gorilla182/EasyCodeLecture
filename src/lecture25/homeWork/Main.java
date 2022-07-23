package lecture25.homeWork;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(1, Task.Status.ASSEMBLING_REQUIREMENTS,"Сделать сайт");
        Designer designer = new Designer("Иван");
        Tester tester = new Tester("Петр");
        Coder coder = new Coder("Олег");
        designer.doTask(designer.getTaskWhenDone(task));
    }
}
