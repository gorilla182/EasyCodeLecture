package lecture25.fromLecture;

public class Main {
    public static void main(String[] args) {
        Repository<MyData> myDataDataSource = new Repository<>(new MyDataCloudDataSource(), new CachedDataSource<>());
        MyData data =   myDataDataSource.getData();
        System.out.println(data.toString());
    }
}
