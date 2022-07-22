package lecture25.fromLecture;

public class MyData {
    private final int id;
    private final String description;

    public MyData(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public String toString(){
        return "id=  " + id + ", description: " + description;
    }
}
